package scanpackage.config;
//Аннотация @EnableAutoConfiguration переключает
//      на приемлемое по умолчанию поведение, основанное на содержании вашего classpath.

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableWebSecurity включает поддержку web security и обеспечивает интеграцию со Spring MVC
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
//@EnableGlobalMethodSecurity чтобы секьюрити через методы стало доступным.
public class WebConfig extends WebSecurityConfigurerAdapter {

    // @Resource(name = "customUserDetailsService")
    // private UserDetailsService userDetailsService;

    //  @Autowired
    //  private JwtAuthenticationEntryPoint unauthorizedHandler;
//запрос аутентификации обрабатывается AuthenticationProvider и
// возвращается полностью аутентифицированный объект с полными учетными данными.
    // @Override
    //    @Bean
    //    public AuthenticationManager authenticationManagerBean() throws Exception {
    //        return super.authenticationManagerBean();
    //    }

    // @Autowired
    //  public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
    //      auth.userDetailsService(userDetailsService).passwordEncoder(encoder());
    //  }

    // @Bean
    // public JwtAuthenticationFilter authenticationTokenFilterBean(){
    //      return new JwtAuthenticationFilter();
    //   }

    // @Bean
    // public BCryptPasswordEncoder encoder(){
    //     return new BCryptPasswordEncoder();
    // }


    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable()
                .authorizeRequests()
                .antMatchers("/token/*", "/signup").permitAll()
                .and();

        //     .exceptionHandling().authenticationEntryPoint(unauthorizedHandler)
        //  .and()
        //   .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        //    http.addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);
    }
}
