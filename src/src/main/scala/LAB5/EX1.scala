// package LAB5
// import chisel3._
// import chisel3.util._
// import chisel3.stage.ChiselStage

// class eMux [ T <: Data ]( gen : T ) extends Module {
// val io = IO (new Bundle {
// val out = Output (data_type.cloneType)
// val in1 = Input ( (data_type.cloneType)
// val in2 = Input ((data_type.cloneType )
// val sel = Input ( Bool () )
// })
// io.out := Mux2_to_1 ( io.in2 , io.in1 , io.sel )
// def Mux2_to_1 [ T <: Data ]( in2 :UInt , in1:UInt , sel:Bool ) :UInt= {
// Mux( sel , in1 , in2 )

//  }
//  }