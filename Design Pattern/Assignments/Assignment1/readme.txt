>>FizzBuzz.java:
    1.Comment smell
    2.Inappropriate naming smell(function name say was meaningless)
    3.Long methode smell(method say())


>>PlainTextToHtmlConverter:
    1.Temporary field method(variable int i should have been inside the scope charConversion())
    2.Replace Temp with Query(too many temporary variables )
    3.Duplicated code(charCoverstion())
    4.Black sheep(operation read is not a part of html conversion)
    5.Long methode smell(basicHtmlEncode())


>>TriviaGame:
    1.Duplicate Code(correctAnswerHandle(),outOfPenaltyBox())
    2.Inappropriate naming smell( meothode add() to addPlayer())
    3.Dead code(methode howManyPLayers())
    4.Long Methode smell(methode roll, wasCorrectlyAnswered)