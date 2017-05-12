package abstractfactory


/**
  * Created by cchiu03 on 14/04/2017.
  */
class NYCFactory extends AbstractParserFactory {

  override def getParserInstance(parserType: String): XMLParser = {

    var nycOrderXMLParser = new NYCOrderXMLParser

    }
  }

}
