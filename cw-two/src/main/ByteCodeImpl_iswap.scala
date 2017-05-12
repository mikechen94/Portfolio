package main

import bc.ByteCode
import vm.VirtualMachine

class ByteCodeImpl_iswap(val iswap: String, val arg: Int*)   extends ByteCode {

  override val code: Byte = bytecode(iswap)

  override def execute(vm: VirtualMachine): VirtualMachine = {

    val (int1, virtualMachine1) = vm.pop()
    val (int2, virtualMachine2) = vm.pop()
    vm.push(int1)
    vm.push(int2)
    vm
  }
}