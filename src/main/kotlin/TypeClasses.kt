import arrow.extension
import arrow.given
import java.nio.ByteBuffer
import java.nio.ByteBuffer.*

//metadebug

abstract class Struct
interface StructType<T: Struct> {
    val structSizeInBytes: Int
}


class IntStruct: Struct()

@extension
object IntStructType: StructType<IntStruct> {
    override val structSizeInBytes: Int = 4
}

fun <T: Struct> allocate(size: Int, type: StructType<T> = given): ByteBuffer =
    allocateDirect(size * type.structSizeInBytes)

fun main() {
    println(allocate<IntStruct>(10))
}