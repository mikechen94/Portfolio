package main

import bc.ByteCode
import vm.VirtualMachine

/**
  * Created by Eric's laptop on 07/04/2017.
  */
class ByteCodeImpl_irem(val irem: String)  extends ByteCode {


  override val code: Byte = bytecode(irem)

  override def execute(vm: VirtualMachine): VirtualMachine = {

    val (int1, virtualMachine1) = vm.pop()
    val (int2, virtualMachine2) = vm.pop()
    vm.push(int1%int2)
    vm

  }

}
