class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = { sum += b } // Why Unit? Which is the side effect here?
  // The reassignment of the variable. 
  def checksum(): Int = ~(sum & 0xFF) + 1
}
