## Types in Java Script

**BONNUSS**
---
 1. Boolean
 2. Object
 3. Number - All numbers like integers, decimals, and floats         
             are all one type.
 4. Null -
 5. Undefined -
 6. String
 7. Symbol - (new into js) used for assigning unique id . 
             Always gives a guaranteed unique identifier
             
Everything in the above list are Primitive type except Object. 
An Object is a special type.
Every thing other than primitive types in js are objects.
At the end of the day, Functions, arrays, dates are all just objects.

##String
---
  used for holding text
  3 ways to create strings:
   1. using single quotes:
   `const first = 'Soumya";`
   2. using double quotes:
    `const middle="Ranjan";`
    single quotes and double quotes are the same thing.
   3. using backticks:
 ```const last = "Mohanty;```

   used for: `"she's cool"`
   or escaping: `'she\\'s cool'`
   
 -  backticks:
   
   ```
    const sentence she's so "cool"
    console.log(sentence); // she's so "cool"
```

 -  Multi-line string:

  ```
  const song "Oh \\
  I like \\
  pizza';
  
  console.log(song);//Oh i like pizza
```
     
  ``` javascript const song = "Oh
      I like
      pizza';
      
      console.log(song);
      \*
     Oh
     I Like
     pizza
     */
   ```
  2nd one using backticks is mostly used.
  
- **String concatenation and interpolation**
   -  '+' is used for **concatenation**. It is also used for adding 2 nos.
   -  **Concatenation**: when 2 or more strings combined to one
   -  **Interpolation**: when you put a variable inside a string
   -  Example 1:  
   
   `const name = 'Soumya';`
   `const hello= 'Hello my name is + name + '. Nice to meet you." you.'`

_(can use double or single quotes)__
   -  Example 2:
    
     `1+1 // 2 `

     `'1'+'1' // 11`  