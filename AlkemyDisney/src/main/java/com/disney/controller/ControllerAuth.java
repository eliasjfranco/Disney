package com.disney.controller;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import com.disney.jwt.JwtRequest;
import com.disney.jwt.JwtResponse;
import org.springframework.web.bind.annotation.RestController;
import com.disney.security.JwtUserDetailsService;
import com.disney.security.User;
import com.disney.service.AutenticacionService;
import com.disney.jwt.JwtTokenUtil;

@RestController
@CrossOrigin
public class ControllerAuth {

	@Autowired
	private AutenticacionService auth;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@RequestMapping(value="/auth/login", method = RequestMethod.POST)
	public ResponseEntity<?> crearAutenticacion(@RequestBody JwtRequest authenticationRequest) throws Exception{
		
		auth.autenticacion(authenticationRequest.getUsername(), authenticationRequest.getPwd());
		
		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(authenticationRequest.getUsername());
		
		final String token = jwtTokenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new JwtResponse(token));
	}
	
	@RequestMapping(value ="/auth/register", method = RequestMethod.POST)
	public ResponseEntity<?> guardarUser(@RequestBody User user) throws Exception{
		return ResponseEntity.ok(userDetailsService.save(user));
	}
	
}