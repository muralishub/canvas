


object Main extends App {

  def createCanvas(width: Int, height: Int): String = {

    val array = Array.ofDim[Char](height + 2, width + 2)

    for {
      row <- 0 until height + 2
      column <- 0 until width + 2
    } {
      if (row == 0 || row == height + 1) array(row)(column) = '-'
      else if (column == 0 || column == width + 1) array(row)(column) = '|'
      else array(row)(column) = ' '
    }

    array.map(row => row.mkString("")).mkString("\n")
  }
}
