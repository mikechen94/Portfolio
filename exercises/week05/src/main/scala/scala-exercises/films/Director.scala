package films

/**
  * Created by Eric's laptop on 12/04/2017.
  */
class Director (firstName: String, lastName: String, yearOfBirth1: Int){

  def name: String = {

    val directorName0 = firstName.concat(" ")
    val directorName = directorName0.concat(lastName)
    directorName
  }

  def yearOfBirth: Int = {

    yearOfBirth1
  }

}

object Director {

  def apply(firstName: String, lastName: String, yearOfBirth1: Int): Director = {

    new Director (firstName, lastName, yearOfBirth1)
  }

  def older (director1: Director, director2: Director): Director = {

    if (director1.yearOfBirth > director2.yearOfBirth) {
      director2
    }
    else{
      director1
    }
  }

}