# This is a CoffeeScript File (http://coffeescript.org/)
# CoffeeScript is a language that compiles into JavaScript (JS) code.
# It is meant to be a cleaner form of the JS language, but it is not valid JS.
# Instead the Play Framework compiles the CoffeeScript into valid JS in its
# asset pipeline. Clients like web browsers do not understand CoffeeScript.
$ ->
  $.get "/persons", (persons) ->
    $.each persons, (index, person) ->
      $('#persons').append $("<li>").text person.name
