/*
 * Copyright 2015 Wipro Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wipro.ats.bdre.md.setup.beans;
// Generated Dec 21, 2015 11:26:14 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Properties generated by hbm2java
 */
@Entity
@Table(name="PROPERTIES"

)
public class Properties  implements java.io.Serializable {


     private PropertiesId id;
     private String configGroup;
     private String propValue;
     private String description;

    public Properties() {
    }

    public Properties(PropertiesId id, String configGroup, String propValue, String description) {
       this.id = id;
       this.configGroup = configGroup;
       this.propValue = propValue;
       this.description = description;
    }

     @EmbeddedId

    @AttributeOverrides( {
        @AttributeOverride(name="processId", column=@Column(name="PROCESS_ID", nullable=false) ),
        @AttributeOverride(name="propKey", column=@Column(name="PROP_KEY", nullable=false, length=128) ) } )
    public PropertiesId getId() {
        return this.id;
    }

    public void setId(PropertiesId id) {
        this.id = id;
    }

    @Column(name="CONFIG_GROUP", nullable=false, length=10)
    public String getConfigGroup() {
        return this.configGroup;
    }
    
    public void setConfigGroup(String configGroup) {
        this.configGroup = configGroup;
    }
    
    @Column(name="PROP_VALUE", nullable=false, length=2048)
    public String getPropValue() {
        return this.propValue;
    }
    
    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }
    
    @Column(name="DESCRIPTION", nullable=false, length=1028)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }




}

