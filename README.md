# Triangular-Array

Program designed for creating simple triangular arrays in Clojure.

## Installation

Upon cloning or downloading the repository, a working version of the JRE is 
necessary to be installed to run the program.

## Usage
   Given a sh-based shell, one may simply run
   <pre><code> ./tri-arr </code></pre>
   to execute the program, which will then prompt the user for input.
    
   Alternatively, one may also supply the array as a list of command-line
   arguments in order to produce the triangular array. For example, to 
   produce a triangular array based on the states a, b, c, d, e one would 
   run 
   <pre><code> ./tri-arr a b c d e </pre></code>
   which would produce
   <pre><code> 
    b|___
    c|___|___
    d|___|___|___
    e|___|___|___|___
       a   b   c   d
   </pre></code>
   In the event that one does not have access to an sh-based shell, the 
   appropriate jar file may be found and executed on the path as follows:
   <pre><code> java -jar target/uberjar/triangular-array-0.1.0-SNAPSHOT-standalone.jar </pre></code>
   (Note, Windows users may need to replace all "/" with "\\")

## License

Copyright © 2020 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
