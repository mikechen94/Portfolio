package factory

import bc.{ByteCodeFactory, ByteCodeParser}
import vendor.ProgramParser
import vm.{VirtualMachine, VirtualMachineParser}

/**
  * The `VirtualMachineFactory` follows the *factory pattern*. It provides
  * methods for each of the important parts in this assignment. You must
  * implement each method such that it returns an object of the correct type.
  */
object VirtualMachineFactory {
  // TODO
  def byteCodeFactory: ByteCodeFactory = {

    var byteCodeFactory= new main.ByteCodeFactoryImpl()
    byteCodeFactory
  }

  // TODO
  def vendorParser: ProgramParser = {

    var programParser = new main.ProgramParserImpl()
    programParser
  }

  // TODO
  def byteCodeParser: ByteCodeParser = {

    var byteCodeParser = new main.ByteCodeParserImpl()
    byteCodeParser
  }

  // TODO
  def virtualMachineParser: VirtualMachineParser = {

    var virtualMachineParser = new main.VirtualMachineParserImpl()
    virtualMachineParser
  }

  // TODO
 def virtualMachine: VirtualMachine = {

    var virtualMachine = new main.VirtualMachineImpl(List())
    virtualMachine
  }

}
