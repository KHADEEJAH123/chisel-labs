package LAB6
import chisel3 . _
import chisel3.util._
class shift_register ( val init : Int = 1) extends Module {
    val io = IO (new Bundle {
    val in = Input ( UInt (4.W) )
    val out = Output (  UInt (4.W))
    })
val state = RegInit ( 0. U (4. W ) ) 
val variable  = RegInit ( 0. U (4. W ) )// register initialization
// serial data in at LSB
io.out:=0.U
when(variable === 0.U){ 
    variable :=1.U
    state:=io.in
    
}.otherwise{
    io.out:= state(0)
    state := state << 1   
}
}