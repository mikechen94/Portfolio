package main

import bc.ByteCode
import vm.VirtualMachine

class ByteCodeImpl_iinc(val iinc: String)  extends ByteCode {


  override val code: Byte = bytecode(iinc)

  override def execute(vm: VirtualMachine): VirtualMachine = {

    val (int, virtualMachine) = vm.pop()
    vm.push(int+1)
    vm

  }

}
