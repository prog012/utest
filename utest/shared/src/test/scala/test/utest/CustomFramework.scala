package test.utest

class CustomFramework extends utest.runner.Framework{
  override def setup() = {
    println("Setting up CustomFramework")
  }
  override def teardown() = {
    println("Tearing down CustomFramework")
  }
}
