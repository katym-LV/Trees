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
    if (line == 1) {
      println("Z" * (length - 1) + symbol + "Z" * (length - 1))
    } else if (line != length) {
      println("Z" * (length - line.toInt) + symbol * (line.toInt * 2 - 1) + "Z" * (length - line.toInt))
    } else {
      println(symbol * ((line.toInt - 1) * 2 + 1))
    }
  }
}
