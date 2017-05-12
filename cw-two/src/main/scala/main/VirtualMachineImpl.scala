package main

import bc.ByteCode
import factory.VirtualMachineFactory
import vm.VirtualMachine

class VirtualMachineImpl (stack: List[Byte]) extends VirtualMachine {

        var stack1= scala.collection.immutable.List.empty[Byte]
        var virtualMachine: VirtualMachine = new VirtualMachineImpl (stack1)
  //val bcp = VirtualMachineFactory.byteCodeFactory

  override def execute(bc: Vector[ByteCode]): VirtualMachine = {

        executeOne(bc)
        //virtualMachine = executeOne(bc)._2
        if (executeOne(bc)._1 == null) {
          return executeOne(bc)._2
        } else {
          execute(executeOne(bc)._1)
        }
  }

  override def executeOne (bc: Vector[ByteCode]): (Vector[ByteCode], VirtualMachine)= {

    // def apply(pair: (bc.head)): A = new A(pair._1, pair._2)
        var yy: VirtualMachine=null
        if (bc.head.code==1) {
          var kk: Array[String]= bc(0).toString.split(" ")
          var byteCodeImpl: ByteCode = new ByteCodeImpl(kk(0).toByte, kk(1).toInt)
          yy = byteCodeImpl.execute(virtualMachine)
        }else {
            var byteCodeImpl: ByteCode = new ByteCodeImpl(bc.head.code)
            yy = byteCodeImpl.execute(virtualMachine)
          }

    (bc.tail, yy)
    }


  override def push(value: Int): VirtualMachine = {
    stack1 = value.toByte ::stack1
    var virtualMachine: VirtualMachine= new VirtualMachineImpl(stack1)
    virtualMachine
  }

  override def pop(): (Int, VirtualMachine)= {

    val poppedInt = stack.head
    stack1 = stack1.tail
    val virtualMachine = new VirtualMachineImpl(stack1)
    (poppedInt, virtualMachine)
  }
  override def state: Vector[Int] = {

    val vectorStack: Vector[Int] = stack.map(_.toInt).to[Vector]
    vectorStack
  }
}



