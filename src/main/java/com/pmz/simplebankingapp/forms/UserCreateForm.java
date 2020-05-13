package com.pmz.simplebankingapp.forms;

import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import com.pmz.simplebankingapp.domain.entity.Role;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Component
public class UserCreateForm {

    @NotEmpty
    @Length(min = 2, max = 50)
    private String username;

    @NotEmpty
    @Length(min = 8, max = 12)
    private String password;

    @NotEmpty
    private String passwordConfirm;

    @NotEmpty
    @Length(min = 2, max = 50)
    private String email;
    
    @NotEmpty
    @Length(min = 2, max = 50)
    private String firstname;
    
    @NotEmpty
    @Length(min = 2, max = 50)
    private String lastname;
    
    @NotEmpty
    @Length(min = 2, max = 50)
    private String fathername;
    
    @NotEmpty
    @Length(min = 2, max = 50)
    private String mothername;
    
    @NotEmpty
    private Set<Role> roles = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
    
    
}
