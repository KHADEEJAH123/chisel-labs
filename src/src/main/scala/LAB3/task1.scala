package LAB3
import chisel3._
import chisel3.util._
class LM_IO_Interface_BranchControl extends Bundle {
val fnct3 = Input ( UInt (3. W ) )
val branch = Input ( Bool () )
val arg_x = Input ( UInt (32. W ) )
val arg_y = Input ( UInt (32. W ) )
val br_taken = Output ( Bool () )
//val io.out = Output (UInt (2.W))
}

class BranchControl extends Module {
val io = IO (new LM_IO_Interface_BranchControl )
// Start Coding here
val out=Wire(Bool())
out:=0.U


// End your code here
switch (io.fnct3) 
{
is ("b000".U) {out := io.arg_x === io.arg_y}
is ("b001".U) {out := io.arg_x =/= io.arg_y}
is ("b011".U) {out := io.arg_x.asSInt >= io.arg_y.asSInt}
is ("b111".U) {out := io.arg_x.asSInt <= io.arg_y.asSInt}
is ("b100".U) {out := io.arg_x >= io.arg_y}
is ("b010".U) {out := io.arg_x <= io.arg_y}
}
io.br_taken:=out && io.branch
}
