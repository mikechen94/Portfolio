package main

import bc.ByteCode
import vm.VirtualMachine

/**
  * Created by Eric's laptop on 07/04/2017.
  */
class ByteCodeImpl_ineg(val ineg: String)  extends ByteCode {


  override val code: Byte = bytecode(ineg)

  override def execute(vm: VirtualMachine): VirtualMachine = {

    val (int, virtualMachine) = vm.pop()
    vm.push(-int)
    vm

  }

}
