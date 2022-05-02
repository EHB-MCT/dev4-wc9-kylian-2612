import java.io.File

fun main(args: Array<String>) {
    val reader = FileReader();
    val inputs = reader.getPuzzle2();

    var pos= 0;
    var depth = 0;

    inputs.forEach{
      var direction = it[0] as String
      var amount = it[1] as Int

      when(direction){
          "forward" -> pos += amount
          "down" -> depth += amount
          "up" -> depth -= amount
      }
    println(pos*depth)
}


    //println(reader.getPuzzle2())
    //println(reader.getPuzzle3())
    //println(reader.getPuzzle4Numbers())
    //println(reader.getPuzzle4Cards())
}
