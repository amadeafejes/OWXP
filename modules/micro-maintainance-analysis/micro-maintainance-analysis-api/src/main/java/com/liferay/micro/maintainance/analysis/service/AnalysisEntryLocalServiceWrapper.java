/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.micro.maintainance.analysis.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AnalysisEntryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AnalysisEntryLocalService
 * @generated
 */
@ProviderType
public class AnalysisEntryLocalServiceWrapper
	implements AnalysisEntryLocalService,
		ServiceWrapper<AnalysisEntryLocalService> {
	public AnalysisEntryLocalServiceWrapper(
		AnalysisEntryLocalService analysisEntryLocalService) {
		_analysisEntryLocalService = analysisEntryLocalService;
	}

	/**
	* Adds the analysis entry to the database. Also notifies the appropriate model listeners.
	*
	* @param analysisEntry the analysis entry
	* @return the analysis entry that was added
	*/
	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry addAnalysisEntry(
		com.liferay.micro.maintainance.analysis.model.AnalysisEntry analysisEntry) {
		return _analysisEntryLocalService.addAnalysisEntry(analysisEntry);
	}

	/**
	* Adds an analysis entry, which will store the votes
	*
	* @param userId: the id of the user who flagged the page
	* @param candidateMaintenanceId: the id of the CandidateMaintenance entry, in which the
	assignment between a task and a candidate is stored.
	* @return the AnalysisEntry that was added
	* @throws PortalException
	*/
	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry addAnalysisEntry(
		long userId, long candidateMaintenanceId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _analysisEntryLocalService.addAnalysisEntry(userId,
			candidateMaintenanceId);
	}

	/**
	* Creates a new analysis entry with the primary key. Does not add the analysis entry to the database.
	*
	* @param analysisEntryId the primary key for the new analysis entry
	* @return the new analysis entry
	*/
	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry createAnalysisEntry(
		long analysisEntryId) {
		return _analysisEntryLocalService.createAnalysisEntry(analysisEntryId);
	}

	/**
	* Deletes the analysis entry from the database. Also notifies the appropriate model listeners.
	*
	* @param analysisEntry the analysis entry
	* @return the analysis entry that was removed
	*/
	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry deleteAnalysisEntry(
		com.liferay.micro.maintainance.analysis.model.AnalysisEntry analysisEntry) {
		return _analysisEntryLocalService.deleteAnalysisEntry(analysisEntry);
	}

	/**
	* Deletes the analysis entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param analysisEntryId the primary key of the analysis entry
	* @return the analysis entry that was removed
	* @throws PortalException if a analysis entry with the primary key could not be found
	*/
	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry deleteAnalysisEntry(
		long analysisEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _analysisEntryLocalService.deleteAnalysisEntry(analysisEntryId);
	}

	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry fetchAnalysisEntry(
		long analysisEntryId) {
		return _analysisEntryLocalService.fetchAnalysisEntry(analysisEntryId);
	}

	/**
	* Returns the analysis entry with the matching UUID and company.
	*
	* @param uuid the analysis entry's UUID
	* @param companyId the primary key of the company
	* @return the matching analysis entry, or <code>null</code> if a matching analysis entry could not be found
	*/
	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry fetchAnalysisEntryByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _analysisEntryLocalService.fetchAnalysisEntryByUuidAndCompanyId(uuid,
			companyId);
	}

	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry getAnalysisByCandidateMaintenance(
		long candidateMaintenanceId) {
		return _analysisEntryLocalService.getAnalysisByCandidateMaintenance(candidateMaintenanceId);
	}

	/**
	* Returns the analysis entry with the primary key.
	*
	* @param analysisEntryId the primary key of the analysis entry
	* @return the analysis entry
	* @throws PortalException if a analysis entry with the primary key could not be found
	*/
	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry getAnalysisEntry(
		long analysisEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _analysisEntryLocalService.getAnalysisEntry(analysisEntryId);
	}

	/**
	* Returns the analysis entry with the matching UUID and company.
	*
	* @param uuid the analysis entry's UUID
	* @param companyId the primary key of the company
	* @return the matching analysis entry
	* @throws PortalException if a matching analysis entry could not be found
	*/
	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry getAnalysisEntryByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _analysisEntryLocalService.getAnalysisEntryByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Updates the analysis entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param analysisEntry the analysis entry
	* @return the analysis entry that was updated
	*/
	@Override
	public com.liferay.micro.maintainance.analysis.model.AnalysisEntry updateAnalysisEntry(
		com.liferay.micro.maintainance.analysis.model.AnalysisEntry analysisEntry) {
		return _analysisEntryLocalService.updateAnalysisEntry(analysisEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _analysisEntryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _analysisEntryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _analysisEntryLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _analysisEntryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _analysisEntryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _analysisEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of analysis entries.
	*
	* @return the number of analysis entries
	*/
	@Override
	public int getAnalysisEntriesCount() {
		return _analysisEntryLocalService.getAnalysisEntriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _analysisEntryLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _analysisEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.micro.maintainance.analysis.model.impl.AnalysisEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _analysisEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.micro.maintainance.analysis.model.impl.AnalysisEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _analysisEntryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the analysis entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.micro.maintainance.analysis.model.impl.AnalysisEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of analysis entries
	* @param end the upper bound of the range of analysis entries (not inclusive)
	* @return the range of analysis entries
	*/
	@Override
	public java.util.List<com.liferay.micro.maintainance.analysis.model.AnalysisEntry> getAnalysisEntries(
		int start, int end) {
		return _analysisEntryLocalService.getAnalysisEntries(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _analysisEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _analysisEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AnalysisEntryLocalService getWrappedService() {
		return _analysisEntryLocalService;
	}

	@Override
	public void setWrappedService(
		AnalysisEntryLocalService analysisEntryLocalService) {
		_analysisEntryLocalService = analysisEntryLocalService;
	}

	private AnalysisEntryLocalService _analysisEntryLocalService;
}