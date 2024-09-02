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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  