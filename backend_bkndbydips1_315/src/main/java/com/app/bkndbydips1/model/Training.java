package com.app.bkndbydips1.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.bkndbydips1.model.PerformanceAppraisal;
import com.app.bkndbydips1.model.Organization;
import com.app.bkndbydips1.model.Training;
import com.app.bkndbydips1.model.EmployeePersonalInfo;
import com.app.bkndbydips1.model.EmlpoyeeProfile;
import com.app.bkndbydips1.enums.EmploymentType;
import com.app.bkndbydips1.enums.OrgDept;
import com.app.bkndbydips1.enums.TrainingLevel;
import com.app.bkndbydips1.enums.OrgBranch;
import com.app.bkndbydips1.converter.OrgBranchConverter;
import com.app.bkndbydips1.converter.TrainingLevelConverter;
import com.app.bkndbydips1.converter.EmploymentTypeConverter;
import com.app.bkndbydips1.converter.OrgDeptConverter;
import com.app.bkndbydips1.converter.DurationConverter;
import com.app.bkndbydips1.converter.UUIDToByteConverter;
import com.app.bkndbydips1.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Training")
@Table(name = "\"Training\"", schema =  "\"bkndbydips1\"")
@Data
                        
public class Training {
	public Training () {   
  }
	  
  @Column(name = "\"CompleteBy\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date completeBy;  
  
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"TrainingsId\"", nullable = true )
  private Integer trainingsId;
	  
  @Column(name = "\"Trainingslist\"", nullable = true)
  @Enumerated(value = EnumType.ORDINAL)
  @Convert(converter = TrainingLevelConverter.class)
  private TrainingLevel trainingslist;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Training [" 
  + "CompleteBy= " + completeBy  + ", " 
  + "TrainingsId= " + trainingsId  + ", " 
  + "Trainingslist= " + trainingslist 
 + "]";
	}
	
}