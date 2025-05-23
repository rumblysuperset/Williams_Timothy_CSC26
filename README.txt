Arrays vs Array List

The main difference between an array vs an array list is that with the array, the size is static. For instance if you had a string array and you initialized the size as 3, you cannot change this specific array size later on in your code. The benefit of using an array is more for performance as there is less overhead. So if you don't need to change the size of the array, then this is the one for you. Whereas with an array list, you can actively add and remove elements on the fly. Array lists also have a lot more flexibility such as sorting, searching, etc. Ultimately if you don't need to change the size of the array, you are looking for less overhead to improve performance, and just want something quick and streamlined as wrappers are completely unneeded, then the array is for you. On the other hand if you are looking to have far more flexibility whether it be changing the size of the array list or far more element operations in general than you will want to use the Array List. Here is an easier to digest breakdown of the pros and cons of an Array vs an Array list.

Feature		    |	Array	   |	Array List
-------------------------------------------------------
Size		    |	Fixed	   |	Dynamic
Type-safe	    |	Yes	   |	Yes
Performance	    |	Faster	   |	Slower
Primitive support   |	Yes	   |	No
Built-in-methods    |	Few	   |	Many



Just for clarity a Type-safe is a feature in java that ensures you are using the right type of data in the right place and will give you a compilation error if you are not. ie. you can put an integer into a string array element. In this case, Array Lists may be far more flexible but they also run the risk of crashing your program later as it does not have that safety check.