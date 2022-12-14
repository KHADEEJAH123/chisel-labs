 package LAB2
 import org.scalatest._ 
 import chiseltest._ 
 import chisel3._ 

 class mux5Test extends FreeSpec with ChiselScalatestTester {
     "MUX 5 TEST" in {
         test(new barrel_shift){ c =>
             c.io.in(0).poke(0.B)
             c.io.in(1).poke(1.B)
             c.io.in(2).poke(0.B)
             c.io.in(3).poke(1.B)          
             c.io.shift_type.poke(true.B)
             c.clock.step(10)
             c.io.sel(0).poke(1.B)
             c.io.sel(1).poke(0.B)
             c.io.out(0).expect(1.B)
             c.io.out(1).expect(0.B)
             c.io.out(2).expect(1.B)
             c.io.out(3).expect(0.B)
            
            
        }
     }
 }