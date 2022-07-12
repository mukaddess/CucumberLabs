##Explain your Cucumber BDD Framework Structure?

My framework is a cucumber BDD and I am using a maven to
build up my framework as a build management tool and for that, I
have pom.xml and in pom.xml file I am storing my dependencies
as well as plugins to gain additional features with the maven
capabilities, and my framework is consisting of different layers and
those layers are Pages, Runner, steps definitions, utils the
resources, and I have a properties file so in the properties file I
keep my Global values where I can reach them from anywhere in
my framework. The next layer is resources and under
resources I keep my feature files as well as my other type of other
external files and this is basically what I keep all of my scenarios
in Gherkin language since we are using cucumber with the JUnits
and in feature files we are able to type our scenarios in plain
English and this is where we keep those scenarios. and we are
typing our scenarios here and our next layer is utils so I have a
utils package where I keep my useful utils to use throughout my
framework one of them is called browser utils and I have useful
methods when handling browsers. I have another util called
configuration reader and this util helps me to read my values
from my properties files, and the third one is driver I have driver
util.  and this driver util is very capable driver and I can run my
scenario parallelly using this driver because I am using pull design
instead of Singleton design and this driver also is capable of
turning into any type of browser I can turn it in to have(Smoth)
Firefox Chrome any type of browser and it's a very useful
browser util, so then the other package is called steps definitions
and in steps definitions basically I have two types of files I have a
hooks class where I keep my before and after annotations or
other JUnit annotations such as before method before sweat after
sweat after after group before group those things and the next
class is OrangeHRM the next class is where I keep my actual steps
and in there I am creating methods I'm creating methods for each
step and then I start typing I start typing my code in those steps
and I'm also extending this class to browser utils so that I can use
my useful method and this is basically what I have in steps
definitions and the next one is a runner package so in runner this
is where I manage my framework and under runner I have class
called test Runner and this test runner  basically it is  the centre
of framework and I run my all of my scenarios here and what it
does and how it does I am using run with which is an anotation that
comes from JUnit so that I can use JUnit capabilities in this
framework and secondly I am using a tag called cucumber options
and cucumber options House made to initialize my framework
with the cucumber and inside to cucumber options I have feature
where I hook my resource files I have glue tag where I hook my
definitions with here I have tags where I can Define which tag
scenarios can be run and I have also additional capabilities that I
can I can run my scenario without actually running them to
generate my steps also I can generate HTML reports Jason reports
as well as a file to keep my failed scenarios the next class is field
Runner and I am storing my field scenarios and I'm using failed
Runner to rerun those scenarios and basically I have a similar
setup as Test runner class and finally my last package is called
pages and since this is a framework that utilizes page object
model we are using page object model here as well and in side
pages I have  a page for each model in my application. For
example, I have a home page I have an admin page I have a login
page. Basically, on these pages I am locating elements in these
classes. As well as I am having a usefull method for each one of
these pages. I can use those methods whenever it is requires any
step under step definitions. Basically this is what all about my
framework.