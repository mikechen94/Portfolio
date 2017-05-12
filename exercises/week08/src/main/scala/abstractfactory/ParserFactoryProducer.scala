package abstractfactory


object ParserFactoryProducer {
  def getFactory(s: String): AbstractParserFactory = {

    s match {

      "NYCFactory" => new NYCFactory
    }
  }

  def getParserInstance (s: String): XMLParser {

    s match {

    "NYCORDER" => new NYCOrderXMLParser("NYC Parsing order XML...\nNYC Order XML Message")
  }
  }
  // TODO

}
