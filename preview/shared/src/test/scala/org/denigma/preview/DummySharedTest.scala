package org.denigma.preview

import utest._

object DummySharedTest extends TestSuite {
  val tests = TestSuite {
    "this is simple shared dummy test" - {
      assert(true)
    }
  }
}
