package com.kindsonthegenius.fleetapp.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Country {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String code;
	private String capital;
	private Integer classnumber;
	
	
	
	
	
	
	
	//country
	//subjects
	private String examtype;
	
	//buffer for the fifth
		
		private Integer english;
		private Integer maths;
		private Integer kiswahili;
		private Integer science;
		private Integer social;
		private Integer cre;
		private Integer total;

		private String reviewexamtype;
		private String reviewenglish;
		private String reviewmaths;
		private String reviewkiswahili;
		private String reviewscience;
		private String reviewsocial;
		private String reviewcre;
		private String reviewtotal;

	public Integer getEnglish() {
			return english;
		}

		public void setEnglish(Integer english) {
			this.english = english;
		}

		public Integer getMaths() {
			return maths;
		}

		public void setMaths(Integer maths) {
			this.maths = maths;
		}

		public Integer getKiswahili() {
			return kiswahili;
		}

		public void setKiswahili(Integer kiswahili) {
			this.kiswahili = kiswahili;
		}

		public Integer getScience() {
			return science;
		}

		public void setScience(Integer science) {
			this.science = science;
		}

		public Integer getSocial() {
			return social;
		}

		public void setSocial(Integer social) {
			this.social = social;
		}

		public Integer getCre() {
			return cre;
		}

		public void setCre(Integer cre) {
			this.cre = cre;
		}

		public Integer getTotal() {
			return total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public String getReviewexamtype() {
			return reviewexamtype;
		}

		public void setReviewexamtype(String reviewexamtype) {
			this.reviewexamtype = reviewexamtype;
		}

		public String getReviewenglish() {
			return reviewenglish;
		}

		public void setReviewenglish(String reviewenglish) {
			this.reviewenglish = reviewenglish;
		}

		public String getReviewmaths() {
			return reviewmaths;
		}

		public void setReviewmaths(String reviewmaths) {
			this.reviewmaths = reviewmaths;
		}

		public String getReviewkiswahili() {
			return reviewkiswahili;
		}

		public void setReviewkiswahili(String reviewkiswahili) {
			this.reviewkiswahili = reviewkiswahili;
		}

		public String getReviewscience() {
			return reviewscience;
		}

		public void setReviewscience(String reviewscience) {
			this.reviewscience = reviewscience;
		}

		public String getReviewsocial() {
			return reviewsocial;
		}

		public void setReviewsocial(String reviewsocial) {
			this.reviewsocial = reviewsocial;
		}

		public String getReviewcre() {
			return reviewcre;
		}

		public void setReviewcre(String reviewcre) {
			this.reviewcre = reviewcre;
		}

		public String getReviewtotal() {
			return reviewtotal;
		}

		public void setReviewtotal(String reviewtotal) {
			this.reviewtotal = reviewtotal;
		}

	//private String jesma;
	//private String jesmaenglish;
	//private String jesmamaths;
	//private String jesmakiswahili;
	//private String jesmascience;
	//private String jesmasocial;
	//private String jesmacre;
	//private String jesmatotal;

	//review

	//private String jesmaenglishreview;
	//private String jesmamathsreview;
	//private String jesmakiswahilireview;
	//private String jesmasciencereview;
	//private String jesmasocialreview;
	//private String jesmacrereview;
	//private String jesmatotalreview;



	//from user
	private String username;
	public String getExamtype() {
		return examtype;
	}

	public void setExamtype(String examtype) {
		this.examtype = examtype;
	}

	public Integer getClassnumber() {
		return classnumber;
	}

	public void setClassnumber(Integer classnumber) {
		this.classnumber = classnumber;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String fullname;
	private String role;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	//add to get id
	public Integer getId(Integer id) {
		return id;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	private String description;
	private String nationality;
	private String continent;
	

	
    @OneToMany(mappedBy="country")
	//private List<State> states;
    
   
	
	public void setCapital(String capital) {
		this.capital=capital;
	}
	
	public String getCapital() {
		return capital;
	}


}
