# Oblig_EliasWallinSaksaether

The things I did might be somewhat blurry as I added, removed and then changed this many times.
I started this all by synchronising my intellij account with my github account. And when they were linked I clicked to 
share my project to github.

After they were linked I tested out a bunch of different methods for writing my workflows to get it right. You can see 
all these attempts on the action list.
Eventually I realized that I could just use one of the pre-made CI maven.yml texts offered by github.

This one worked immediately to make my actions pass successfully, but it did not actually run any of my maven tests.
To fix this issue I added "Test_" to the start of all my "Test_Leap_years.java" file methods and also to the file name
itself.

Even after all of this it still didn't detect the tests.
So I looked around to eventually find the canvas announcement regarding maven-surefire-plugin.
After I implemented this (and the advice regarding only having one dependency to be safe) the workflow detected my 12
tests and said that 11 of them worked.
I then quickly fixed the 1 rogue method that was wrong.