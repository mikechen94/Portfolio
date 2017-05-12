package main

import bc.ByteCode
import vm.VirtualMachine

class ByteCodeImpl_iconst (val iconst: String, val arg: Int*) extends ByteCode {

  override val code: Byte= bytecode(iconst)

  val code1: Int=arg(0)

  override def execute(vm: VirtualMachine): VirtualMachine = {

    vm.push(arg(0))
    vm
  }

}
