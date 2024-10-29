package com.kindsonthegenius.fleetapp.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class State {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	private String name;
	
	
	//buffer for the second
	private String examtype1;
	private Integer english1;
	private Integer maths1;
	private Integer kiswahili1;
	private Integer science1;
	private Integer social1;
	private Integer cre1;
	private Integer total1;


	private String reviewexamtype1;
	private String reviewenglish1;
	private String reviewmaths1;
	private String reviewkiswahili1;
	private String reviewscience1;
	private String reviewsocial1;
	private String reviewcre1;
	private String reviewtotal1;

	//buffer for the second
	private String examtype2;
	private Integer english2;
	private Integer maths2;
	private Integer kiswahili2;
	private Integer science2;
	private Integer social2;
	private Integer cre2;
	private Integer total2;


	private String reviewexamtype2;
	private String reviewenglish2;
	private String reviewmaths2;
	private String reviewkiswahili2;
	private String reviewscience2;
	private String reviewsocial2;
	private String reviewcre2;
	private String reviewtotal2;



	//buffer for the third
	private String examtype3;
	private Integer english3;
	private Integer maths3;
	private Integer kiswahili3;
	private Integer science3;
	private Integer social3;
	private Integer cre3;
	private Integer total3;


	private String reviewexamtype3;
	private String reviewenglish3;
	private String reviewmaths3;
	private String reviewkiswahili3;
	private String reviewscience3;
	private String reviewsocial3;
	private String reviewcre3;
	private String reviewtotal3;


	//buffer for the fourth
	private String examtype4;
	private Integer english4;
	private Integer maths4;
	private Integer kiswahili4;
	private Integer science4;
	private Integer social4;
	private Integer cre4;
	private Integer total4;


	private String reviewexamtype4;
	private String reviewenglish4;
	public String getExamtype1() {
		return examtype1;
	}

	public void setExamtype1(String examtype1) {
		this.examtype1 = examtype1;
	}

	public Integer getEnglish1() {
		return english1;
	}

	public void setEnglish1(Integer english1) {
		this.english1 = english1;
	}

	public Integer getMaths1() {
		return maths1;
	}

	public void setMaths1(Integer maths1) {
		this.maths1 = maths1;
	}

	public Integer getKiswahili1() {
		return kiswahili1;
	}

	public void setKiswahili1(Integer kiswahili1) {
		this.kiswahili1 = kiswahili1;
	}

	public Integer getScience1() {
		return science1;
	}

	public void setScience1(Integer science1) {
		this.science1 = science1;
	}

	public Integer getSocial1() {
		return social1;
	}

	public void setSocial1(Integer social1) {
		this.social1 = social1;
	}

	public Integer getCre1() {
		return cre1;
	}

	public void setCre1(Integer cre1) {
		this.cre1 = cre1;
	}

	public Integer getTotal1() {
		return total1;
	}

	public void setTotal1(Integer total1) {
		this.total1 = total1;
	}

	public String getReviewexamtype1() {
		return reviewexamtype1;
	}

	public void setReviewexamtype1(String reviewexamtype1) {
		this.reviewexamtype1 = reviewexamtype1;
	}

	public String getReviewenglish1() {
		return reviewenglish1;
	}

	public void setReviewenglish1(String reviewenglish1) {
		this.reviewenglish1 = reviewenglish1;
	}

	public String getReviewmaths1() {
		return reviewmaths1;
	}

	public void setReviewmaths1(String reviewmaths1) {
		this.reviewmaths1 = reviewmaths1;
	}

	public String getReviewkiswahili1() {
		return reviewkiswahili1;
	}

	public void setReviewkiswahili1(String reviewkiswahili1) {
		this.reviewkiswahili1 = reviewkiswahili1;
	}

	public String getReviewscience1() {
		return reviewscience1;
	}

	public void setReviewscience1(String reviewscience1) {
		this.reviewscience1 = reviewscience1;
	}

	public String getReviewsocial1() {
		return reviewsocial1;
	}

	public void setReviewsocial1(String reviewsocial1) {
		this.reviewsocial1 = reviewsocial1;
	}

	public String getReviewcre1() {
		return reviewcre1;
	}

	public void setReviewcre1(String reviewcre1) {
		this.reviewcre1 = reviewcre1;
	}

	public String getReviewtotal1() {
		return reviewtotal1;
	}

	public void setReviewtotal1(String reviewtotal1) {
		this.reviewtotal1 = reviewtotal1;
	}

	public String getExamtype2() {
		return examtype2;
	}

	public void setExamtype2(String examtype2) {
		this.examtype2 = examtype2;
	}

	public Integer getEnglish2() {
		return english2;
	}

	public void setEnglish2(Integer english2) {
		this.english2 = english2;
	}

	public Integer getMaths2() {
		return maths2;
	}

	public void setMaths2(Integer maths2) {
		this.maths2 = maths2;
	}

	public Integer getKiswahili2() {
		return kiswahili2;
	}

	public void setKiswahili2(Integer kiswahili2) {
		this.kiswahili2 = kiswahili2;
	}

	public Integer getScience2() {
		return science2;
	}

	public void setScience2(Integer science2) {
		this.science2 = science2;
	}

	public Integer getSocial2() {
		return social2;
	}

	public void setSocial2(Integer social2) {
		this.social2 = social2;
	}

	public Integer getCre2() {
		return cre2;
	}

	public void setCre2(Integer cre2) {
		this.cre2 = cre2;
	}

	public Integer getTotal2() {
		return total2;
	}

	public void setTotal2(Integer total2) {
		this.total2 = total2;
	}

	public String getReviewexamtype2() {
		return reviewexamtype2;
	}

	public void setReviewexamtype2(String reviewexamtype2) {
		this.reviewexamtype2 = reviewexamtype2;
	}

	public String getReviewenglish2() {
		return reviewenglish2;
	}

	public void setReviewenglish2(String reviewenglish2) {
		this.reviewenglish2 = reviewenglish2;
	}

	public String getReviewmaths2() {
		return reviewmaths2;
	}

	public void setReviewmaths2(String reviewmaths2) {
		this.reviewmaths2 = reviewmaths2;
	}

	public String getReviewkiswahili2() {
		return reviewkiswahili2;
	}

	public void setReviewkiswahili2(String reviewkiswahili2) {
		this.reviewkiswahili2 = reviewkiswahili2;
	}

	public String getReviewscience2() {
		return reviewscience2;
	}

	public void setReviewscience2(String reviewscience2) {
		this.reviewscience2 = reviewscience2;
	}

	public String getReviewsocial2() {
		return reviewsocial2;
	}

	public void setReviewsocial2(String reviewsocial2) {
		this.reviewsocial2 = reviewsocial2;
	}

	public String getReviewcre2() {
		return reviewcre2;
	}

	public void setReviewcre2(String reviewcre2) {
		this.reviewcre2 = reviewcre2;
	}

	public String getReviewtotal2() {
		return reviewtotal2;
	}

	public void setReviewtotal2(String reviewtotal2) {
		this.reviewtotal2 = reviewtotal2;
	}

	public String getExamtype3() {
		return examtype3;
	}

	public void setExamtype3(String examtype3) {
		this.examtype3 = examtype3;
	}

	public Integer getEnglish3() {
		return english3;
	}

	public void setEnglish3(Integer english3) {
		this.english3 = english3;
	}

	public Integer getMaths3() {
		return maths3;
	}

	public void setMaths3(Integer maths3) {
		this.maths3 = maths3;
	}

	public Integer getKiswahili3() {
		return kiswahili3;
	}

	public void setKiswahili3(Integer kiswahili3) {
		this.kiswahili3 = kiswahili3;
	}

	public Integer getScience3() {
		return science3;
	}

	public void setScience3(Integer science3) {
		this.science3 = science3;
	}

	public Integer getSocial3() {
		return social3;
	}

	public void setSocial3(Integer social3) {
		this.social3 = social3;
	}

	public Integer getCre3() {
		return cre3;
	}

	public void setCre3(Integer cre3) {
		this.cre3 = cre3;
	}

	public Integer getTotal3() {
		return total3;
	}

	public void setTotal3(Integer total3) {
		this.total3 = total3;
	}

	public String getReviewexamtype3() {
		return reviewexamtype3;
	}

	public void setReviewexamtype3(String reviewexamtype3) {
		this.reviewexamtype3 = reviewexamtype3;
	}

	public String getReviewenglish3() {
		return reviewenglish3;
	}

	public void setReviewenglish3(String reviewenglish3) {
		this.reviewenglish3 = reviewenglish3;
	}

	public String getReviewmaths3() {
		return reviewmaths3;
	}

	public void setReviewmaths3(String reviewmaths3) {
		this.reviewmaths3 = reviewmaths3;
	}

	public String getReviewkiswahili3() {
		return reviewkiswahili3;
	}

	public void setReviewkiswahili3(String reviewkiswahili3) {
		this.reviewkiswahili3 = reviewkiswahili3;
	}

	public String getReviewscience3() {
		return reviewscience3;
	}

	public void setReviewscience3(String reviewscience3) {
		this.reviewscience3 = reviewscience3;
	}

	public String getReviewsocial3() {
		return reviewsocial3;
	}

	public void setReviewsocial3(String reviewsocial3) {
		this.reviewsocial3 = reviewsocial3;
	}

	public String getReviewcre3() {
		return reviewcre3;
	}

	public void setReviewcre3(String reviewcre3) {
		this.reviewcre3 = reviewcre3;
	}

	public String getReviewtotal3() {
		return reviewtotal3;
	}

	public void setReviewtotal3(String reviewtotal3) {
		this.reviewtotal3 = reviewtotal3;
	}

	public String getExamtype4() {
		return examtype4;
	}

	public void setExamtype4(String examtype4) {
		this.examtype4 = examtype4;
	}

	public Integer getEnglish4() {
		return english4;
	}

	public void setEnglish4(Integer english4) {
		this.english4 = english4;
	}

	public Integer getMaths4() {
		return maths4;
	}

	public void setMaths4(Integer maths4) {
		this.maths4 = maths4;
	}

	public Integer getKiswahili4() {
		return kiswahili4;
	}

	public void setKiswahili4(Integer kiswahili4) {
		this.kiswahili4 = kiswahili4;
	}

	public Integer getScience4() {
		return science4;
	}

	public void setScience4(Integer science4) {
		this.science4 = science4;
	}

	public Integer getSocial4() {
		return social4;
	}

	public void setSocial4(Integer social4) {
		this.social4 = social4;
	}

	public Integer getCre4() {
		return cre4;
	}

	public void setCre4(Integer cre4) {
		this.cre4 = cre4;
	}

	public Integer getTotal4() {
		return total4;
	}

	public void setTotal4(Integer total4) {
		this.total4 = total4;
	}

	public String getReviewexamtype4() {
		return reviewexamtype4;
	}

	public void setReviewexamtype4(String reviewexamtype4) {
		this.reviewexamtype4 = reviewexamtype4;
	}

	public String getReviewenglish4() {
		return reviewenglish4;
	}

	public void setReviewenglish4(String reviewenglish4) {
		this.reviewenglish4 = reviewenglish4;
	}

	public String getReviewmaths4() {
		return reviewmaths4;
	}

	public void setReviewmaths4(String reviewmaths4) {
		this.reviewmaths4 = reviewmaths4;
	}

	public String getReviewkiswahili4() {
		return reviewkiswahili4;
	}

	public void setReviewkiswahili4(String reviewkiswahili4) {
		this.reviewkiswahili4 = reviewkiswahili4;
	}

	public String getReviewscience4() {
		return reviewscience4;
	}

	public void setReviewscience4(String reviewscience4) {
		this.reviewscience4 = reviewscience4;
	}

	public String getReviewsocial4() {
		return reviewsocial4;
	}

	public void setReviewsocial4(String reviewsocial4) {
		this.reviewsocial4 = reviewsocial4;
	}

	public String getReviewcre4() {
		return reviewcre4;
	}

	public void setReviewcre4(String reviewcre4) {
		this.reviewcre4 = reviewcre4;
	}

	public String getReviewtotal4() {
		return reviewtotal4;
	}

	public void setReviewtotal4(String reviewtotal4) {
		this.reviewtotal4 = reviewtotal4;
	}

	public String getExamtype5() {
		return examtype5;
	}

	public void setExamtype5(String examtype5) {
		this.examtype5 = examtype5;
	}

	public Integer getEnglish5() {
		return english5;
	}

	public void setEnglish5(Integer english5) {
		this.english5 = english5;
	}

	public Integer getMaths5() {
		return maths5;
	}

	public void setMaths5(Integer maths5) {
		this.maths5 = maths5;
	}

	public Integer getKiswahili5() {
		return kiswahili5;
	}

	public void setKiswahili5(Integer kiswahili5) {
		this.kiswahili5 = kiswahili5;
	}

	public Integer getScience5() {
		return science5;
	}

	public void setScience5(Integer science5) {
		this.science5 = science5;
	}

	public Integer getSocial5() {
		return social5;
	}

	public void setSocial5(Integer social5) {
		this.social5 = social5;
	}

	public Integer getCre5() {
		return cre5;
	}

	public void setCre5(Integer cre5) {
		this.cre5 = cre5;
	}

	public Integer getTotal5() {
		return total5;
	}

	public void setTotal5(Integer total5) {
		this.total5 = total5;
	}

	public String getReviewexamtype5() {
		return reviewexamtype5;
	}

	public void setReviewexamtype5(String reviewexamtype5) {
		this.reviewexamtype5 = reviewexamtype5;
	}

	public String getReviewenglish5() {
		return reviewenglish5;
	}

	public void setReviewenglish5(String reviewenglish5) {
		this.reviewenglish5 = reviewenglish5;
	}

	public String getReviewmaths5() {
		return reviewmaths5;
	}

	public void setReviewmaths5(String reviewmaths5) {
		this.reviewmaths5 = reviewmaths5;
	}

	public String getReviewkiswahili5() {
		return reviewkiswahili5;
	}

	public void setReviewkiswahili5(String reviewkiswahili5) {
		this.reviewkiswahili5 = reviewkiswahili5;
	}

	public String getReviewscience5() {
		return reviewscience5;
	}

	public void setReviewscience5(String reviewscience5) {
		this.reviewscience5 = reviewscience5;
	}

	public String getReviewsocial5() {
		return reviewsocial5;
	}

	public void setReviewsocial5(String reviewsocial5) {
		this.reviewsocial5 = reviewsocial5;
	}

	public String getReviewcre5() {
		return reviewcre5;
	}

	public void setReviewcre5(String reviewcre5) {
		this.reviewcre5 = reviewcre5;
	}

	public String getReviewtotal5() {
		return reviewtotal5;
	}

	public void setReviewtotal5(String reviewtotal5) {
		this.reviewtotal5 = reviewtotal5;
	}

	private String reviewmaths4;
	private String reviewkiswahili4;
	private String reviewscience4;
	private String reviewsocial4;
	private String reviewcre4;
	private String reviewtotal4;

	//buffer for the fifth
	private String examtype5;
	private Integer english5;
	private Integer maths5;
	private Integer kiswahili5;
	private Integer science5;
	private Integer social5;
	private Integer cre5;
	private Integer total5;

	private String reviewexamtype5;
	private String reviewenglish5;
	private String reviewmaths5;
	private String reviewkiswahili5;
	private String reviewscience5;
	private String reviewsocial5;
	private String reviewcre5;
	private String reviewtotal5;
	
	
	private Integer classnumber;
	

	//country
	



	//from user
	private String username;
	private String fullname;
	private String role;
	private String password;
	
	//fee structure
	private Integer balance;
	
	//subjects
		private String examtype;
		
		
	
	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public Integer getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(Integer overdraft) {
		this.overdraft = overdraft;
	}

	private Integer overdraft;
	
	
	
	
	
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}




	

	

	public Integer getCountryid() {
		return countryid;
	}

	public void setCountryid(Integer countryid) {
		this.countryid = countryid;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	private String capital;
    private String code;

	@ManyToOne
	//@JoinColumn(name="countryid", insertable=false, updatable=false)
	
	
	
private Country country;
	
    private Integer countryid;
	
	private String details;
	
	
	
	
	//private List<Country> countries = new ArrayList<>();
    //List<Country> filteredList = countries.stream()
       //     .filter(countries -> countries.getId() > 1)
        //    .collect(Collectors.toList());
	
	
	
	
	public void setCapital(String capital) {
		this.capital=capital;
	}
	
	
	
	public String getCapital() {
		return capital;
	}


}
