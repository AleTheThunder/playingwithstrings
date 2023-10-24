##Java String
        ###Verständnisfragen?
<ul>
<li> Why are String objects immutable? </li>

        >    *String objects are imutible because, in the String constant pool, a String object is likely to have one or many references. If several references point to the same String without even knowing it, it would be bad if one of the references modified that String value. That’s why String objects are immutable.
<br>
<br>
Reasons why Strings are immutable:*
        ><ul>
><li>String Pool</li>
        ><li>Security threat</li>
        ><li>thread safety</li>
        ><li>Security of loading the corect class</li>
        ></ul>
        >
        > *Martin Schindler*
<li> How to create an immutable class? </li>

        >*How to make an immutable class:*
        ><ul>
><li>Declare the class as final so it can’t be extended.</li>
        ><li>Make all fields private so that direct access is not allowed.</li>
        ><li>Don’t provide setter methods for variables.</li>
        ><li>Make all mutable fields final so that its value can be assigned only once.</li>
        ><li>Initialize all the fields via a constructor performing deep copy.</li>
        ><li>Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.</li>
        ></ul>
        >
        > *Fabian Hohn*

<li> What is string constant pool? </li>

        > *The string constant pool is a special Memory area. When we declare a String literal, the JVM creates the object in the pool and stores its reference on the stack. If we create another literate String with the same value, the JVM checks if it already has a String with the same values, if this is the case, it will return a reference to the String in the string constant pool. If it does not find an already existing String, it will create a new one in the string constant pool.
<br><br>
The String constant pool uses a Hashmap in its implementation. Each bucket of the Hashmap contains a list of Strings with the same hash code.
<br><br>
The variables created on the stack are deallocated as soon as the thread completes execution. In contrast,the garbage collector collects the un-referenced items from the string constant pool.
<br><br>
Martin Schindler*
<li> What code is written by the compiler if you concatenate any string by + (string concatenation operator)? </li>
<li> What is the difference between StringBuffer and StringBuilder class? </li>
<ul>
<li>1)	StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.	StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.</li>
<li>2)	StringBuffer is less efficient than StringBuilder.	StringBuilder is more efficient than StringBuffer.</li>
        *Owen Yin*
</ul>

        ###Kurzdefinition folgender Begriffe
<ul>
<li> Concept of String</li>

        > *Generally, String is a sequence of characters. But in Java, string is an object that represents a
        sequence of characters. The java.lang.String class is used to create a string object.*
        > <br><br>
> *Nino Waismayer*

<li> Immutable String </li>

        >*In Java, String objects are immutable. Immutable simply means unmodifiable or unchangeable. Once String object is created its data or state can't be changed but a new String object is created.*
        >
        > *Nino Waismayer*
<li> String Comparison </li>

        >*There are three ways of comparing Strings in Java, we can compare on basis of content and references.
        > <br><br>
>The three ways are:*
        > <ul>
> <li>equals() It compares original content</li>
        > <li>== It compares the reference, not the values. </li>
        > <li>compareTo() It compares values lexicographically and returns an integer value that describes if first string is less than, equal to or greater than second string.</li>
        > </ul>
        >
        > <br>
>
        >*Fabian Hohn*
<li> String Concatenation </li>

        > *In Java, String concatenation forms a new String that is the combination of multiple strings.*<br>
> *There are two ways to concatenate strings in Java:*<br>
> *By + (String concatenation) operator*<br>
> *By concat() method*<br>
> <br>
> *Martin Rezny*
<li> Concept of Substring </li>
<li> String class methods and its usage </li>
<li> StringBuffer class </li>
<li> StringBuilder class </li>
<li> Creating Immutable class </li>
<li> toString() method </li>
<li> StringTokenizer class </li>
</ul>