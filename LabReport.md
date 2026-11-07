http.authorizeHttpRequests(auth -> auth        
        .requestMatchers("/", "/login")        
        .permitAll()        
        .anyRequest()        
        .authenticated())    
    .formLogin(form -> form        
        .loginPage("/login")        
        .permitAll());

- The object on which this configuration begins is 'http'
- We can clearly see the chained method calls between .requestMatchers(...), /permitAll(), .anyRequest(), .authenticated(), etc.

- The first lambda expression is as follows: 'auth -> auth        
        .requestMatchers("/", "/login")        
        .permitAll()        
        .anyRequest()        
        .authenticated()'
- The first lambda parameter is 'auth' indicated by it being on the left side of the '->' operator.
- The first lambda body is ' auth        
        .requestMatchers("/", "/login")        
        .permitAll()        
        .anyRequest()        
        .authenticated()' indicated by it being on the right side of the '->' operator

- The second lambda expression is as follows: 'form -> form        
        .loginPage("/login")        
        .permitAll()'
- The parameter for the second lambda expression is 'form' indicated by it being on the left side of the '->' operator.
- The body of the second lambda expressions is 'form        
        .loginPage("/login")        
        .permitAll()' indicated by it being on the right side of the '->' operator.

- the '->' syntax belongs to the Java language and is not native specifically to Spring Security API.
- authorizeHttpRequests(...) and formLogin(...) both belong to the Spring Security API. The other method calls represented in that code are within the bodies of those lambda expressions which take place within those two methods.