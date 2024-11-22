---
title: CTC Guarantee Balance API phase 5 service guide
weight: 1
description: Software developers, designers, product owners or business analysts. Check a trader's guarantee balance.
---

# CTC Guarantee Balance API phase 5 service guide

Learn how to use [CTC Guarantee Balance API v2.0](https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/common-transit-convention-guarantee-balance/2.0) with your software.

[Learn about key NCTS5 dates](/guides/ctc-traders-phase5-tis/#ncts5-key-dates).

## API overview

The CTC Guarantee Balance API is based on REST principles with an endpoint that returns data in JSON format and it uses standard HTTP error response codes.

Use the API to provide traders with up-to-date information about how much of their guarantee funds they have left to use when organising transit movements. Goods can be delayed if a trader's guarantee balance does not contain sufficient funds.

The API does not provide real-time data about a trader’s guarantee balance. Instead, the API provides a snapshot of the guarantee state at the time when a request is submitted. It is possible that a short delay could coincide with events that could change the trader’s balance information. Guarantee balance responses for a trader could become out of date quickly if the trader has a lot of transit movements progressing at the same time.

The API endpoint relates only to Great Britain and Northern Ireland. You can also use the [HMRC sandbox environment](/api-documentation/docs/sandbox/introduction) to run tests for Great Britain and Northern Ireland transit movements.

You can use the API on its own or you can use it with the [CTC Traders API v2.0](/api-documentation/docs/api/service/common-transit-convention-traders/2.0), which enables your software to send departure and arrival movement notifications to the New Computerised Transit System (NCTS) and get messages sent from customs offices of departure and destination.

### NCTS guarantees explained

If a trader moves goods between the UK and other countries that are part of the Common Transit Convention (CTC), their transit movements must have the appropriate guarantee funds to cover eventualities, such as the loss of goods during transit.

Consequently, each transit declaration sent to the NCTS must include guarantee details. The NCTS checks the guarantee reference number (GRN) quoted against the declared access code. Any validation failures will cause a declaration to be rejected.

You can use more than one guarantee for a transit declaration if they are not comprehensive guarantees or guarantee waivers. A comprehensive guarantee or guarantee waiver that is not sufficient to cover a movement may be topped up by using an individual guarantee or vouchers.

For more information, see [HMRC guidance about NCTS guarantees](https://www.gov.uk/government/publications/the-new-computerised-transit-system-supporting-guidance/ncts-guarantees).

## API status

CTC Guarantee Balance API v2.0:

- supports only NCTS phase 5
- is live in production and available for testing

## Quick start

Learn how to get started with the CTC Guarantee Balance API.

If you are new to the NCTS, you should review all of this document before reviewing other documents for phase 5. If you are migrating from NCTS phase 4 to phase 5, you should review this section at least before reviewing other documents for phase 5.

### Before you start

Before you start using the Guarantee Balance API, you should:

- ensure that you have an HMRC [developer account](/developer/login) - if you don’t have one, you must [register for an account](/developer/registration), activate it by email, and sign in
- add your subscription to this API to your application
- learn about the user-restricted [authentication](/api-documentation/docs/authorisation/user-restricted-endpoints) used by the API  
- [create an application](/developer/applications/) in our sandbox environment
- use the [Create Test User API](/api-documentation/docs/api/service/api-platform-test-user/1.0) to create one or more test users for your sandbox application
- download [NCTS-P5 reference data](https://ec.europa.eu/taxation_customs/dds2/rd/rd_download_home.jsp?Lang=en) that can be used for testing
- read the testing guide (pending) to check that your software is compatible with this version of the API and to learn how to test your application in the sandbox environment

**Note:** If you want to test the API before the testing guide is published, please see [Submit a guarantee balance request](documentation/submit-guarantee-balance-request.html).

### Production environment requirements

Before you can use the production environment for the CTC Guarantee Balance API, you must:

- complete the CTC Guarantee Balance API Application for Production Credentials Checklist (pending)
- use your [developer account](/developer/login) to apply for production credentials

### Get your customers ready

If you work for a software house, each trader you serve must use the [Government Gateway](https://www.access.service.gov.uk/login/signin/creds) to [sign up to the CTC Traders API](https://www.tax.service.gov.uk/customs-enrolment-services/ctc/subscribe?_gl=1*itulmt*_ga*MjA2MDk0MTQyMi4xNjY3Mzk2ODM5*_ga_Y4LWMWY6WS*MTY3NDgyMzU5OC41MS4xLjE2NzQ4NDE2NzcuMC4wLjA.&_ga=2.207635798.536493967.1674469117-2060941422.1667396839) and provide you with the following:

- GB Economic Operators Registration and Identification (EORI) number
- VAT details (optional)
- Standard Industrial Classification (SIC) code
- company or organisation details:
  - unique tax reference (UTR) number
  - registered company name (this must be an exact match)
  - registered company address
  - date of company establishment
- email address
- contact details

## User journeys

These journeys show examples of use:

- [developer setup](documentation/developer-setup.html)
- [submit a guarantee balance request](documentation/submit-guarantee-balance-request.html)

## Process flow

The process flow of a guarantee query check is in the [NCTS Phase 5 Technical Interface Specification](/guides/ctc-traders-phase5-tis/documentation/process_flows.html#guarantee-query-check).

## Terms of use

Your application must comply with [our terms of use](/api-documentation/docs/terms-of-use). You must accept the terms of use before we issue your application’s production credentials.

## Navigating CTC Guarantee Balance API v2.0 documentation

The following table lists the documents for CTC Guarantee Balance API v2.0 and outlines the content and intended readers of each document.

<table>
    <thead>
        <tr>
            <th>Document</th>
            <th>Content type</th>
            <th>Granularity</th>
            <th>Summary</th>
            <th>Intended readers</th>
        </tr>
    </thead>
    <tbody>
        <tr>
          <td><a href="https://developer.service.hmrc.gov.uk/roadmaps/ctc-guarantee-balance-roadmap/">CTC Guarantee Balance API roadmap</a> (covers NCTS4 onwards)</td>
            <td>Functional</td>
            <td>High level</td>
            <td><p>Outlines current status of API for each NCTS phase</p><p>Outlines any development plans for API</p></td>
            <td><p>Software developers</p> <p>Technical architects </p> <p>Product managers</p> <p>Business analysts</p></td>
        </tr>
        <tr>
            <td><a href="https://developer.service.hmrc.gov.uk/guides/ctc-traders-phase5-tis/">NCTS phase 5 technical interface specification</a> (TIS)</td>
            <td>Technical (business logic/rules)</td>
            <td>Low level</td>
            <td><p>Captures UK implementation of NCTS5</p> <p>Shows NCTS5 process flows</p> <p>Lists the message definitions and rules and conditions involved in the exchange of messages between traders and the NCTS for the departure and arrival of transit movements</p></td>
            <td><p>Software developers</p> <p>Technical architects </p> <p>Product managers</p> <p>Business analysts</p></td>
        </tr>
        <tr>
            <td>CTC Guarantee Balance API phase 5 service guide (this document)</td>
            <td>Technical</td>
            <td>High level</td>
            <td><p>How to use the API</p> <p>How to self-onboard</p></td>
            <td><p>Software developers</p> <p>Technical architects</p></td>
        </tr>
        <tr>
            <td><a href="https://developer.service.hmrc.gov.uk/api-documentation/docs/api/service/common-transit-convention-guarantee-balance/2.0/oas/page">CTC Guarantee Balance API v2.0 reference</a></td>
            <td>Technical</td>
            <td>Low level</td>
            <td>How to use each API endpoint</td>
            <td><p>Software developers</p> <p>Technical architects</p></td>
        </tr>
        <tr>
            <td><a href="https://developer.service.hmrc.gov.uk/guides/ctc-guarantee-balance-phase5-testing-guide/">CTC Guarantee Balance API phase 5 testing guide</a></td>
            <td>Functional</td>
            <td>Low level</td>
            <td><p>How to carry out assurance testing of your application software to ensure that it is compatible with the API</p></td>
            <td><p>Software developers</p> <p>Technical architects </p> <p>Product managers</p> <p>Business analysts</p></td>
        </tr>
    </tbody>
</table>


The order in you which you might read these documents can depend on whether you have previous NCTS experience. The following table recommends 2 possible reading orders but you can read the documents in any order you want.

| Suggested reading order | New NCTS users                    | NCTS4 users migrating to NCTS5    |
|-------------------------|-----------------------------------|-----------------------------------|
| 1                       | Roadmap                           | Service guide                     |
| 2                       | Service guide                     | Technical interface specification |
| 3                       | Technical interface specification | Reference                         |
| 4                       | Reference                         | Testing guide                     |
| 5                       | Testing guide                     | Roadmap                           |

**Note:** If you have NCTS4 experience,  it is important that you read the NCTS5 service guide and API reference carefully to understand all of the differences between NCTS4 and NCTS5. Reading only the NCTS5 technical interface specification will NOT guide you about all of the differences between the 2 NCTS phases.

## Related documentation

- [CTC Guarantee Balance API v2.0 changelog](https://github.com/hmrc/common-transit-convention-guarantee-balance/wiki/CTC-Guarantee-Balance-API-v2.0-changelog) (GitHub)

## Getting help and support

Before contacting us, find out if there is planned API downtime or a technical issue by checking [HMRC API Platform Status](https://api-platform-status.production.tax.service.gov.uk) and [New Computerised Transit System service availability](https://www.gov.uk/guidance/new-computerised-transit-system-service-availability).

If you have specific questions about the CTC Guarantee Balance API, contact our Software Developer Support (SDS) Team. You’ll get an initial response within 2 working days.

You can also email questions to [SDSTeam@hmrc.gov.uk](mailto:SDSTeam@hmrc.gov.uk). We might ask for more detailed information when we respond.

## Changelog

You can find the changelog for this document in the [ctc-guarantee-balance-phase5-service-guide](https://github.com/hmrc/ctc-guarantee-balance-phase5-service-guide/wiki/CTC-Guarantee-Balance-API-phase-5-service-guide-changelog) GitHub wiki.
