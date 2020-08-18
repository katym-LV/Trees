object Tree extends App {
  var length = 3
  var symbol = "*"
  if (args.length >= 1) {
    length = args(0).toInt
    if (args.length >= 2) {
      symbol = args(1)
    }
  }

  for (line <- 1 to length) {
    println("Z" * (length - line) + symbol * (line * 2 - 1) + "Z" * (length - line))
  }
}
