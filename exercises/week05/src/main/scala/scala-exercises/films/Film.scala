package films

/**
  * Created by Eric's laptop on 12/04/2017.
  */
class Film (name: String, yearOfRelease: Int, imbRating1: Double, director: Director) {

  def directorsAge : Int ={

    val dirAge = yearOfRelease - director.yearOfBirth
    dirAge
  }

  def isDirectedBy (director1: Director): Boolean = {

    val isDirBy: Boolean = director1.name==director1.name
    isDirBy
  }

  def imbRating: Double = {

    imbRating1
  }

  def director: Unit = {

    def name: String = {

      director.name
    }
  }
}

object Film {

  def apply (name: String, yearOfRelease: Int, imbRating: Double, director1: Director): Film = {

    new Film (name, yearOfRelease, imbRating, director1)
  }

  def higestRating (film1: Film, film2: Film): Double={

    if (film1.imbRating > film2.imbRating ) {

      film1.imbRating
    }
    else{
      film2.imbRating
    }
  }
}