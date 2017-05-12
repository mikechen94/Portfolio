package main

import bc.ByteCode
import vm.VirtualMachine

class ByteCodeImpl_idup(val idup: String)  extends ByteCode {


  override val code: Byte = bytecode(idup)

  override def execute(vm: VirtualMachine): VirtualMachine = {

    val (int, virtualMachine) = vm.pop()
    vm.push(int)
    vm.push(int)
    vm

  }

}
