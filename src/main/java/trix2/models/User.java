package trix2.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import trix2.models.custom.UserGrantedAuthority;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by misael on 17/10/2015.
 */
@lombok.Getter
@lombok.Setter
@EqualsAndHashCode(of = {"id"})
@Entity
@JsonIgnoreProperties(value = {"accountNonExpired", "accountNonLocked", "credentialsNonExpired", "enabled"}) // remove UserDetails properties from json
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements UserDetails, Serializable{

    @Id
    public Long id;

    public String username;
    public String name;

    public User(){
        super();
    }

    public void nullafy(){
    }

    @JsonIgnore
    public String password;
    public Boolean enabled = true;

	@JsonIgnore
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "user", cascade = {CascadeType.ALL})
    public Set<UserGrantedAuthority> authorities;

    @CreatedDate
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    public Date createdAt;

    @LastModifiedDate
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    public Date updateAt;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

	public void addAuthority(UserGrantedAuthority authority) {
		if (authorities == null) authorities = new HashSet<>();

		authorities.add(authority);
	}
}