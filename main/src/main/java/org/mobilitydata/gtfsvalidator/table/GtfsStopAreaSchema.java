/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mobilitydata.gtfsvalidator.table;

import static org.mobilitydata.gtfsvalidator.annotation.TranslationRecordIdType.UNSUPPORTED;

import org.mobilitydata.gtfsvalidator.annotation.FieldType;
import org.mobilitydata.gtfsvalidator.annotation.FieldTypeEnum;
import org.mobilitydata.gtfsvalidator.annotation.ForeignKey;
import org.mobilitydata.gtfsvalidator.annotation.GtfsTable;
import org.mobilitydata.gtfsvalidator.annotation.PrimaryKey;
import org.mobilitydata.gtfsvalidator.annotation.Required;

@GtfsTable("stop_areas.txt")
public interface GtfsStopAreaSchema extends GtfsEntity {
  @FieldType(FieldTypeEnum.ID)
  @ForeignKey(table = "areas.txt", field = "area_id")
  @Required
  @PrimaryKey(translationRecordIdType = UNSUPPORTED)
  String areaId();

  @FieldType(FieldTypeEnum.ID)
  @ForeignKey(table = "stops.txt", field = "stop_id")
  @Required
  @PrimaryKey(translationRecordIdType = UNSUPPORTED)
  String stopId();
}
