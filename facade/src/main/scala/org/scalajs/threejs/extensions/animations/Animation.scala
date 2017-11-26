package org.scalajs.threejs.extensions.animations

import org.scalajs.dom
import org.scalajs.threejs.extensions.animations.Animation.{AniState, Started}

import scala.concurrent.duration.Duration
import scala.scalajs.js

class Scheduler {
  def current: Double = js.Date.now

  var animations = List.empty[Animation]

  def add(ani: Animation): Unit = {
    this.animations = ani :: animations
    ani.state = Animation.Running(current)
  }

  def tick(): Unit = {
    val now = current
    animations.foreach { ani =>
      ani.state match {
        case Animation.Running(_) => ani(now)
        case _ =>
        // dom.console.info(other.toString)
        // do nothing
      }
    }
  }

  protected def onEnterFrameFunction(double: Double): Unit = {
    this.tick()
    start()
  }

  def start(): Scheduler = {
    dom.window.requestAnimationFrame(onEnterFrameFunction _)
    this
  }


}

object Easings {

  val linear: Double => Double = i => i

}

object Animation {

  sealed trait AniState

  sealed trait Started extends AniState {
    def start: Double
  }

  case object Stopped extends AniState

  case class Finished(start: Double) extends Started

  case class Paused(start: Double) extends Started

  case class Running(start: Double) extends Started

  case class Backward(start: Double, finished: Double) extends Started

}


class Animation(val length: Duration, easing: Double => Double = Easings.linear)(fun: (Double => Unit)) {

  lazy val lengthMillis: Long = length.toMillis

  var state: AniState = Animation.Stopped

  def apply(current: Double): Unit = state match {
    case st: Started =>
      val finish: Double = st.start + this.lengthMillis
      easing(1.0 - (finish - current) / length.toMillis) match {
        case p: Double if p >= 1.0 =>
          fun(1.0)
          this.state = Animation.Finished(current)
        case p: Double if p < 0.0 =>
          dom.console.error(s"animation percent is $p that is below zero!\n " +
            s"Current time is $current, start is ${st.start} and length is $lengthMillis")
          this.state = Animation.Finished(current)
        case p: Double => fun(p)
      }

    case _ => dom.console.error("trying to run an operation that has not started")
  }

  def go(implicit scheduler: Scheduler): Unit = {
    scheduler.add(this)
  }

}
