package main

import bc.ByteCode
import vm.VirtualMachine

class ByteCodeImpl_print(val iprint: String, val arg: Int*)  extends ByteCode {

  override val code: Byte = bytecode(iprint)

  override def execute(vm: VirtualMachine): VirtualMachine = {

    val (int, virtualMachine)=vm.pop()
    println(int)
    vm
  }
}
