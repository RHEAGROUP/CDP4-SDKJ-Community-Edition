/**
 */
package CDP4.ReportingData.impl;

import CDP4.CommonData.CommonDataPackage;
import CDP4.CommonData.NamedThing;
import CDP4.CommonData.ShortNamedThing;
import CDP4.CommonData.TimeStampedThing;

import CDP4.CommonData.impl.ThingImpl;

import CDP4.EngineeringModelData.EngineeringModelDataPackage;
import CDP4.EngineeringModelData.OwnedThing;

import CDP4.ReportingData.Book;
import CDP4.ReportingData.ReportingDataPackage;
import CDP4.ReportingData.Section;

import CDP4.SiteDirectoryData.CategorizableThing;
import CDP4.SiteDirectoryData.Category;
import CDP4.SiteDirectoryData.DomainOfExpertise;
import CDP4.SiteDirectoryData.SiteDirectoryDataPackage;

import java.time.OffsetDateTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CDP4.ReportingData.impl.BookImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.BookImpl#getName <em>Name</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.BookImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.BookImpl#getShortName <em>Short Name</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.BookImpl#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link CDP4.ReportingData.impl.BookImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BookImpl extends ThingImpl implements Book {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected DomainOfExpertise owner;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected static final OffsetDateTime CREATED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedOn() <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedOn()
	 * @generated
	 * @ordered
	 */
	protected OffsetDateTime createdOn = CREATED_ON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected EList<Section> section;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReportingDataPackage.Literals.BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, ReportingDataPackage.BOOK__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.BOOK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (DomainOfExpertise)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReportingDataPackage.BOOK__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainOfExpertise basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(DomainOfExpertise newOwner) {
		DomainOfExpertise oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.BOOK__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.BOOK__SHORT_NAME, oldShortName, shortName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffsetDateTime getCreatedOn() {
		return createdOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedOn(OffsetDateTime newCreatedOn) {
		OffsetDateTime oldCreatedOn = createdOn;
		createdOn = newCreatedOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportingDataPackage.BOOK__CREATED_ON, oldCreatedOn, createdOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Section> getSection() {
		if (section == null) {
			section = new EObjectContainmentEList<Section>(Section.class, this, ReportingDataPackage.BOOK__SECTION);
		}
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportingDataPackage.BOOK__SECTION:
				return ((InternalEList<?>)getSection()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportingDataPackage.BOOK__CATEGORY:
				return getCategory();
			case ReportingDataPackage.BOOK__NAME:
				return getName();
			case ReportingDataPackage.BOOK__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case ReportingDataPackage.BOOK__SHORT_NAME:
				return getShortName();
			case ReportingDataPackage.BOOK__CREATED_ON:
				return getCreatedOn();
			case ReportingDataPackage.BOOK__SECTION:
				return getSection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportingDataPackage.BOOK__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case ReportingDataPackage.BOOK__NAME:
				setName((String)newValue);
				return;
			case ReportingDataPackage.BOOK__OWNER:
				setOwner((DomainOfExpertise)newValue);
				return;
			case ReportingDataPackage.BOOK__SHORT_NAME:
				setShortName((String)newValue);
				return;
			case ReportingDataPackage.BOOK__CREATED_ON:
				setCreatedOn((OffsetDateTime)newValue);
				return;
			case ReportingDataPackage.BOOK__SECTION:
				getSection().clear();
				getSection().addAll((Collection<? extends Section>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ReportingDataPackage.BOOK__CATEGORY:
				getCategory().clear();
				return;
			case ReportingDataPackage.BOOK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ReportingDataPackage.BOOK__OWNER:
				setOwner((DomainOfExpertise)null);
				return;
			case ReportingDataPackage.BOOK__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
				return;
			case ReportingDataPackage.BOOK__CREATED_ON:
				setCreatedOn(CREATED_ON_EDEFAULT);
				return;
			case ReportingDataPackage.BOOK__SECTION:
				getSection().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ReportingDataPackage.BOOK__CATEGORY:
				return category != null && !category.isEmpty();
			case ReportingDataPackage.BOOK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ReportingDataPackage.BOOK__OWNER:
				return owner != null;
			case ReportingDataPackage.BOOK__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
			case ReportingDataPackage.BOOK__CREATED_ON:
				return CREATED_ON_EDEFAULT == null ? createdOn != null : !CREATED_ON_EDEFAULT.equals(createdOn);
			case ReportingDataPackage.BOOK__SECTION:
				return section != null && !section.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CategorizableThing.class) {
			switch (derivedFeatureID) {
				case ReportingDataPackage.BOOK__CATEGORY: return SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == NamedThing.class) {
			switch (derivedFeatureID) {
				case ReportingDataPackage.BOOK__NAME: return CommonDataPackage.NAMED_THING__NAME;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (derivedFeatureID) {
				case ReportingDataPackage.BOOK__OWNER: return EngineeringModelDataPackage.OWNED_THING__OWNER;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (derivedFeatureID) {
				case ReportingDataPackage.BOOK__SHORT_NAME: return CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (derivedFeatureID) {
				case ReportingDataPackage.BOOK__CREATED_ON: return CommonDataPackage.TIME_STAMPED_THING__CREATED_ON;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CategorizableThing.class) {
			switch (baseFeatureID) {
				case SiteDirectoryDataPackage.CATEGORIZABLE_THING__CATEGORY: return ReportingDataPackage.BOOK__CATEGORY;
				default: return -1;
			}
		}
		if (baseClass == NamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.NAMED_THING__NAME: return ReportingDataPackage.BOOK__NAME;
				default: return -1;
			}
		}
		if (baseClass == OwnedThing.class) {
			switch (baseFeatureID) {
				case EngineeringModelDataPackage.OWNED_THING__OWNER: return ReportingDataPackage.BOOK__OWNER;
				default: return -1;
			}
		}
		if (baseClass == ShortNamedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.SHORT_NAMED_THING__SHORT_NAME: return ReportingDataPackage.BOOK__SHORT_NAME;
				default: return -1;
			}
		}
		if (baseClass == TimeStampedThing.class) {
			switch (baseFeatureID) {
				case CommonDataPackage.TIME_STAMPED_THING__CREATED_ON: return ReportingDataPackage.BOOK__CREATED_ON;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", shortName: ");
		result.append(shortName);
		result.append(", createdOn: ");
		result.append(createdOn);
		result.append(')');
		return result.toString();
	}

} //BookImpl
