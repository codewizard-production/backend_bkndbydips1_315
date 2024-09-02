package com.app.bkndbydips1.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.bkndbydips1.repository.TrainingRepository;
import com.app.bkndbydips1.repository.PerformanceAppraisalRepository;
import com.app.bkndbydips1.repository.OrganizationRepository;
import com.app.bkndbydips1.repository.EmployeePersonalInfoRepository;
import com.app.bkndbydips1.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
