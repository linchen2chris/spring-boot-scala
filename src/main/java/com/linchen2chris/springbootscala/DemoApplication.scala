object DemoApplication {
  def main(args: Array[String]) = {
    for (arg <- args) {
      println(arg + ": hello" + isEven(arg));
    }
  }
}
