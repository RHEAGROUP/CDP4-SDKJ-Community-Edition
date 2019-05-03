/*
 * DalQueryAttributes.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package cdp4dal.dal;

import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 * The base query attributes.
 */
public class DalQueryAttributes implements QueryAttributes {

  /**
   * Gets or sets the revision number.
   */
  @Getter
  @Setter
  private Integer revisionNumber;

  /**
   * Converts all values of this {@link DalQueryAttributes} class to a uri attributes String.
   *
   * @return The {@link String} in the form ?param1=value1 separated by an ampersand.
   */
  @Override
  public String toString() {
    var attributeString = this.joinAttributes();
    return Strings.isNullOrEmpty(attributeString) ? "" : String.format("?%s", attributeString);
  }

  /**
   * Joins the attributes into a single String.
   *
   * @return The {@link String} with all the attributes separated by a ampersand.
   */
  @Override
  public String joinAttributes() {
    List<String> attributeList = new ArrayList<>();

    if (this.getRevisionNumber() != null) {
      attributeList.add(String.format("revisionNumber=%s", this.getRevisionNumber()));
    }

    if (attributeList.size() == 0) {
      return "";
    }

    return String.join("&", attributeList);
  }
}
