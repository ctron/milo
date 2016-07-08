/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 * 	http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * 	http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.stack.core;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.Unsigned;

public class Identifiers {

    public static final org.eclipse.milo.opcua.stack.core.types.builtin.NodeId Boolean = init(1);
    public static final NodeId SByte = init(2);
    public static final NodeId Byte = init(3);
    public static final NodeId Int16 = init(4);
    public static final NodeId UInt16 = init(5);
    public static final NodeId Int32 = init(6);
    public static final NodeId UInt32 = init(7);
    public static final NodeId Int64 = init(8);
    public static final NodeId UInt64 = init(9);
    public static final NodeId Float = init(10);
    public static final NodeId Double = init(11);
    public static final NodeId String = init(12);
    public static final NodeId DateTime = init(13);
    public static final NodeId Guid = init(14);
    public static final NodeId ByteString = init(15);
    public static final NodeId XmlElement = init(16);
    public static final NodeId NodeId = init(17);
    public static final NodeId ExpandedNodeId = init(18);
    public static final NodeId StatusCode = init(19);
    public static final NodeId QualifiedName = init(20);
    public static final NodeId LocalizedText = init(21);
    public static final NodeId Structure = init(22);
    public static final NodeId DataValue = init(23);
    public static final NodeId BaseDataType = init(24);
    public static final NodeId DiagnosticInfo = init(25);
    public static final NodeId Number = init(26);
    public static final NodeId Integer = init(27);
    public static final NodeId UInteger = init(28);
    public static final NodeId Enumeration = init(29);
    public static final NodeId Image = init(30);
    public static final NodeId References = init(31);
    public static final NodeId NonHierarchicalReferences = init(32);
    public static final NodeId HierarchicalReferences = init(33);
    public static final NodeId HasChild = init(34);
    public static final NodeId Organizes = init(35);
    public static final NodeId HasEventSource = init(36);
    public static final NodeId HasModellingRule = init(37);
    public static final NodeId HasEncoding = init(38);
    public static final NodeId HasDescription = init(39);
    public static final NodeId HasTypeDefinition = init(40);
    public static final NodeId GeneratesEvent = init(41);
    public static final NodeId Aggregates = init(44);
    public static final NodeId HasSubtype = init(45);
    public static final NodeId HasProperty = init(46);
    public static final NodeId HasComponent = init(47);
    public static final NodeId HasNotifier = init(48);
    public static final NodeId HasOrderedComponent = init(49);
    public static final NodeId FromState = init(51);
    public static final NodeId ToState = init(52);
    public static final NodeId HasCause = init(53);
    public static final NodeId HasEffect = init(54);
    public static final NodeId HasHistoricalConfiguration = init(56);
    public static final NodeId BaseObjectType = init(58);
    public static final NodeId FolderType = init(61);
    public static final NodeId BaseVariableType = init(62);
    public static final NodeId BaseDataVariableType = init(63);
    public static final NodeId PropertyType = init(68);
    public static final NodeId DataTypeDescriptionType = init(69);
    public static final NodeId DataTypeDictionaryType = init(72);
    public static final NodeId DataTypeSystemType = init(75);
    public static final NodeId DataTypeEncodingType = init(76);
    public static final NodeId ModellingRuleType = init(77);
    public static final NodeId ModellingRule_Mandatory = init(78);
    public static final NodeId ModellingRule_MandatoryShared = init(79);
    public static final NodeId ModellingRule_Optional = init(80);
    public static final NodeId ModellingRule_ExposesItsArray = init(83);
    public static final NodeId RootFolder = init(84);
    public static final NodeId ObjectsFolder = init(85);
    public static final NodeId TypesFolder = init(86);
    public static final NodeId ViewsFolder = init(87);
    public static final NodeId ObjectTypesFolder = init(88);
    public static final NodeId VariableTypesFolder = init(89);
    public static final NodeId DataTypesFolder = init(90);
    public static final NodeId ReferenceTypesFolder = init(91);
    public static final NodeId XmlSchema_TypeSystem = init(92);
    public static final NodeId OPCBinarySchema_TypeSystem = init(93);
    public static final NodeId DataTypeDescriptionType_DataTypeVersion = init(104);
    public static final NodeId DataTypeDescriptionType_DictionaryFragment = init(105);
    public static final NodeId DataTypeDictionaryType_DataTypeVersion = init(106);
    public static final NodeId DataTypeDictionaryType_NamespaceUri = init(107);
    public static final NodeId ModellingRuleType_NamingRule = init(111);
    public static final NodeId ModellingRule_Mandatory_NamingRule = init(112);
    public static final NodeId ModellingRule_Optional_NamingRule = init(113);
    public static final NodeId ModellingRule_ExposesItsArray_NamingRule = init(114);
    public static final NodeId ModellingRule_MandatoryShared_NamingRule = init(116);
    public static final NodeId HasSubStateMachine = init(117);
    public static final NodeId NamingRuleType = init(120);
    public static final NodeId Decimal128 = init(121);
    public static final NodeId IdType = init(256);
    public static final NodeId NodeClass = init(257);
    public static final NodeId Node = init(258);
    public static final NodeId Node_Encoding_DefaultXml = init(259);
    public static final NodeId Node_Encoding_DefaultBinary = init(260);
    public static final NodeId ObjectNode = init(261);
    public static final NodeId ObjectNode_Encoding_DefaultXml = init(262);
    public static final NodeId ObjectNode_Encoding_DefaultBinary = init(263);
    public static final NodeId ObjectTypeNode = init(264);
    public static final NodeId ObjectTypeNode_Encoding_DefaultXml = init(265);
    public static final NodeId ObjectTypeNode_Encoding_DefaultBinary = init(266);
    public static final NodeId VariableNode = init(267);
    public static final NodeId VariableNode_Encoding_DefaultXml = init(268);
    public static final NodeId VariableNode_Encoding_DefaultBinary = init(269);
    public static final NodeId VariableTypeNode = init(270);
    public static final NodeId VariableTypeNode_Encoding_DefaultXml = init(271);
    public static final NodeId VariableTypeNode_Encoding_DefaultBinary = init(272);
    public static final NodeId ReferenceTypeNode = init(273);
    public static final NodeId ReferenceTypeNode_Encoding_DefaultXml = init(274);
    public static final NodeId ReferenceTypeNode_Encoding_DefaultBinary = init(275);
    public static final NodeId MethodNode = init(276);
    public static final NodeId MethodNode_Encoding_DefaultXml = init(277);
    public static final NodeId MethodNode_Encoding_DefaultBinary = init(278);
    public static final NodeId ViewNode = init(279);
    public static final NodeId ViewNode_Encoding_DefaultXml = init(280);
    public static final NodeId ViewNode_Encoding_DefaultBinary = init(281);
    public static final NodeId DataTypeNode = init(282);
    public static final NodeId DataTypeNode_Encoding_DefaultXml = init(283);
    public static final NodeId DataTypeNode_Encoding_DefaultBinary = init(284);
    public static final NodeId ReferenceNode = init(285);
    public static final NodeId ReferenceNode_Encoding_DefaultXml = init(286);
    public static final NodeId ReferenceNode_Encoding_DefaultBinary = init(287);
    public static final NodeId IntegerId = init(288);
    public static final NodeId Counter = init(289);
    public static final NodeId Duration = init(290);
    public static final NodeId NumericRange = init(291);
    public static final NodeId Time = init(292);
    public static final NodeId Date = init(293);
    public static final NodeId UtcTime = init(294);
    public static final NodeId LocaleId = init(295);
    public static final NodeId Argument = init(296);
    public static final NodeId Argument_Encoding_DefaultXml = init(297);
    public static final NodeId Argument_Encoding_DefaultBinary = init(298);
    public static final NodeId StatusResult = init(299);
    public static final NodeId StatusResult_Encoding_DefaultXml = init(300);
    public static final NodeId StatusResult_Encoding_DefaultBinary = init(301);
    public static final NodeId MessageSecurityMode = init(302);
    public static final NodeId UserTokenType = init(303);
    public static final NodeId UserTokenPolicy = init(304);
    public static final NodeId UserTokenPolicy_Encoding_DefaultXml = init(305);
    public static final NodeId UserTokenPolicy_Encoding_DefaultBinary = init(306);
    public static final NodeId ApplicationType = init(307);
    public static final NodeId ApplicationDescription = init(308);
    public static final NodeId ApplicationDescription_Encoding_DefaultXml = init(309);
    public static final NodeId ApplicationDescription_Encoding_DefaultBinary = init(310);
    public static final NodeId ApplicationInstanceCertificate = init(311);
    public static final NodeId EndpointDescription = init(312);
    public static final NodeId EndpointDescription_Encoding_DefaultXml = init(313);
    public static final NodeId EndpointDescription_Encoding_DefaultBinary = init(314);
    public static final NodeId SecurityTokenRequestType = init(315);
    public static final NodeId UserIdentityToken = init(316);
    public static final NodeId UserIdentityToken_Encoding_DefaultXml = init(317);
    public static final NodeId UserIdentityToken_Encoding_DefaultBinary = init(318);
    public static final NodeId AnonymousIdentityToken = init(319);
    public static final NodeId AnonymousIdentityToken_Encoding_DefaultXml = init(320);
    public static final NodeId AnonymousIdentityToken_Encoding_DefaultBinary = init(321);
    public static final NodeId UserNameIdentityToken = init(322);
    public static final NodeId UserNameIdentityToken_Encoding_DefaultXml = init(323);
    public static final NodeId UserNameIdentityToken_Encoding_DefaultBinary = init(324);
    public static final NodeId X509IdentityToken = init(325);
    public static final NodeId X509IdentityToken_Encoding_DefaultXml = init(326);
    public static final NodeId X509IdentityToken_Encoding_DefaultBinary = init(327);
    public static final NodeId EndpointConfiguration = init(331);
    public static final NodeId EndpointConfiguration_Encoding_DefaultXml = init(332);
    public static final NodeId EndpointConfiguration_Encoding_DefaultBinary = init(333);
    public static final NodeId ComplianceLevel = init(334);
    public static final NodeId SupportedProfile = init(335);
    public static final NodeId SupportedProfile_Encoding_DefaultXml = init(336);
    public static final NodeId SupportedProfile_Encoding_DefaultBinary = init(337);
    public static final NodeId BuildInfo = init(338);
    public static final NodeId BuildInfo_Encoding_DefaultXml = init(339);
    public static final NodeId BuildInfo_Encoding_DefaultBinary = init(340);
    public static final NodeId SoftwareCertificate = init(341);
    public static final NodeId SoftwareCertificate_Encoding_DefaultXml = init(342);
    public static final NodeId SoftwareCertificate_Encoding_DefaultBinary = init(343);
    public static final NodeId SignedSoftwareCertificate = init(344);
    public static final NodeId SignedSoftwareCertificate_Encoding_DefaultXml = init(345);
    public static final NodeId SignedSoftwareCertificate_Encoding_DefaultBinary = init(346);
    public static final NodeId AttributeWriteMask = init(347);
    public static final NodeId NodeAttributesMask = init(348);
    public static final NodeId NodeAttributes = init(349);
    public static final NodeId NodeAttributes_Encoding_DefaultXml = init(350);
    public static final NodeId NodeAttributes_Encoding_DefaultBinary = init(351);
    public static final NodeId ObjectAttributes = init(352);
    public static final NodeId ObjectAttributes_Encoding_DefaultXml = init(353);
    public static final NodeId ObjectAttributes_Encoding_DefaultBinary = init(354);
    public static final NodeId VariableAttributes = init(355);
    public static final NodeId VariableAttributes_Encoding_DefaultXml = init(356);
    public static final NodeId VariableAttributes_Encoding_DefaultBinary = init(357);
    public static final NodeId MethodAttributes = init(358);
    public static final NodeId MethodAttributes_Encoding_DefaultXml = init(359);
    public static final NodeId MethodAttributes_Encoding_DefaultBinary = init(360);
    public static final NodeId ObjectTypeAttributes = init(361);
    public static final NodeId ObjectTypeAttributes_Encoding_DefaultXml = init(362);
    public static final NodeId ObjectTypeAttributes_Encoding_DefaultBinary = init(363);
    public static final NodeId VariableTypeAttributes = init(364);
    public static final NodeId VariableTypeAttributes_Encoding_DefaultXml = init(365);
    public static final NodeId VariableTypeAttributes_Encoding_DefaultBinary = init(366);
    public static final NodeId ReferenceTypeAttributes = init(367);
    public static final NodeId ReferenceTypeAttributes_Encoding_DefaultXml = init(368);
    public static final NodeId ReferenceTypeAttributes_Encoding_DefaultBinary = init(369);
    public static final NodeId DataTypeAttributes = init(370);
    public static final NodeId DataTypeAttributes_Encoding_DefaultXml = init(371);
    public static final NodeId DataTypeAttributes_Encoding_DefaultBinary = init(372);
    public static final NodeId ViewAttributes = init(373);
    public static final NodeId ViewAttributes_Encoding_DefaultXml = init(374);
    public static final NodeId ViewAttributes_Encoding_DefaultBinary = init(375);
    public static final NodeId AddNodesItem = init(376);
    public static final NodeId AddNodesItem_Encoding_DefaultXml = init(377);
    public static final NodeId AddNodesItem_Encoding_DefaultBinary = init(378);
    public static final NodeId AddReferencesItem = init(379);
    public static final NodeId AddReferencesItem_Encoding_DefaultXml = init(380);
    public static final NodeId AddReferencesItem_Encoding_DefaultBinary = init(381);
    public static final NodeId DeleteNodesItem = init(382);
    public static final NodeId DeleteNodesItem_Encoding_DefaultXml = init(383);
    public static final NodeId DeleteNodesItem_Encoding_DefaultBinary = init(384);
    public static final NodeId DeleteReferencesItem = init(385);
    public static final NodeId DeleteReferencesItem_Encoding_DefaultXml = init(386);
    public static final NodeId DeleteReferencesItem_Encoding_DefaultBinary = init(387);
    public static final NodeId SessionAuthenticationToken = init(388);
    public static final NodeId RequestHeader = init(389);
    public static final NodeId RequestHeader_Encoding_DefaultXml = init(390);
    public static final NodeId RequestHeader_Encoding_DefaultBinary = init(391);
    public static final NodeId ResponseHeader = init(392);
    public static final NodeId ResponseHeader_Encoding_DefaultXml = init(393);
    public static final NodeId ResponseHeader_Encoding_DefaultBinary = init(394);
    public static final NodeId ServiceFault = init(395);
    public static final NodeId ServiceFault_Encoding_DefaultXml = init(396);
    public static final NodeId ServiceFault_Encoding_DefaultBinary = init(397);
    public static final NodeId EnumeratedTestType = init(398);
    public static final NodeId FindServersRequest = init(420);
    public static final NodeId FindServersRequest_Encoding_DefaultXml = init(421);
    public static final NodeId FindServersRequest_Encoding_DefaultBinary = init(422);
    public static final NodeId FindServersResponse = init(423);
    public static final NodeId FindServersResponse_Encoding_DefaultXml = init(424);
    public static final NodeId FindServersResponse_Encoding_DefaultBinary = init(425);
    public static final NodeId GetEndpointsRequest = init(426);
    public static final NodeId GetEndpointsRequest_Encoding_DefaultXml = init(427);
    public static final NodeId GetEndpointsRequest_Encoding_DefaultBinary = init(428);
    public static final NodeId GetEndpointsResponse = init(429);
    public static final NodeId GetEndpointsResponse_Encoding_DefaultXml = init(430);
    public static final NodeId GetEndpointsResponse_Encoding_DefaultBinary = init(431);
    public static final NodeId RegisteredServer = init(432);
    public static final NodeId RegisteredServer_Encoding_DefaultXml = init(433);
    public static final NodeId RegisteredServer_Encoding_DefaultBinary = init(434);
    public static final NodeId RegisterServerRequest = init(435);
    public static final NodeId RegisterServerRequest_Encoding_DefaultXml = init(436);
    public static final NodeId RegisterServerRequest_Encoding_DefaultBinary = init(437);
    public static final NodeId RegisterServerResponse = init(438);
    public static final NodeId RegisterServerResponse_Encoding_DefaultXml = init(439);
    public static final NodeId RegisterServerResponse_Encoding_DefaultBinary = init(440);
    public static final NodeId ChannelSecurityToken = init(441);
    public static final NodeId ChannelSecurityToken_Encoding_DefaultXml = init(442);
    public static final NodeId ChannelSecurityToken_Encoding_DefaultBinary = init(443);
    public static final NodeId OpenSecureChannelRequest = init(444);
    public static final NodeId OpenSecureChannelRequest_Encoding_DefaultXml = init(445);
    public static final NodeId OpenSecureChannelRequest_Encoding_DefaultBinary = init(446);
    public static final NodeId OpenSecureChannelResponse = init(447);
    public static final NodeId OpenSecureChannelResponse_Encoding_DefaultXml = init(448);
    public static final NodeId OpenSecureChannelResponse_Encoding_DefaultBinary = init(449);
    public static final NodeId CloseSecureChannelRequest = init(450);
    public static final NodeId CloseSecureChannelRequest_Encoding_DefaultXml = init(451);
    public static final NodeId CloseSecureChannelRequest_Encoding_DefaultBinary = init(452);
    public static final NodeId CloseSecureChannelResponse = init(453);
    public static final NodeId CloseSecureChannelResponse_Encoding_DefaultXml = init(454);
    public static final NodeId CloseSecureChannelResponse_Encoding_DefaultBinary = init(455);
    public static final NodeId SignatureData = init(456);
    public static final NodeId SignatureData_Encoding_DefaultXml = init(457);
    public static final NodeId SignatureData_Encoding_DefaultBinary = init(458);
    public static final NodeId CreateSessionRequest = init(459);
    public static final NodeId CreateSessionRequest_Encoding_DefaultXml = init(460);
    public static final NodeId CreateSessionRequest_Encoding_DefaultBinary = init(461);
    public static final NodeId CreateSessionResponse = init(462);
    public static final NodeId CreateSessionResponse_Encoding_DefaultXml = init(463);
    public static final NodeId CreateSessionResponse_Encoding_DefaultBinary = init(464);
    public static final NodeId ActivateSessionRequest = init(465);
    public static final NodeId ActivateSessionRequest_Encoding_DefaultXml = init(466);
    public static final NodeId ActivateSessionRequest_Encoding_DefaultBinary = init(467);
    public static final NodeId ActivateSessionResponse = init(468);
    public static final NodeId ActivateSessionResponse_Encoding_DefaultXml = init(469);
    public static final NodeId ActivateSessionResponse_Encoding_DefaultBinary = init(470);
    public static final NodeId CloseSessionRequest = init(471);
    public static final NodeId CloseSessionRequest_Encoding_DefaultXml = init(472);
    public static final NodeId CloseSessionRequest_Encoding_DefaultBinary = init(473);
    public static final NodeId CloseSessionResponse = init(474);
    public static final NodeId CloseSessionResponse_Encoding_DefaultXml = init(475);
    public static final NodeId CloseSessionResponse_Encoding_DefaultBinary = init(476);
    public static final NodeId CancelRequest = init(477);
    public static final NodeId CancelRequest_Encoding_DefaultXml = init(478);
    public static final NodeId CancelRequest_Encoding_DefaultBinary = init(479);
    public static final NodeId CancelResponse = init(480);
    public static final NodeId CancelResponse_Encoding_DefaultXml = init(481);
    public static final NodeId CancelResponse_Encoding_DefaultBinary = init(482);
    public static final NodeId AddNodesResult = init(483);
    public static final NodeId AddNodesResult_Encoding_DefaultXml = init(484);
    public static final NodeId AddNodesResult_Encoding_DefaultBinary = init(485);
    public static final NodeId AddNodesRequest = init(486);
    public static final NodeId AddNodesRequest_Encoding_DefaultXml = init(487);
    public static final NodeId AddNodesRequest_Encoding_DefaultBinary = init(488);
    public static final NodeId AddNodesResponse = init(489);
    public static final NodeId AddNodesResponse_Encoding_DefaultXml = init(490);
    public static final NodeId AddNodesResponse_Encoding_DefaultBinary = init(491);
    public static final NodeId AddReferencesRequest = init(492);
    public static final NodeId AddReferencesRequest_Encoding_DefaultXml = init(493);
    public static final NodeId AddReferencesRequest_Encoding_DefaultBinary = init(494);
    public static final NodeId AddReferencesResponse = init(495);
    public static final NodeId AddReferencesResponse_Encoding_DefaultXml = init(496);
    public static final NodeId AddReferencesResponse_Encoding_DefaultBinary = init(497);
    public static final NodeId DeleteNodesRequest = init(498);
    public static final NodeId DeleteNodesRequest_Encoding_DefaultXml = init(499);
    public static final NodeId DeleteNodesRequest_Encoding_DefaultBinary = init(500);
    public static final NodeId DeleteNodesResponse = init(501);
    public static final NodeId DeleteNodesResponse_Encoding_DefaultXml = init(502);
    public static final NodeId DeleteNodesResponse_Encoding_DefaultBinary = init(503);
    public static final NodeId DeleteReferencesRequest = init(504);
    public static final NodeId DeleteReferencesRequest_Encoding_DefaultXml = init(505);
    public static final NodeId DeleteReferencesRequest_Encoding_DefaultBinary = init(506);
    public static final NodeId DeleteReferencesResponse = init(507);
    public static final NodeId DeleteReferencesResponse_Encoding_DefaultXml = init(508);
    public static final NodeId DeleteReferencesResponse_Encoding_DefaultBinary = init(509);
    public static final NodeId BrowseDirection = init(510);
    public static final NodeId ViewDescription = init(511);
    public static final NodeId ViewDescription_Encoding_DefaultXml = init(512);
    public static final NodeId ViewDescription_Encoding_DefaultBinary = init(513);
    public static final NodeId BrowseDescription = init(514);
    public static final NodeId BrowseDescription_Encoding_DefaultXml = init(515);
    public static final NodeId BrowseDescription_Encoding_DefaultBinary = init(516);
    public static final NodeId BrowseResultMask = init(517);
    public static final NodeId ReferenceDescription = init(518);
    public static final NodeId ReferenceDescription_Encoding_DefaultXml = init(519);
    public static final NodeId ReferenceDescription_Encoding_DefaultBinary = init(520);
    public static final NodeId ContinuationPoint = init(521);
    public static final NodeId BrowseResult = init(522);
    public static final NodeId BrowseResult_Encoding_DefaultXml = init(523);
    public static final NodeId BrowseResult_Encoding_DefaultBinary = init(524);
    public static final NodeId BrowseRequest = init(525);
    public static final NodeId BrowseRequest_Encoding_DefaultXml = init(526);
    public static final NodeId BrowseRequest_Encoding_DefaultBinary = init(527);
    public static final NodeId BrowseResponse = init(528);
    public static final NodeId BrowseResponse_Encoding_DefaultXml = init(529);
    public static final NodeId BrowseResponse_Encoding_DefaultBinary = init(530);
    public static final NodeId BrowseNextRequest = init(531);
    public static final NodeId BrowseNextRequest_Encoding_DefaultXml = init(532);
    public static final NodeId BrowseNextRequest_Encoding_DefaultBinary = init(533);
    public static final NodeId BrowseNextResponse = init(534);
    public static final NodeId BrowseNextResponse_Encoding_DefaultXml = init(535);
    public static final NodeId BrowseNextResponse_Encoding_DefaultBinary = init(536);
    public static final NodeId RelativePathElement = init(537);
    public static final NodeId RelativePathElement_Encoding_DefaultXml = init(538);
    public static final NodeId RelativePathElement_Encoding_DefaultBinary = init(539);
    public static final NodeId RelativePath = init(540);
    public static final NodeId RelativePath_Encoding_DefaultXml = init(541);
    public static final NodeId RelativePath_Encoding_DefaultBinary = init(542);
    public static final NodeId BrowsePath = init(543);
    public static final NodeId BrowsePath_Encoding_DefaultXml = init(544);
    public static final NodeId BrowsePath_Encoding_DefaultBinary = init(545);
    public static final NodeId BrowsePathTarget = init(546);
    public static final NodeId BrowsePathTarget_Encoding_DefaultXml = init(547);
    public static final NodeId BrowsePathTarget_Encoding_DefaultBinary = init(548);
    public static final NodeId BrowsePathResult = init(549);
    public static final NodeId BrowsePathResult_Encoding_DefaultXml = init(550);
    public static final NodeId BrowsePathResult_Encoding_DefaultBinary = init(551);
    public static final NodeId TranslateBrowsePathsToNodeIdsRequest = init(552);
    public static final NodeId TranslateBrowsePathsToNodeIdsRequest_Encoding_DefaultXml = init(553);
    public static final NodeId TranslateBrowsePathsToNodeIdsRequest_Encoding_DefaultBinary = init(554);
    public static final NodeId TranslateBrowsePathsToNodeIdsResponse = init(555);
    public static final NodeId TranslateBrowsePathsToNodeIdsResponse_Encoding_DefaultXml = init(556);
    public static final NodeId TranslateBrowsePathsToNodeIdsResponse_Encoding_DefaultBinary = init(557);
    public static final NodeId RegisterNodesRequest = init(558);
    public static final NodeId RegisterNodesRequest_Encoding_DefaultXml = init(559);
    public static final NodeId RegisterNodesRequest_Encoding_DefaultBinary = init(560);
    public static final NodeId RegisterNodesResponse = init(561);
    public static final NodeId RegisterNodesResponse_Encoding_DefaultXml = init(562);
    public static final NodeId RegisterNodesResponse_Encoding_DefaultBinary = init(563);
    public static final NodeId UnregisterNodesRequest = init(564);
    public static final NodeId UnregisterNodesRequest_Encoding_DefaultXml = init(565);
    public static final NodeId UnregisterNodesRequest_Encoding_DefaultBinary = init(566);
    public static final NodeId UnregisterNodesResponse = init(567);
    public static final NodeId UnregisterNodesResponse_Encoding_DefaultXml = init(568);
    public static final NodeId UnregisterNodesResponse_Encoding_DefaultBinary = init(569);
    public static final NodeId QueryDataDescription = init(570);
    public static final NodeId QueryDataDescription_Encoding_DefaultXml = init(571);
    public static final NodeId QueryDataDescription_Encoding_DefaultBinary = init(572);
    public static final NodeId NodeTypeDescription = init(573);
    public static final NodeId NodeTypeDescription_Encoding_DefaultXml = init(574);
    public static final NodeId NodeTypeDescription_Encoding_DefaultBinary = init(575);
    public static final NodeId FilterOperator = init(576);
    public static final NodeId QueryDataSet = init(577);
    public static final NodeId QueryDataSet_Encoding_DefaultXml = init(578);
    public static final NodeId QueryDataSet_Encoding_DefaultBinary = init(579);
    public static final NodeId NodeReference = init(580);
    public static final NodeId NodeReference_Encoding_DefaultXml = init(581);
    public static final NodeId NodeReference_Encoding_DefaultBinary = init(582);
    public static final NodeId ContentFilterElement = init(583);
    public static final NodeId ContentFilterElement_Encoding_DefaultXml = init(584);
    public static final NodeId ContentFilterElement_Encoding_DefaultBinary = init(585);
    public static final NodeId ContentFilter = init(586);
    public static final NodeId ContentFilter_Encoding_DefaultXml = init(587);
    public static final NodeId ContentFilter_Encoding_DefaultBinary = init(588);
    public static final NodeId FilterOperand = init(589);
    public static final NodeId FilterOperand_Encoding_DefaultXml = init(590);
    public static final NodeId FilterOperand_Encoding_DefaultBinary = init(591);
    public static final NodeId ElementOperand = init(592);
    public static final NodeId ElementOperand_Encoding_DefaultXml = init(593);
    public static final NodeId ElementOperand_Encoding_DefaultBinary = init(594);
    public static final NodeId LiteralOperand = init(595);
    public static final NodeId LiteralOperand_Encoding_DefaultXml = init(596);
    public static final NodeId LiteralOperand_Encoding_DefaultBinary = init(597);
    public static final NodeId AttributeOperand = init(598);
    public static final NodeId AttributeOperand_Encoding_DefaultXml = init(599);
    public static final NodeId AttributeOperand_Encoding_DefaultBinary = init(600);
    public static final NodeId SimpleAttributeOperand = init(601);
    public static final NodeId SimpleAttributeOperand_Encoding_DefaultXml = init(602);
    public static final NodeId SimpleAttributeOperand_Encoding_DefaultBinary = init(603);
    public static final NodeId ContentFilterElementResult = init(604);
    public static final NodeId ContentFilterElementResult_Encoding_DefaultXml = init(605);
    public static final NodeId ContentFilterElementResult_Encoding_DefaultBinary = init(606);
    public static final NodeId ContentFilterResult = init(607);
    public static final NodeId ContentFilterResult_Encoding_DefaultXml = init(608);
    public static final NodeId ContentFilterResult_Encoding_DefaultBinary = init(609);
    public static final NodeId ParsingResult = init(610);
    public static final NodeId ParsingResult_Encoding_DefaultXml = init(611);
    public static final NodeId ParsingResult_Encoding_DefaultBinary = init(612);
    public static final NodeId QueryFirstRequest = init(613);
    public static final NodeId QueryFirstRequest_Encoding_DefaultXml = init(614);
    public static final NodeId QueryFirstRequest_Encoding_DefaultBinary = init(615);
    public static final NodeId QueryFirstResponse = init(616);
    public static final NodeId QueryFirstResponse_Encoding_DefaultXml = init(617);
    public static final NodeId QueryFirstResponse_Encoding_DefaultBinary = init(618);
    public static final NodeId QueryNextRequest = init(619);
    public static final NodeId QueryNextRequest_Encoding_DefaultXml = init(620);
    public static final NodeId QueryNextRequest_Encoding_DefaultBinary = init(621);
    public static final NodeId QueryNextResponse = init(622);
    public static final NodeId QueryNextResponse_Encoding_DefaultXml = init(623);
    public static final NodeId QueryNextResponse_Encoding_DefaultBinary = init(624);
    public static final NodeId TimestampsToReturn = init(625);
    public static final NodeId ReadValueId = init(626);
    public static final NodeId ReadValueId_Encoding_DefaultXml = init(627);
    public static final NodeId ReadValueId_Encoding_DefaultBinary = init(628);
    public static final NodeId ReadRequest = init(629);
    public static final NodeId ReadRequest_Encoding_DefaultXml = init(630);
    public static final NodeId ReadRequest_Encoding_DefaultBinary = init(631);
    public static final NodeId ReadResponse = init(632);
    public static final NodeId ReadResponse_Encoding_DefaultXml = init(633);
    public static final NodeId ReadResponse_Encoding_DefaultBinary = init(634);
    public static final NodeId HistoryReadValueId = init(635);
    public static final NodeId HistoryReadValueId_Encoding_DefaultXml = init(636);
    public static final NodeId HistoryReadValueId_Encoding_DefaultBinary = init(637);
    public static final NodeId HistoryReadResult = init(638);
    public static final NodeId HistoryReadResult_Encoding_DefaultXml = init(639);
    public static final NodeId HistoryReadResult_Encoding_DefaultBinary = init(640);
    public static final NodeId HistoryReadDetails = init(641);
    public static final NodeId HistoryReadDetails_Encoding_DefaultXml = init(642);
    public static final NodeId HistoryReadDetails_Encoding_DefaultBinary = init(643);
    public static final NodeId ReadEventDetails = init(644);
    public static final NodeId ReadEventDetails_Encoding_DefaultXml = init(645);
    public static final NodeId ReadEventDetails_Encoding_DefaultBinary = init(646);
    public static final NodeId ReadRawModifiedDetails = init(647);
    public static final NodeId ReadRawModifiedDetails_Encoding_DefaultXml = init(648);
    public static final NodeId ReadRawModifiedDetails_Encoding_DefaultBinary = init(649);
    public static final NodeId ReadProcessedDetails = init(650);
    public static final NodeId ReadProcessedDetails_Encoding_DefaultXml = init(651);
    public static final NodeId ReadProcessedDetails_Encoding_DefaultBinary = init(652);
    public static final NodeId ReadAtTimeDetails = init(653);
    public static final NodeId ReadAtTimeDetails_Encoding_DefaultXml = init(654);
    public static final NodeId ReadAtTimeDetails_Encoding_DefaultBinary = init(655);
    public static final NodeId HistoryData = init(656);
    public static final NodeId HistoryData_Encoding_DefaultXml = init(657);
    public static final NodeId HistoryData_Encoding_DefaultBinary = init(658);
    public static final NodeId HistoryEvent = init(659);
    public static final NodeId HistoryEvent_Encoding_DefaultXml = init(660);
    public static final NodeId HistoryEvent_Encoding_DefaultBinary = init(661);
    public static final NodeId HistoryReadRequest = init(662);
    public static final NodeId HistoryReadRequest_Encoding_DefaultXml = init(663);
    public static final NodeId HistoryReadRequest_Encoding_DefaultBinary = init(664);
    public static final NodeId HistoryReadResponse = init(665);
    public static final NodeId HistoryReadResponse_Encoding_DefaultXml = init(666);
    public static final NodeId HistoryReadResponse_Encoding_DefaultBinary = init(667);
    public static final NodeId WriteValue = init(668);
    public static final NodeId WriteValue_Encoding_DefaultXml = init(669);
    public static final NodeId WriteValue_Encoding_DefaultBinary = init(670);
    public static final NodeId WriteRequest = init(671);
    public static final NodeId WriteRequest_Encoding_DefaultXml = init(672);
    public static final NodeId WriteRequest_Encoding_DefaultBinary = init(673);
    public static final NodeId WriteResponse = init(674);
    public static final NodeId WriteResponse_Encoding_DefaultXml = init(675);
    public static final NodeId WriteResponse_Encoding_DefaultBinary = init(676);
    public static final NodeId HistoryUpdateDetails = init(677);
    public static final NodeId HistoryUpdateDetails_Encoding_DefaultXml = init(678);
    public static final NodeId HistoryUpdateDetails_Encoding_DefaultBinary = init(679);
    public static final NodeId UpdateDataDetails = init(680);
    public static final NodeId UpdateDataDetails_Encoding_DefaultXml = init(681);
    public static final NodeId UpdateDataDetails_Encoding_DefaultBinary = init(682);
    public static final NodeId UpdateEventDetails = init(683);
    public static final NodeId UpdateEventDetails_Encoding_DefaultXml = init(684);
    public static final NodeId UpdateEventDetails_Encoding_DefaultBinary = init(685);
    public static final NodeId DeleteRawModifiedDetails = init(686);
    public static final NodeId DeleteRawModifiedDetails_Encoding_DefaultXml = init(687);
    public static final NodeId DeleteRawModifiedDetails_Encoding_DefaultBinary = init(688);
    public static final NodeId DeleteAtTimeDetails = init(689);
    public static final NodeId DeleteAtTimeDetails_Encoding_DefaultXml = init(690);
    public static final NodeId DeleteAtTimeDetails_Encoding_DefaultBinary = init(691);
    public static final NodeId DeleteEventDetails = init(692);
    public static final NodeId DeleteEventDetails_Encoding_DefaultXml = init(693);
    public static final NodeId DeleteEventDetails_Encoding_DefaultBinary = init(694);
    public static final NodeId HistoryUpdateResult = init(695);
    public static final NodeId HistoryUpdateResult_Encoding_DefaultXml = init(696);
    public static final NodeId HistoryUpdateResult_Encoding_DefaultBinary = init(697);
    public static final NodeId HistoryUpdateRequest = init(698);
    public static final NodeId HistoryUpdateRequest_Encoding_DefaultXml = init(699);
    public static final NodeId HistoryUpdateRequest_Encoding_DefaultBinary = init(700);
    public static final NodeId HistoryUpdateResponse = init(701);
    public static final NodeId HistoryUpdateResponse_Encoding_DefaultXml = init(702);
    public static final NodeId HistoryUpdateResponse_Encoding_DefaultBinary = init(703);
    public static final NodeId CallMethodRequest = init(704);
    public static final NodeId CallMethodRequest_Encoding_DefaultXml = init(705);
    public static final NodeId CallMethodRequest_Encoding_DefaultBinary = init(706);
    public static final NodeId CallMethodResult = init(707);
    public static final NodeId CallMethodResult_Encoding_DefaultXml = init(708);
    public static final NodeId CallMethodResult_Encoding_DefaultBinary = init(709);
    public static final NodeId CallRequest = init(710);
    public static final NodeId CallRequest_Encoding_DefaultXml = init(711);
    public static final NodeId CallRequest_Encoding_DefaultBinary = init(712);
    public static final NodeId CallResponse = init(713);
    public static final NodeId CallResponse_Encoding_DefaultXml = init(714);
    public static final NodeId CallResponse_Encoding_DefaultBinary = init(715);
    public static final NodeId MonitoringMode = init(716);
    public static final NodeId DataChangeTrigger = init(717);
    public static final NodeId DeadbandType = init(718);
    public static final NodeId MonitoringFilter = init(719);
    public static final NodeId MonitoringFilter_Encoding_DefaultXml = init(720);
    public static final NodeId MonitoringFilter_Encoding_DefaultBinary = init(721);
    public static final NodeId DataChangeFilter = init(722);
    public static final NodeId DataChangeFilter_Encoding_DefaultXml = init(723);
    public static final NodeId DataChangeFilter_Encoding_DefaultBinary = init(724);
    public static final NodeId EventFilter = init(725);
    public static final NodeId EventFilter_Encoding_DefaultXml = init(726);
    public static final NodeId EventFilter_Encoding_DefaultBinary = init(727);
    public static final NodeId AggregateFilter = init(728);
    public static final NodeId AggregateFilter_Encoding_DefaultXml = init(729);
    public static final NodeId AggregateFilter_Encoding_DefaultBinary = init(730);
    public static final NodeId MonitoringFilterResult = init(731);
    public static final NodeId MonitoringFilterResult_Encoding_DefaultXml = init(732);
    public static final NodeId MonitoringFilterResult_Encoding_DefaultBinary = init(733);
    public static final NodeId EventFilterResult = init(734);
    public static final NodeId EventFilterResult_Encoding_DefaultXml = init(735);
    public static final NodeId EventFilterResult_Encoding_DefaultBinary = init(736);
    public static final NodeId AggregateFilterResult = init(737);
    public static final NodeId AggregateFilterResult_Encoding_DefaultXml = init(738);
    public static final NodeId AggregateFilterResult_Encoding_DefaultBinary = init(739);
    public static final NodeId MonitoringParameters = init(740);
    public static final NodeId MonitoringParameters_Encoding_DefaultXml = init(741);
    public static final NodeId MonitoringParameters_Encoding_DefaultBinary = init(742);
    public static final NodeId MonitoredItemCreateRequest = init(743);
    public static final NodeId MonitoredItemCreateRequest_Encoding_DefaultXml = init(744);
    public static final NodeId MonitoredItemCreateRequest_Encoding_DefaultBinary = init(745);
    public static final NodeId MonitoredItemCreateResult = init(746);
    public static final NodeId MonitoredItemCreateResult_Encoding_DefaultXml = init(747);
    public static final NodeId MonitoredItemCreateResult_Encoding_DefaultBinary = init(748);
    public static final NodeId CreateMonitoredItemsRequest = init(749);
    public static final NodeId CreateMonitoredItemsRequest_Encoding_DefaultXml = init(750);
    public static final NodeId CreateMonitoredItemsRequest_Encoding_DefaultBinary = init(751);
    public static final NodeId CreateMonitoredItemsResponse = init(752);
    public static final NodeId CreateMonitoredItemsResponse_Encoding_DefaultXml = init(753);
    public static final NodeId CreateMonitoredItemsResponse_Encoding_DefaultBinary = init(754);
    public static final NodeId MonitoredItemModifyRequest = init(755);
    public static final NodeId MonitoredItemModifyRequest_Encoding_DefaultXml = init(756);
    public static final NodeId MonitoredItemModifyRequest_Encoding_DefaultBinary = init(757);
    public static final NodeId MonitoredItemModifyResult = init(758);
    public static final NodeId MonitoredItemModifyResult_Encoding_DefaultXml = init(759);
    public static final NodeId MonitoredItemModifyResult_Encoding_DefaultBinary = init(760);
    public static final NodeId ModifyMonitoredItemsRequest = init(761);
    public static final NodeId ModifyMonitoredItemsRequest_Encoding_DefaultXml = init(762);
    public static final NodeId ModifyMonitoredItemsRequest_Encoding_DefaultBinary = init(763);
    public static final NodeId ModifyMonitoredItemsResponse = init(764);
    public static final NodeId ModifyMonitoredItemsResponse_Encoding_DefaultXml = init(765);
    public static final NodeId ModifyMonitoredItemsResponse_Encoding_DefaultBinary = init(766);
    public static final NodeId SetMonitoringModeRequest = init(767);
    public static final NodeId SetMonitoringModeRequest_Encoding_DefaultXml = init(768);
    public static final NodeId SetMonitoringModeRequest_Encoding_DefaultBinary = init(769);
    public static final NodeId SetMonitoringModeResponse = init(770);
    public static final NodeId SetMonitoringModeResponse_Encoding_DefaultXml = init(771);
    public static final NodeId SetMonitoringModeResponse_Encoding_DefaultBinary = init(772);
    public static final NodeId SetTriggeringRequest = init(773);
    public static final NodeId SetTriggeringRequest_Encoding_DefaultXml = init(774);
    public static final NodeId SetTriggeringRequest_Encoding_DefaultBinary = init(775);
    public static final NodeId SetTriggeringResponse = init(776);
    public static final NodeId SetTriggeringResponse_Encoding_DefaultXml = init(777);
    public static final NodeId SetTriggeringResponse_Encoding_DefaultBinary = init(778);
    public static final NodeId DeleteMonitoredItemsRequest = init(779);
    public static final NodeId DeleteMonitoredItemsRequest_Encoding_DefaultXml = init(780);
    public static final NodeId DeleteMonitoredItemsRequest_Encoding_DefaultBinary = init(781);
    public static final NodeId DeleteMonitoredItemsResponse = init(782);
    public static final NodeId DeleteMonitoredItemsResponse_Encoding_DefaultXml = init(783);
    public static final NodeId DeleteMonitoredItemsResponse_Encoding_DefaultBinary = init(784);
    public static final NodeId CreateSubscriptionRequest = init(785);
    public static final NodeId CreateSubscriptionRequest_Encoding_DefaultXml = init(786);
    public static final NodeId CreateSubscriptionRequest_Encoding_DefaultBinary = init(787);
    public static final NodeId CreateSubscriptionResponse = init(788);
    public static final NodeId CreateSubscriptionResponse_Encoding_DefaultXml = init(789);
    public static final NodeId CreateSubscriptionResponse_Encoding_DefaultBinary = init(790);
    public static final NodeId ModifySubscriptionRequest = init(791);
    public static final NodeId ModifySubscriptionRequest_Encoding_DefaultXml = init(792);
    public static final NodeId ModifySubscriptionRequest_Encoding_DefaultBinary = init(793);
    public static final NodeId ModifySubscriptionResponse = init(794);
    public static final NodeId ModifySubscriptionResponse_Encoding_DefaultXml = init(795);
    public static final NodeId ModifySubscriptionResponse_Encoding_DefaultBinary = init(796);
    public static final NodeId SetPublishingModeRequest = init(797);
    public static final NodeId SetPublishingModeRequest_Encoding_DefaultXml = init(798);
    public static final NodeId SetPublishingModeRequest_Encoding_DefaultBinary = init(799);
    public static final NodeId SetPublishingModeResponse = init(800);
    public static final NodeId SetPublishingModeResponse_Encoding_DefaultXml = init(801);
    public static final NodeId SetPublishingModeResponse_Encoding_DefaultBinary = init(802);
    public static final NodeId NotificationMessage = init(803);
    public static final NodeId NotificationMessage_Encoding_DefaultXml = init(804);
    public static final NodeId NotificationMessage_Encoding_DefaultBinary = init(805);
    public static final NodeId MonitoredItemNotification = init(806);
    public static final NodeId MonitoredItemNotification_Encoding_DefaultXml = init(807);
    public static final NodeId MonitoredItemNotification_Encoding_DefaultBinary = init(808);
    public static final NodeId DataChangeNotification = init(809);
    public static final NodeId DataChangeNotification_Encoding_DefaultXml = init(810);
    public static final NodeId DataChangeNotification_Encoding_DefaultBinary = init(811);
    public static final NodeId StatusChangeNotification = init(818);
    public static final NodeId StatusChangeNotification_Encoding_DefaultXml = init(819);
    public static final NodeId StatusChangeNotification_Encoding_DefaultBinary = init(820);
    public static final NodeId SubscriptionAcknowledgement = init(821);
    public static final NodeId SubscriptionAcknowledgement_Encoding_DefaultXml = init(822);
    public static final NodeId SubscriptionAcknowledgement_Encoding_DefaultBinary = init(823);
    public static final NodeId PublishRequest = init(824);
    public static final NodeId PublishRequest_Encoding_DefaultXml = init(825);
    public static final NodeId PublishRequest_Encoding_DefaultBinary = init(826);
    public static final NodeId PublishResponse = init(827);
    public static final NodeId PublishResponse_Encoding_DefaultXml = init(828);
    public static final NodeId PublishResponse_Encoding_DefaultBinary = init(829);
    public static final NodeId RepublishRequest = init(830);
    public static final NodeId RepublishRequest_Encoding_DefaultXml = init(831);
    public static final NodeId RepublishRequest_Encoding_DefaultBinary = init(832);
    public static final NodeId RepublishResponse = init(833);
    public static final NodeId RepublishResponse_Encoding_DefaultXml = init(834);
    public static final NodeId RepublishResponse_Encoding_DefaultBinary = init(835);
    public static final NodeId TransferResult = init(836);
    public static final NodeId TransferResult_Encoding_DefaultXml = init(837);
    public static final NodeId TransferResult_Encoding_DefaultBinary = init(838);
    public static final NodeId TransferSubscriptionsRequest = init(839);
    public static final NodeId TransferSubscriptionsRequest_Encoding_DefaultXml = init(840);
    public static final NodeId TransferSubscriptionsRequest_Encoding_DefaultBinary = init(841);
    public static final NodeId TransferSubscriptionsResponse = init(842);
    public static final NodeId TransferSubscriptionsResponse_Encoding_DefaultXml = init(843);
    public static final NodeId TransferSubscriptionsResponse_Encoding_DefaultBinary = init(844);
    public static final NodeId DeleteSubscriptionsRequest = init(845);
    public static final NodeId DeleteSubscriptionsRequest_Encoding_DefaultXml = init(846);
    public static final NodeId DeleteSubscriptionsRequest_Encoding_DefaultBinary = init(847);
    public static final NodeId DeleteSubscriptionsResponse = init(848);
    public static final NodeId DeleteSubscriptionsResponse_Encoding_DefaultXml = init(849);
    public static final NodeId DeleteSubscriptionsResponse_Encoding_DefaultBinary = init(850);
    public static final NodeId RedundancySupport = init(851);
    public static final NodeId ServerState = init(852);
    public static final NodeId RedundantServerDataType = init(853);
    public static final NodeId RedundantServerDataType_Encoding_DefaultXml = init(854);
    public static final NodeId RedundantServerDataType_Encoding_DefaultBinary = init(855);
    public static final NodeId SamplingIntervalDiagnosticsDataType = init(856);
    public static final NodeId SamplingIntervalDiagnosticsDataType_Encoding_DefaultXml = init(857);
    public static final NodeId SamplingIntervalDiagnosticsDataType_Encoding_DefaultBinary = init(858);
    public static final NodeId ServerDiagnosticsSummaryDataType = init(859);
    public static final NodeId ServerDiagnosticsSummaryDataType_Encoding_DefaultXml = init(860);
    public static final NodeId ServerDiagnosticsSummaryDataType_Encoding_DefaultBinary = init(861);
    public static final NodeId ServerStatusDataType = init(862);
    public static final NodeId ServerStatusDataType_Encoding_DefaultXml = init(863);
    public static final NodeId ServerStatusDataType_Encoding_DefaultBinary = init(864);
    public static final NodeId SessionDiagnosticsDataType = init(865);
    public static final NodeId SessionDiagnosticsDataType_Encoding_DefaultXml = init(866);
    public static final NodeId SessionDiagnosticsDataType_Encoding_DefaultBinary = init(867);
    public static final NodeId SessionSecurityDiagnosticsDataType = init(868);
    public static final NodeId SessionSecurityDiagnosticsDataType_Encoding_DefaultXml = init(869);
    public static final NodeId SessionSecurityDiagnosticsDataType_Encoding_DefaultBinary = init(870);
    public static final NodeId ServiceCounterDataType = init(871);
    public static final NodeId ServiceCounterDataType_Encoding_DefaultXml = init(872);
    public static final NodeId ServiceCounterDataType_Encoding_DefaultBinary = init(873);
    public static final NodeId SubscriptionDiagnosticsDataType = init(874);
    public static final NodeId SubscriptionDiagnosticsDataType_Encoding_DefaultXml = init(875);
    public static final NodeId SubscriptionDiagnosticsDataType_Encoding_DefaultBinary = init(876);
    public static final NodeId ModelChangeStructureDataType = init(877);
    public static final NodeId ModelChangeStructureDataType_Encoding_DefaultXml = init(878);
    public static final NodeId ModelChangeStructureDataType_Encoding_DefaultBinary = init(879);
    public static final NodeId Range = init(884);
    public static final NodeId Range_Encoding_DefaultXml = init(885);
    public static final NodeId Range_Encoding_DefaultBinary = init(886);
    public static final NodeId EUInformation = init(887);
    public static final NodeId EUInformation_Encoding_DefaultXml = init(888);
    public static final NodeId EUInformation_Encoding_DefaultBinary = init(889);
    public static final NodeId ExceptionDeviationFormat = init(890);
    public static final NodeId Annotation = init(891);
    public static final NodeId Annotation_Encoding_DefaultXml = init(892);
    public static final NodeId Annotation_Encoding_DefaultBinary = init(893);
    public static final NodeId ProgramDiagnosticDataType = init(894);
    public static final NodeId ProgramDiagnosticDataType_Encoding_DefaultXml = init(895);
    public static final NodeId ProgramDiagnosticDataType_Encoding_DefaultBinary = init(896);
    public static final NodeId SemanticChangeStructureDataType = init(897);
    public static final NodeId SemanticChangeStructureDataType_Encoding_DefaultXml = init(898);
    public static final NodeId SemanticChangeStructureDataType_Encoding_DefaultBinary = init(899);
    public static final NodeId EventNotificationList = init(914);
    public static final NodeId EventNotificationList_Encoding_DefaultXml = init(915);
    public static final NodeId EventNotificationList_Encoding_DefaultBinary = init(916);
    public static final NodeId EventFieldList = init(917);
    public static final NodeId EventFieldList_Encoding_DefaultXml = init(918);
    public static final NodeId EventFieldList_Encoding_DefaultBinary = init(919);
    public static final NodeId HistoryEventFieldList = init(920);
    public static final NodeId HistoryEventFieldList_Encoding_DefaultXml = init(921);
    public static final NodeId HistoryEventFieldList_Encoding_DefaultBinary = init(922);
    public static final NodeId IssuedIdentityToken = init(938);
    public static final NodeId IssuedIdentityToken_Encoding_DefaultXml = init(939);
    public static final NodeId IssuedIdentityToken_Encoding_DefaultBinary = init(940);
    public static final NodeId NotificationData = init(945);
    public static final NodeId NotificationData_Encoding_DefaultXml = init(946);
    public static final NodeId NotificationData_Encoding_DefaultBinary = init(947);
    public static final NodeId AggregateConfiguration = init(948);
    public static final NodeId AggregateConfiguration_Encoding_DefaultXml = init(949);
    public static final NodeId AggregateConfiguration_Encoding_DefaultBinary = init(950);
    public static final NodeId ImageBMP = init(2000);
    public static final NodeId ImageGIF = init(2001);
    public static final NodeId ImageJPG = init(2002);
    public static final NodeId ImagePNG = init(2003);
    public static final NodeId ServerType = init(2004);
    public static final NodeId ServerType_ServerArray = init(2005);
    public static final NodeId ServerType_NamespaceArray = init(2006);
    public static final NodeId ServerType_ServerStatus = init(2007);
    public static final NodeId ServerType_ServiceLevel = init(2008);
    public static final NodeId ServerType_ServerCapabilities = init(2009);
    public static final NodeId ServerType_ServerDiagnostics = init(2010);
    public static final NodeId ServerType_VendorServerInfo = init(2011);
    public static final NodeId ServerType_ServerRedundancy = init(2012);
    public static final NodeId ServerCapabilitiesType = init(2013);
    public static final NodeId ServerCapabilitiesType_ServerProfileArray = init(2014);
    public static final NodeId ServerCapabilitiesType_LocaleIdArray = init(2016);
    public static final NodeId ServerCapabilitiesType_MinSupportedSampleRate = init(2017);
    public static final NodeId ServerCapabilitiesType_ModellingRules = init(2019);
    public static final NodeId ServerDiagnosticsType = init(2020);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary = init(2021);
    public static final NodeId ServerDiagnosticsType_SamplingIntervalDiagnosticsArray = init(2022);
    public static final NodeId ServerDiagnosticsType_SubscriptionDiagnosticsArray = init(2023);
    public static final NodeId ServerDiagnosticsType_EnabledFlag = init(2025);
    public static final NodeId SessionsDiagnosticsSummaryType = init(2026);
    public static final NodeId SessionsDiagnosticsSummaryType_SessionDiagnosticsArray = init(2027);
    public static final NodeId SessionsDiagnosticsSummaryType_SessionSecurityDiagnosticsArray = init(2028);
    public static final NodeId SessionDiagnosticsObjectType = init(2029);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics = init(2030);
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics = init(2031);
    public static final NodeId SessionDiagnosticsObjectType_SubscriptionDiagnosticsArray = init(2032);
    public static final NodeId VendorServerInfoType = init(2033);
    public static final NodeId ServerRedundancyType = init(2034);
    public static final NodeId ServerRedundancyType_RedundancySupport = init(2035);
    public static final NodeId TransparentRedundancyType = init(2036);
    public static final NodeId TransparentRedundancyType_CurrentServerId = init(2037);
    public static final NodeId TransparentRedundancyType_RedundantServerArray = init(2038);
    public static final NodeId NonTransparentRedundancyType = init(2039);
    public static final NodeId NonTransparentRedundancyType_ServerUriArray = init(2040);
    public static final NodeId BaseEventType = init(2041);
    public static final NodeId BaseEventType_EventId = init(2042);
    public static final NodeId BaseEventType_EventType = init(2043);
    public static final NodeId BaseEventType_SourceNode = init(2044);
    public static final NodeId BaseEventType_SourceName = init(2045);
    public static final NodeId BaseEventType_Time = init(2046);
    public static final NodeId BaseEventType_ReceiveTime = init(2047);
    public static final NodeId BaseEventType_Message = init(2050);
    public static final NodeId BaseEventType_Severity = init(2051);
    public static final NodeId AuditEventType = init(2052);
    public static final NodeId AuditEventType_ActionTimeStamp = init(2053);
    public static final NodeId AuditEventType_Status = init(2054);
    public static final NodeId AuditEventType_ServerId = init(2055);
    public static final NodeId AuditEventType_ClientAuditEntryId = init(2056);
    public static final NodeId AuditEventType_ClientUserId = init(2057);
    public static final NodeId AuditSecurityEventType = init(2058);
    public static final NodeId AuditChannelEventType = init(2059);
    public static final NodeId AuditOpenSecureChannelEventType = init(2060);
    public static final NodeId AuditOpenSecureChannelEventType_ClientCertificate = init(2061);
    public static final NodeId AuditOpenSecureChannelEventType_RequestType = init(2062);
    public static final NodeId AuditOpenSecureChannelEventType_SecurityPolicyUri = init(2063);
    public static final NodeId AuditOpenSecureChannelEventType_SecurityMode = init(2065);
    public static final NodeId AuditOpenSecureChannelEventType_RequestedLifetime = init(2066);
    public static final NodeId AuditSessionEventType = init(2069);
    public static final NodeId AuditSessionEventType_SessionId = init(2070);
    public static final NodeId AuditCreateSessionEventType = init(2071);
    public static final NodeId AuditCreateSessionEventType_SecureChannelId = init(2072);
    public static final NodeId AuditCreateSessionEventType_ClientCertificate = init(2073);
    public static final NodeId AuditCreateSessionEventType_RevisedSessionTimeout = init(2074);
    public static final NodeId AuditActivateSessionEventType = init(2075);
    public static final NodeId AuditActivateSessionEventType_ClientSoftwareCertificates = init(2076);
    public static final NodeId AuditActivateSessionEventType_UserIdentityToken = init(2077);
    public static final NodeId AuditCancelEventType = init(2078);
    public static final NodeId AuditCancelEventType_RequestHandle = init(2079);
    public static final NodeId AuditCertificateEventType = init(2080);
    public static final NodeId AuditCertificateEventType_Certificate = init(2081);
    public static final NodeId AuditCertificateDataMismatchEventType = init(2082);
    public static final NodeId AuditCertificateDataMismatchEventType_InvalidHostname = init(2083);
    public static final NodeId AuditCertificateDataMismatchEventType_InvalidUri = init(2084);
    public static final NodeId AuditCertificateExpiredEventType = init(2085);
    public static final NodeId AuditCertificateInvalidEventType = init(2086);
    public static final NodeId AuditCertificateUntrustedEventType = init(2087);
    public static final NodeId AuditCertificateRevokedEventType = init(2088);
    public static final NodeId AuditCertificateMismatchEventType = init(2089);
    public static final NodeId AuditNodeManagementEventType = init(2090);
    public static final NodeId AuditAddNodesEventType = init(2091);
    public static final NodeId AuditAddNodesEventType_NodesToAdd = init(2092);
    public static final NodeId AuditDeleteNodesEventType = init(2093);
    public static final NodeId AuditDeleteNodesEventType_NodesToDelete = init(2094);
    public static final NodeId AuditAddReferencesEventType = init(2095);
    public static final NodeId AuditAddReferencesEventType_ReferencesToAdd = init(2096);
    public static final NodeId AuditDeleteReferencesEventType = init(2097);
    public static final NodeId AuditDeleteReferencesEventType_ReferencesToDelete = init(2098);
    public static final NodeId AuditUpdateEventType = init(2099);
    public static final NodeId AuditWriteUpdateEventType = init(2100);
    public static final NodeId AuditWriteUpdateEventType_IndexRange = init(2101);
    public static final NodeId AuditWriteUpdateEventType_OldValue = init(2102);
    public static final NodeId AuditWriteUpdateEventType_NewValue = init(2103);
    public static final NodeId AuditHistoryUpdateEventType = init(2104);
    public static final NodeId AuditUpdateMethodEventType = init(2127);
    public static final NodeId AuditUpdateMethodEventType_MethodId = init(2128);
    public static final NodeId AuditUpdateMethodEventType_InputArguments = init(2129);
    public static final NodeId SystemEventType = init(2130);
    public static final NodeId DeviceFailureEventType = init(2131);
    public static final NodeId BaseModelChangeEventType = init(2132);
    public static final NodeId GeneralModelChangeEventType = init(2133);
    public static final NodeId GeneralModelChangeEventType_Changes = init(2134);
    public static final NodeId ServerVendorCapabilityType = init(2137);
    public static final NodeId ServerStatusType = init(2138);
    public static final NodeId ServerStatusType_StartTime = init(2139);
    public static final NodeId ServerStatusType_CurrentTime = init(2140);
    public static final NodeId ServerStatusType_State = init(2141);
    public static final NodeId ServerStatusType_BuildInfo = init(2142);
    public static final NodeId ServerDiagnosticsSummaryType = init(2150);
    public static final NodeId ServerDiagnosticsSummaryType_ServerViewCount = init(2151);
    public static final NodeId ServerDiagnosticsSummaryType_CurrentSessionCount = init(2152);
    public static final NodeId ServerDiagnosticsSummaryType_CumulatedSessionCount = init(2153);
    public static final NodeId ServerDiagnosticsSummaryType_SecurityRejectedSessionCount = init(2154);
    public static final NodeId ServerDiagnosticsSummaryType_RejectedSessionCount = init(2155);
    public static final NodeId ServerDiagnosticsSummaryType_SessionTimeoutCount = init(2156);
    public static final NodeId ServerDiagnosticsSummaryType_SessionAbortCount = init(2157);
    public static final NodeId ServerDiagnosticsSummaryType_PublishingIntervalCount = init(2159);
    public static final NodeId ServerDiagnosticsSummaryType_CurrentSubscriptionCount = init(2160);
    public static final NodeId ServerDiagnosticsSummaryType_CumulatedSubscriptionCount = init(2161);
    public static final NodeId ServerDiagnosticsSummaryType_SecurityRejectedRequestsCount = init(2162);
    public static final NodeId ServerDiagnosticsSummaryType_RejectedRequestsCount = init(2163);
    public static final NodeId SamplingIntervalDiagnosticsArrayType = init(2164);
    public static final NodeId SamplingIntervalDiagnosticsType = init(2165);
    public static final NodeId SamplingIntervalDiagnosticsType_SamplingInterval = init(2166);
    public static final NodeId SubscriptionDiagnosticsArrayType = init(2171);
    public static final NodeId SubscriptionDiagnosticsType = init(2172);
    public static final NodeId SubscriptionDiagnosticsType_SessionId = init(2173);
    public static final NodeId SubscriptionDiagnosticsType_SubscriptionId = init(2174);
    public static final NodeId SubscriptionDiagnosticsType_Priority = init(2175);
    public static final NodeId SubscriptionDiagnosticsType_PublishingInterval = init(2176);
    public static final NodeId SubscriptionDiagnosticsType_MaxKeepAliveCount = init(2177);
    public static final NodeId SubscriptionDiagnosticsType_MaxNotificationsPerPublish = init(2179);
    public static final NodeId SubscriptionDiagnosticsType_PublishingEnabled = init(2180);
    public static final NodeId SubscriptionDiagnosticsType_ModifyCount = init(2181);
    public static final NodeId SubscriptionDiagnosticsType_EnableCount = init(2182);
    public static final NodeId SubscriptionDiagnosticsType_DisableCount = init(2183);
    public static final NodeId SubscriptionDiagnosticsType_RepublishRequestCount = init(2184);
    public static final NodeId SubscriptionDiagnosticsType_RepublishMessageRequestCount = init(2185);
    public static final NodeId SubscriptionDiagnosticsType_RepublishMessageCount = init(2186);
    public static final NodeId SubscriptionDiagnosticsType_TransferRequestCount = init(2187);
    public static final NodeId SubscriptionDiagnosticsType_TransferredToAltClientCount = init(2188);
    public static final NodeId SubscriptionDiagnosticsType_TransferredToSameClientCount = init(2189);
    public static final NodeId SubscriptionDiagnosticsType_PublishRequestCount = init(2190);
    public static final NodeId SubscriptionDiagnosticsType_DataChangeNotificationsCount = init(2191);
    public static final NodeId SubscriptionDiagnosticsType_NotificationsCount = init(2193);
    public static final NodeId SessionDiagnosticsArrayType = init(2196);
    public static final NodeId SessionDiagnosticsVariableType = init(2197);
    public static final NodeId SessionDiagnosticsVariableType_SessionId = init(2198);
    public static final NodeId SessionDiagnosticsVariableType_SessionName = init(2199);
    public static final NodeId SessionDiagnosticsVariableType_ClientDescription = init(2200);
    public static final NodeId SessionDiagnosticsVariableType_ServerUri = init(2201);
    public static final NodeId SessionDiagnosticsVariableType_EndpointUrl = init(2202);
    public static final NodeId SessionDiagnosticsVariableType_LocaleIds = init(2203);
    public static final NodeId SessionDiagnosticsVariableType_ActualSessionTimeout = init(2204);
    public static final NodeId SessionDiagnosticsVariableType_ClientConnectionTime = init(2205);
    public static final NodeId SessionDiagnosticsVariableType_ClientLastContactTime = init(2206);
    public static final NodeId SessionDiagnosticsVariableType_CurrentSubscriptionsCount = init(2207);
    public static final NodeId SessionDiagnosticsVariableType_CurrentMonitoredItemsCount = init(2208);
    public static final NodeId SessionDiagnosticsVariableType_CurrentPublishRequestsInQueue = init(2209);
    public static final NodeId SessionDiagnosticsVariableType_ReadCount = init(2217);
    public static final NodeId SessionDiagnosticsVariableType_HistoryReadCount = init(2218);
    public static final NodeId SessionDiagnosticsVariableType_WriteCount = init(2219);
    public static final NodeId SessionDiagnosticsVariableType_HistoryUpdateCount = init(2220);
    public static final NodeId SessionDiagnosticsVariableType_CallCount = init(2221);
    public static final NodeId SessionDiagnosticsVariableType_CreateMonitoredItemsCount = init(2222);
    public static final NodeId SessionDiagnosticsVariableType_ModifyMonitoredItemsCount = init(2223);
    public static final NodeId SessionDiagnosticsVariableType_SetMonitoringModeCount = init(2224);
    public static final NodeId SessionDiagnosticsVariableType_SetTriggeringCount = init(2225);
    public static final NodeId SessionDiagnosticsVariableType_DeleteMonitoredItemsCount = init(2226);
    public static final NodeId SessionDiagnosticsVariableType_CreateSubscriptionCount = init(2227);
    public static final NodeId SessionDiagnosticsVariableType_ModifySubscriptionCount = init(2228);
    public static final NodeId SessionDiagnosticsVariableType_SetPublishingModeCount = init(2229);
    public static final NodeId SessionDiagnosticsVariableType_PublishCount = init(2230);
    public static final NodeId SessionDiagnosticsVariableType_RepublishCount = init(2231);
    public static final NodeId SessionDiagnosticsVariableType_TransferSubscriptionsCount = init(2232);
    public static final NodeId SessionDiagnosticsVariableType_DeleteSubscriptionsCount = init(2233);
    public static final NodeId SessionDiagnosticsVariableType_AddNodesCount = init(2234);
    public static final NodeId SessionDiagnosticsVariableType_AddReferencesCount = init(2235);
    public static final NodeId SessionDiagnosticsVariableType_DeleteNodesCount = init(2236);
    public static final NodeId SessionDiagnosticsVariableType_DeleteReferencesCount = init(2237);
    public static final NodeId SessionDiagnosticsVariableType_BrowseCount = init(2238);
    public static final NodeId SessionDiagnosticsVariableType_BrowseNextCount = init(2239);
    public static final NodeId SessionDiagnosticsVariableType_TranslateBrowsePathsToNodeIdsCount = init(2240);
    public static final NodeId SessionDiagnosticsVariableType_QueryFirstCount = init(2241);
    public static final NodeId SessionDiagnosticsVariableType_QueryNextCount = init(2242);
    public static final NodeId SessionSecurityDiagnosticsArrayType = init(2243);
    public static final NodeId SessionSecurityDiagnosticsType = init(2244);
    public static final NodeId SessionSecurityDiagnosticsType_SessionId = init(2245);
    public static final NodeId SessionSecurityDiagnosticsType_ClientUserIdOfSession = init(2246);
    public static final NodeId SessionSecurityDiagnosticsType_ClientUserIdHistory = init(2247);
    public static final NodeId SessionSecurityDiagnosticsType_AuthenticationMechanism = init(2248);
    public static final NodeId SessionSecurityDiagnosticsType_Encoding = init(2249);
    public static final NodeId SessionSecurityDiagnosticsType_TransportProtocol = init(2250);
    public static final NodeId SessionSecurityDiagnosticsType_SecurityMode = init(2251);
    public static final NodeId SessionSecurityDiagnosticsType_SecurityPolicyUri = init(2252);
    public static final NodeId Server = init(2253);
    public static final NodeId Server_ServerArray = init(2254);
    public static final NodeId Server_NamespaceArray = init(2255);
    public static final NodeId Server_ServerStatus = init(2256);
    public static final NodeId Server_ServerStatus_StartTime = init(2257);
    public static final NodeId Server_ServerStatus_CurrentTime = init(2258);
    public static final NodeId Server_ServerStatus_State = init(2259);
    public static final NodeId Server_ServerStatus_BuildInfo = init(2260);
    public static final NodeId Server_ServerStatus_BuildInfo_ProductName = init(2261);
    public static final NodeId Server_ServerStatus_BuildInfo_ProductUri = init(2262);
    public static final NodeId Server_ServerStatus_BuildInfo_ManufacturerName = init(2263);
    public static final NodeId Server_ServerStatus_BuildInfo_SoftwareVersion = init(2264);
    public static final NodeId Server_ServerStatus_BuildInfo_BuildNumber = init(2265);
    public static final NodeId Server_ServerStatus_BuildInfo_BuildDate = init(2266);
    public static final NodeId Server_ServiceLevel = init(2267);
    public static final NodeId Server_ServerCapabilities = init(2268);
    public static final NodeId Server_ServerCapabilities_ServerProfileArray = init(2269);
    public static final NodeId Server_ServerCapabilities_LocaleIdArray = init(2271);
    public static final NodeId Server_ServerCapabilities_MinSupportedSampleRate = init(2272);
    public static final NodeId Server_ServerDiagnostics = init(2274);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary = init(2275);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_ServerViewCount = init(2276);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_CurrentSessionCount = init(2277);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_CumulatedSessionCount = init(2278);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_SecurityRejectedSessionCount = init(
        2279
    );
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_SessionTimeoutCount = init(2281);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_SessionAbortCount = init(2282);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_PublishingIntervalCount = init(2284);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_CurrentSubscriptionCount = init(2285);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_CumulatedSubscriptionCount = init(
        2286
    );
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_SecurityRejectedRequestsCount = init(
        2287
    );
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_RejectedRequestsCount = init(2288);
    public static final NodeId Server_ServerDiagnostics_SamplingIntervalDiagnosticsArray = init(2289);
    public static final NodeId Server_ServerDiagnostics_SubscriptionDiagnosticsArray = init(2290);
    public static final NodeId Server_ServerDiagnostics_EnabledFlag = init(2294);
    public static final NodeId Server_VendorServerInfo = init(2295);
    public static final NodeId Server_ServerRedundancy = init(2296);
    public static final NodeId StateMachineType = init(2299);
    public static final NodeId StateType = init(2307);
    public static final NodeId StateType_StateNumber = init(2308);
    public static final NodeId InitialStateType = init(2309);
    public static final NodeId TransitionType = init(2310);
    public static final NodeId TransitionEventType = init(2311);
    public static final NodeId TransitionType_TransitionNumber = init(2312);
    public static final NodeId AuditUpdateStateEventType = init(2315);
    public static final NodeId HistoricalDataConfigurationType = init(2318);
    public static final NodeId HistoricalDataConfigurationType_Stepped = init(2323);
    public static final NodeId HistoricalDataConfigurationType_Definition = init(2324);
    public static final NodeId HistoricalDataConfigurationType_MaxTimeInterval = init(2325);
    public static final NodeId HistoricalDataConfigurationType_MinTimeInterval = init(2326);
    public static final NodeId HistoricalDataConfigurationType_ExceptionDeviation = init(2327);
    public static final NodeId HistoricalDataConfigurationType_ExceptionDeviationFormat = init(2328);
    public static final NodeId HistoryServerCapabilitiesType = init(2330);
    public static final NodeId HistoryServerCapabilitiesType_AccessHistoryDataCapability = init(2331);
    public static final NodeId HistoryServerCapabilitiesType_AccessHistoryEventsCapability = init(2332);
    public static final NodeId HistoryServerCapabilitiesType_InsertDataCapability = init(2334);
    public static final NodeId HistoryServerCapabilitiesType_ReplaceDataCapability = init(2335);
    public static final NodeId HistoryServerCapabilitiesType_UpdateDataCapability = init(2336);
    public static final NodeId HistoryServerCapabilitiesType_DeleteRawCapability = init(2337);
    public static final NodeId HistoryServerCapabilitiesType_DeleteAtTimeCapability = init(2338);
    public static final NodeId AggregateFunctionType = init(2340);
    public static final NodeId AggregateFunction_Interpolative = init(2341);
    public static final NodeId AggregateFunction_Average = init(2342);
    public static final NodeId AggregateFunction_TimeAverage = init(2343);
    public static final NodeId AggregateFunction_Total = init(2344);
    public static final NodeId AggregateFunction_Minimum = init(2346);
    public static final NodeId AggregateFunction_Maximum = init(2347);
    public static final NodeId AggregateFunction_MinimumActualTime = init(2348);
    public static final NodeId AggregateFunction_MaximumActualTime = init(2349);
    public static final NodeId AggregateFunction_Range = init(2350);
    public static final NodeId AggregateFunction_AnnotationCount = init(2351);
    public static final NodeId AggregateFunction_Count = init(2352);
    public static final NodeId AggregateFunction_NumberOfTransitions = init(2355);
    public static final NodeId AggregateFunction_Start = init(2357);
    public static final NodeId AggregateFunction_End = init(2358);
    public static final NodeId AggregateFunction_Delta = init(2359);
    public static final NodeId AggregateFunction_DurationGood = init(2360);
    public static final NodeId AggregateFunction_DurationBad = init(2361);
    public static final NodeId AggregateFunction_PercentGood = init(2362);
    public static final NodeId AggregateFunction_PercentBad = init(2363);
    public static final NodeId AggregateFunction_WorstQuality = init(2364);
    public static final NodeId DataItemType = init(2365);
    public static final NodeId DataItemType_Definition = init(2366);
    public static final NodeId DataItemType_ValuePrecision = init(2367);
    public static final NodeId AnalogItemType = init(2368);
    public static final NodeId AnalogItemType_EURange = init(2369);
    public static final NodeId AnalogItemType_InstrumentRange = init(2370);
    public static final NodeId AnalogItemType_EngineeringUnits = init(2371);
    public static final NodeId DiscreteItemType = init(2372);
    public static final NodeId TwoStateDiscreteType = init(2373);
    public static final NodeId TwoStateDiscreteType_FalseState = init(2374);
    public static final NodeId TwoStateDiscreteType_TrueState = init(2375);
    public static final NodeId MultiStateDiscreteType = init(2376);
    public static final NodeId MultiStateDiscreteType_EnumStrings = init(2377);
    public static final NodeId ProgramTransitionEventType = init(2378);
    public static final NodeId ProgramTransitionEventType_IntermediateResult = init(2379);
    public static final NodeId ProgramDiagnosticType = init(2380);
    public static final NodeId ProgramDiagnosticType_CreateSessionId = init(2381);
    public static final NodeId ProgramDiagnosticType_CreateClientName = init(2382);
    public static final NodeId ProgramDiagnosticType_InvocationCreationTime = init(2383);
    public static final NodeId ProgramDiagnosticType_LastTransitionTime = init(2384);
    public static final NodeId ProgramDiagnosticType_LastMethodCall = init(2385);
    public static final NodeId ProgramDiagnosticType_LastMethodSessionId = init(2386);
    public static final NodeId ProgramDiagnosticType_LastMethodInputArguments = init(2387);
    public static final NodeId ProgramDiagnosticType_LastMethodOutputArguments = init(2388);
    public static final NodeId ProgramDiagnosticType_LastMethodCallTime = init(2389);
    public static final NodeId ProgramDiagnosticType_LastMethodReturnStatus = init(2390);
    public static final NodeId ProgramStateMachineType = init(2391);
    public static final NodeId ProgramStateMachineType_Creatable = init(2392);
    public static final NodeId ProgramStateMachineType_Deletable = init(2393);
    public static final NodeId ProgramStateMachineType_AutoDelete = init(2394);
    public static final NodeId ProgramStateMachineType_RecycleCount = init(2395);
    public static final NodeId ProgramStateMachineType_InstanceCount = init(2396);
    public static final NodeId ProgramStateMachineType_MaxInstanceCount = init(2397);
    public static final NodeId ProgramStateMachineType_MaxRecycleCount = init(2398);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics = init(2399);
    public static final NodeId ProgramStateMachineType_Ready = init(2400);
    public static final NodeId ProgramStateMachineType_Ready_StateNumber = init(2401);
    public static final NodeId ProgramStateMachineType_Running = init(2402);
    public static final NodeId ProgramStateMachineType_Running_StateNumber = init(2403);
    public static final NodeId ProgramStateMachineType_Suspended = init(2404);
    public static final NodeId ProgramStateMachineType_Suspended_StateNumber = init(2405);
    public static final NodeId ProgramStateMachineType_Halted = init(2406);
    public static final NodeId ProgramStateMachineType_Halted_StateNumber = init(2407);
    public static final NodeId ProgramStateMachineType_HaltedToReady = init(2408);
    public static final NodeId ProgramStateMachineType_HaltedToReady_TransitionNumber = init(2409);
    public static final NodeId ProgramStateMachineType_ReadyToRunning = init(2410);
    public static final NodeId ProgramStateMachineType_ReadyToRunning_TransitionNumber = init(2411);
    public static final NodeId ProgramStateMachineType_RunningToHalted = init(2412);
    public static final NodeId ProgramStateMachineType_RunningToHalted_TransitionNumber = init(2413);
    public static final NodeId ProgramStateMachineType_RunningToReady = init(2414);
    public static final NodeId ProgramStateMachineType_RunningToReady_TransitionNumber = init(2415);
    public static final NodeId ProgramStateMachineType_RunningToSuspended = init(2416);
    public static final NodeId ProgramStateMachineType_RunningToSuspended_TransitionNumber = init(2417);
    public static final NodeId ProgramStateMachineType_SuspendedToRunning = init(2418);
    public static final NodeId ProgramStateMachineType_SuspendedToRunning_TransitionNumber = init(2419);
    public static final NodeId ProgramStateMachineType_SuspendedToHalted = init(2420);
    public static final NodeId ProgramStateMachineType_SuspendedToHalted_TransitionNumber = init(2421);
    public static final NodeId ProgramStateMachineType_SuspendedToReady = init(2422);
    public static final NodeId ProgramStateMachineType_SuspendedToReady_TransitionNumber = init(2423);
    public static final NodeId ProgramStateMachineType_ReadyToHalted = init(2424);
    public static final NodeId ProgramStateMachineType_ReadyToHalted_TransitionNumber = init(2425);
    public static final NodeId ProgramStateMachineType_Start = init(2426);
    public static final NodeId ProgramStateMachineType_Suspend = init(2427);
    public static final NodeId ProgramStateMachineType_Resume = init(2428);
    public static final NodeId ProgramStateMachineType_Halt = init(2429);
    public static final NodeId ProgramStateMachineType_Reset = init(2430);
    public static final NodeId SessionDiagnosticsVariableType_RegisterNodesCount = init(2730);
    public static final NodeId SessionDiagnosticsVariableType_UnregisterNodesCount = init(2731);
    public static final NodeId ServerCapabilitiesType_MaxBrowseContinuationPoints = init(2732);
    public static final NodeId ServerCapabilitiesType_MaxQueryContinuationPoints = init(2733);
    public static final NodeId ServerCapabilitiesType_MaxHistoryContinuationPoints = init(2734);
    public static final NodeId Server_ServerCapabilities_MaxBrowseContinuationPoints = init(2735);
    public static final NodeId Server_ServerCapabilities_MaxQueryContinuationPoints = init(2736);
    public static final NodeId Server_ServerCapabilities_MaxHistoryContinuationPoints = init(2737);
    public static final NodeId SemanticChangeEventType = init(2738);
    public static final NodeId SemanticChangeEventType_Changes = init(2739);
    public static final NodeId ServerType_Auditing = init(2742);
    public static final NodeId ServerDiagnosticsType_SessionsDiagnosticsSummary = init(2744);
    public static final NodeId AuditChannelEventType_SecureChannelId = init(2745);
    public static final NodeId AuditOpenSecureChannelEventType_ClientCertificateThumbprint = init(2746);
    public static final NodeId AuditCreateSessionEventType_ClientCertificateThumbprint = init(2747);
    public static final NodeId AuditUrlMismatchEventType = init(2748);
    public static final NodeId AuditUrlMismatchEventType_EndpointUrl = init(2749);
    public static final NodeId AuditWriteUpdateEventType_AttributeId = init(2750);
    public static final NodeId AuditHistoryUpdateEventType_ParameterDataTypeId = init(2751);
    public static final NodeId ServerStatusType_SecondsTillShutdown = init(2752);
    public static final NodeId ServerStatusType_ShutdownReason = init(2753);
    public static final NodeId ServerCapabilitiesType_AggregateFunctions = init(2754);
    public static final NodeId StateVariableType = init(2755);
    public static final NodeId StateVariableType_Id = init(2756);
    public static final NodeId StateVariableType_Name = init(2757);
    public static final NodeId StateVariableType_Number = init(2758);
    public static final NodeId StateVariableType_EffectiveDisplayName = init(2759);
    public static final NodeId FiniteStateVariableType = init(2760);
    public static final NodeId FiniteStateVariableType_Id = init(2761);
    public static final NodeId TransitionVariableType = init(2762);
    public static final NodeId TransitionVariableType_Id = init(2763);
    public static final NodeId TransitionVariableType_Name = init(2764);
    public static final NodeId TransitionVariableType_Number = init(2765);
    public static final NodeId TransitionVariableType_TransitionTime = init(2766);
    public static final NodeId FiniteTransitionVariableType = init(2767);
    public static final NodeId FiniteTransitionVariableType_Id = init(2768);
    public static final NodeId StateMachineType_CurrentState = init(2769);
    public static final NodeId StateMachineType_LastTransition = init(2770);
    public static final NodeId FiniteStateMachineType = init(2771);
    public static final NodeId FiniteStateMachineType_CurrentState = init(2772);
    public static final NodeId FiniteStateMachineType_LastTransition = init(2773);
    public static final NodeId TransitionEventType_Transition = init(2774);
    public static final NodeId TransitionEventType_FromState = init(2775);
    public static final NodeId TransitionEventType_ToState = init(2776);
    public static final NodeId AuditUpdateStateEventType_OldStateId = init(2777);
    public static final NodeId AuditUpdateStateEventType_NewStateId = init(2778);
    public static final NodeId ConditionType = init(2782);
    public static final NodeId RefreshStartEventType = init(2787);
    public static final NodeId RefreshEndEventType = init(2788);
    public static final NodeId RefreshRequiredEventType = init(2789);
    public static final NodeId AuditConditionEventType = init(2790);
    public static final NodeId AuditConditionEnableEventType = init(2803);
    public static final NodeId AuditConditionCommentEventType = init(2829);
    public static final NodeId DialogConditionType = init(2830);
    public static final NodeId DialogConditionType_Prompt = init(2831);
    public static final NodeId AcknowledgeableConditionType = init(2881);
    public static final NodeId AlarmConditionType = init(2915);
    public static final NodeId ShelvedStateMachineType = init(2929);
    public static final NodeId ShelvedStateMachineType_Unshelved = init(2930);
    public static final NodeId ShelvedStateMachineType_TimedShelved = init(2932);
    public static final NodeId ShelvedStateMachineType_OneShotShelved = init(2933);
    public static final NodeId ShelvedStateMachineType_UnshelvedToTimedShelved = init(2935);
    public static final NodeId ShelvedStateMachineType_UnshelvedToOneShotShelved = init(2936);
    public static final NodeId ShelvedStateMachineType_TimedShelvedToUnshelved = init(2940);
    public static final NodeId ShelvedStateMachineType_TimedShelvedToOneShotShelved = init(2942);
    public static final NodeId ShelvedStateMachineType_OneShotShelvedToUnshelved = init(2943);
    public static final NodeId ShelvedStateMachineType_OneShotShelvedToTimedShelved = init(2945);
    public static final NodeId ShelvedStateMachineType_Unshelve = init(2947);
    public static final NodeId ShelvedStateMachineType_OneShotShelve = init(2948);
    public static final NodeId ShelvedStateMachineType_TimedShelve = init(2949);
    public static final NodeId LimitAlarmType = init(2955);
    public static final NodeId ShelvedStateMachineType_TimedShelve_InputArguments = init(2991);
    public static final NodeId Server_ServerStatus_SecondsTillShutdown = init(2992);
    public static final NodeId Server_ServerStatus_ShutdownReason = init(2993);
    public static final NodeId Server_Auditing = init(2994);
    public static final NodeId Server_ServerCapabilities_ModellingRules = init(2996);
    public static final NodeId Server_ServerCapabilities_AggregateFunctions = init(2997);
    public static final NodeId SubscriptionDiagnosticsType_EventNotificationsCount = init(2998);
    public static final NodeId AuditHistoryEventUpdateEventType = init(2999);
    public static final NodeId AuditHistoryEventUpdateEventType_Filter = init(3003);
    public static final NodeId AuditHistoryValueUpdateEventType = init(3006);
    public static final NodeId AuditHistoryDeleteEventType = init(3012);
    public static final NodeId AuditHistoryRawModifyDeleteEventType = init(3014);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_IsDeleteModified = init(3015);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_StartTime = init(3016);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_EndTime = init(3017);
    public static final NodeId AuditHistoryAtTimeDeleteEventType = init(3019);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_ReqTimes = init(3020);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_OldValues = init(3021);
    public static final NodeId AuditHistoryEventDeleteEventType = init(3022);
    public static final NodeId AuditHistoryEventDeleteEventType_EventIds = init(3023);
    public static final NodeId AuditHistoryEventDeleteEventType_OldValues = init(3024);
    public static final NodeId AuditHistoryEventUpdateEventType_UpdatedNode = init(3025);
    public static final NodeId AuditHistoryValueUpdateEventType_UpdatedNode = init(3026);
    public static final NodeId AuditHistoryDeleteEventType_UpdatedNode = init(3027);
    public static final NodeId AuditHistoryEventUpdateEventType_PerformInsertReplace = init(3028);
    public static final NodeId AuditHistoryEventUpdateEventType_NewValues = init(3029);
    public static final NodeId AuditHistoryEventUpdateEventType_OldValues = init(3030);
    public static final NodeId AuditHistoryValueUpdateEventType_PerformInsertReplace = init(3031);
    public static final NodeId AuditHistoryValueUpdateEventType_NewValues = init(3032);
    public static final NodeId AuditHistoryValueUpdateEventType_OldValues = init(3033);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_OldValues = init(3034);
    public static final NodeId EventQueueOverflowEventType = init(3035);
    public static final NodeId EventTypesFolder = init(3048);
    public static final NodeId ServerCapabilitiesType_SoftwareCertificates = init(3049);
    public static final NodeId SessionDiagnosticsVariableType_MaxResponseMessageSize = init(3050);
    public static final NodeId BuildInfoType = init(3051);
    public static final NodeId BuildInfoType_ProductUri = init(3052);
    public static final NodeId BuildInfoType_ManufacturerName = init(3053);
    public static final NodeId BuildInfoType_ProductName = init(3054);
    public static final NodeId BuildInfoType_SoftwareVersion = init(3055);
    public static final NodeId BuildInfoType_BuildNumber = init(3056);
    public static final NodeId BuildInfoType_BuildDate = init(3057);
    public static final NodeId SessionSecurityDiagnosticsType_ClientCertificate = init(3058);
    public static final NodeId HistoricalDataConfigurationType_AggregateConfiguration = init(3059);
    public static final NodeId DefaultBinary = init(3062);
    public static final NodeId DefaultXml = init(3063);
    public static final NodeId AlwaysGeneratesEvent = init(3065);
    public static final NodeId Icon = init(3067);
    public static final NodeId NodeVersion = init(3068);
    public static final NodeId LocalTime = init(3069);
    public static final NodeId AllowNulls = init(3070);
    public static final NodeId EnumValues = init(3071);
    public static final NodeId InputArguments = init(3072);
    public static final NodeId OutputArguments = init(3073);
    public static final NodeId ServerType_ServerStatus_StartTime = init(3074);
    public static final NodeId ServerType_ServerStatus_CurrentTime = init(3075);
    public static final NodeId ServerType_ServerStatus_State = init(3076);
    public static final NodeId ServerType_ServerStatus_BuildInfo = init(3077);
    public static final NodeId ServerType_ServerStatus_BuildInfo_ProductUri = init(3078);
    public static final NodeId ServerType_ServerStatus_BuildInfo_ManufacturerName = init(3079);
    public static final NodeId ServerType_ServerStatus_BuildInfo_ProductName = init(3080);
    public static final NodeId ServerType_ServerStatus_BuildInfo_SoftwareVersion = init(3081);
    public static final NodeId ServerType_ServerStatus_BuildInfo_BuildNumber = init(3082);
    public static final NodeId ServerType_ServerStatus_BuildInfo_BuildDate = init(3083);
    public static final NodeId ServerType_ServerStatus_SecondsTillShutdown = init(3084);
    public static final NodeId ServerType_ServerStatus_ShutdownReason = init(3085);
    public static final NodeId ServerType_ServerCapabilities_ServerProfileArray = init(3086);
    public static final NodeId ServerType_ServerCapabilities_LocaleIdArray = init(3087);
    public static final NodeId ServerType_ServerCapabilities_MinSupportedSampleRate = init(3088);
    public static final NodeId ServerType_ServerCapabilities_MaxBrowseContinuationPoints = init(3089);
    public static final NodeId ServerType_ServerCapabilities_MaxQueryContinuationPoints = init(3090);
    public static final NodeId ServerType_ServerCapabilities_MaxHistoryContinuationPoints = init(3091);
    public static final NodeId ServerType_ServerCapabilities_SoftwareCertificates = init(3092);
    public static final NodeId ServerType_ServerCapabilities_ModellingRules = init(3093);
    public static final NodeId ServerType_ServerCapabilities_AggregateFunctions = init(3094);
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary = init(3095);
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_ServerViewCount = init(3096);
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_CurrentSessionCount = init(3097);
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_CumulatedSessionCount = init(3098);
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_SecurityRejectedSessionCount = init(
        3099
    );
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_RejectedSessionCount = init(3100);
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_SessionTimeoutCount = init(3101);
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_SessionAbortCount = init(3102);
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_PublishingIntervalCount = init(
        3104
    );
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_CurrentSubscriptionCount = init(
        3105
    );
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_CumulatedSubscriptionCount = init(
        3106
    );
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_SecurityRejectedRequestsCount = init(
        3107
    );
    public static final NodeId ServerType_ServerDiagnostics_ServerDiagnosticsSummary_RejectedRequestsCount = init(3108);
    public static final NodeId ServerType_ServerDiagnostics_SamplingIntervalDiagnosticsArray = init(3109);
    public static final NodeId ServerType_ServerDiagnostics_SubscriptionDiagnosticsArray = init(3110);
    public static final NodeId ServerType_ServerDiagnostics_SessionsDiagnosticsSummary = init(3111);
    public static final NodeId ServerType_ServerDiagnostics_SessionsDiagnosticsSummary_SessionDiagnosticsArray = init(
        3112
    );
    public static final NodeId ServerType_ServerDiagnostics_SessionsDiagnosticsSummary_SessionSecurityDiagnosticsArray = init(
        3113
    );
    public static final NodeId ServerType_ServerDiagnostics_EnabledFlag = init(3114);
    public static final NodeId ServerType_ServerRedundancy_RedundancySupport = init(3115);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_ServerViewCount = init(3116);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_CurrentSessionCount = init(3117);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_CumulatedSessionCount = init(3118);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_SecurityRejectedSessionCount = init(3119);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_RejectedSessionCount = init(3120);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_SessionTimeoutCount = init(3121);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_SessionAbortCount = init(3122);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_PublishingIntervalCount = init(3124);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_CurrentSubscriptionCount = init(3125);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_CumulatedSubscriptionCount = init(3126);
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_SecurityRejectedRequestsCount = init(
        3127
    );
    public static final NodeId ServerDiagnosticsType_ServerDiagnosticsSummary_RejectedRequestsCount = init(3128);
    public static final NodeId ServerDiagnosticsType_SessionsDiagnosticsSummary_SessionDiagnosticsArray = init(3129);
    public static final NodeId ServerDiagnosticsType_SessionsDiagnosticsSummary_SessionSecurityDiagnosticsArray = init(
        3130
    );
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_SessionId = init(3131);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_SessionName = init(3132);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_ClientDescription = init(3133);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_ServerUri = init(3134);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_EndpointUrl = init(3135);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_LocaleIds = init(3136);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_ActualSessionTimeout = init(3137);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_MaxResponseMessageSize = init(3138);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_ClientConnectionTime = init(3139);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_ClientLastContactTime = init(3140);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_CurrentSubscriptionsCount = init(3141);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_CurrentMonitoredItemsCount = init(3142);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_CurrentPublishRequestsInQueue = init(
        3143
    );
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_ReadCount = init(3151);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_HistoryReadCount = init(3152);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_WriteCount = init(3153);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_HistoryUpdateCount = init(3154);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_CallCount = init(3155);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_CreateMonitoredItemsCount = init(3156);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_ModifyMonitoredItemsCount = init(3157);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_SetMonitoringModeCount = init(3158);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_SetTriggeringCount = init(3159);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_DeleteMonitoredItemsCount = init(3160);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_CreateSubscriptionCount = init(3161);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_ModifySubscriptionCount = init(3162);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_SetPublishingModeCount = init(3163);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_PublishCount = init(3164);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_RepublishCount = init(3165);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_TransferSubscriptionsCount = init(3166);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_DeleteSubscriptionsCount = init(3167);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_AddNodesCount = init(3168);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_AddReferencesCount = init(3169);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_DeleteNodesCount = init(3170);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_DeleteReferencesCount = init(3171);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_BrowseCount = init(3172);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_BrowseNextCount = init(3173);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_TranslateBrowsePathsToNodeIdsCount = init(
        3174
    );
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_QueryFirstCount = init(3175);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_QueryNextCount = init(3176);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_RegisterNodesCount = init(3177);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_UnregisterNodesCount = init(3178);
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics_SessionId = init(3179);
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics_ClientUserIdOfSession = init(
        3180
    );
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics_ClientUserIdHistory = init(3181);
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics_AuthenticationMechanism = init(
        3182
    );
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics_Encoding = init(3183);
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics_TransportProtocol = init(3184);
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics_SecurityMode = init(3185);
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics_SecurityPolicyUri = init(3186);
    public static final NodeId SessionDiagnosticsObjectType_SessionSecurityDiagnostics_ClientCertificate = init(3187);
    public static final NodeId TransparentRedundancyType_RedundancySupport = init(3188);
    public static final NodeId NonTransparentRedundancyType_RedundancySupport = init(3189);
    public static final NodeId BaseEventType_LocalTime = init(3190);
    public static final NodeId EventQueueOverflowEventType_EventId = init(3191);
    public static final NodeId EventQueueOverflowEventType_EventType = init(3192);
    public static final NodeId EventQueueOverflowEventType_SourceNode = init(3193);
    public static final NodeId EventQueueOverflowEventType_SourceName = init(3194);
    public static final NodeId EventQueueOverflowEventType_Time = init(3195);
    public static final NodeId EventQueueOverflowEventType_ReceiveTime = init(3196);
    public static final NodeId EventQueueOverflowEventType_LocalTime = init(3197);
    public static final NodeId EventQueueOverflowEventType_Message = init(3198);
    public static final NodeId EventQueueOverflowEventType_Severity = init(3199);
    public static final NodeId AuditEventType_EventId = init(3200);
    public static final NodeId AuditEventType_EventType = init(3201);
    public static final NodeId AuditEventType_SourceNode = init(3202);
    public static final NodeId AuditEventType_SourceName = init(3203);
    public static final NodeId AuditEventType_Time = init(3204);
    public static final NodeId AuditEventType_ReceiveTime = init(3205);
    public static final NodeId AuditEventType_LocalTime = init(3206);
    public static final NodeId AuditEventType_Message = init(3207);
    public static final NodeId AuditEventType_Severity = init(3208);
    public static final NodeId AuditSecurityEventType_EventId = init(3209);
    public static final NodeId AuditSecurityEventType_EventType = init(3210);
    public static final NodeId AuditSecurityEventType_SourceNode = init(3211);
    public static final NodeId AuditSecurityEventType_SourceName = init(3212);
    public static final NodeId AuditSecurityEventType_Time = init(3213);
    public static final NodeId AuditSecurityEventType_ReceiveTime = init(3214);
    public static final NodeId AuditSecurityEventType_LocalTime = init(3215);
    public static final NodeId AuditSecurityEventType_Message = init(3216);
    public static final NodeId AuditSecurityEventType_Severity = init(3217);
    public static final NodeId AuditSecurityEventType_ActionTimeStamp = init(3218);
    public static final NodeId AuditSecurityEventType_Status = init(3219);
    public static final NodeId AuditSecurityEventType_ServerId = init(3220);
    public static final NodeId AuditSecurityEventType_ClientAuditEntryId = init(3221);
    public static final NodeId AuditSecurityEventType_ClientUserId = init(3222);
    public static final NodeId AuditChannelEventType_EventId = init(3223);
    public static final NodeId AuditChannelEventType_EventType = init(3224);
    public static final NodeId AuditChannelEventType_SourceNode = init(3225);
    public static final NodeId AuditChannelEventType_SourceName = init(3226);
    public static final NodeId AuditChannelEventType_Time = init(3227);
    public static final NodeId AuditChannelEventType_ReceiveTime = init(3228);
    public static final NodeId AuditChannelEventType_LocalTime = init(3229);
    public static final NodeId AuditChannelEventType_Message = init(3230);
    public static final NodeId AuditChannelEventType_Severity = init(3231);
    public static final NodeId AuditChannelEventType_ActionTimeStamp = init(3232);
    public static final NodeId AuditChannelEventType_Status = init(3233);
    public static final NodeId AuditChannelEventType_ServerId = init(3234);
    public static final NodeId AuditChannelEventType_ClientAuditEntryId = init(3235);
    public static final NodeId AuditChannelEventType_ClientUserId = init(3236);
    public static final NodeId AuditOpenSecureChannelEventType_EventId = init(3237);
    public static final NodeId AuditOpenSecureChannelEventType_EventType = init(3238);
    public static final NodeId AuditOpenSecureChannelEventType_SourceNode = init(3239);
    public static final NodeId AuditOpenSecureChannelEventType_SourceName = init(3240);
    public static final NodeId AuditOpenSecureChannelEventType_Time = init(3241);
    public static final NodeId AuditOpenSecureChannelEventType_ReceiveTime = init(3242);
    public static final NodeId AuditOpenSecureChannelEventType_LocalTime = init(3243);
    public static final NodeId AuditOpenSecureChannelEventType_Message = init(3244);
    public static final NodeId AuditOpenSecureChannelEventType_Severity = init(3245);
    public static final NodeId AuditOpenSecureChannelEventType_ActionTimeStamp = init(3246);
    public static final NodeId AuditOpenSecureChannelEventType_Status = init(3247);
    public static final NodeId AuditOpenSecureChannelEventType_ServerId = init(3248);
    public static final NodeId AuditOpenSecureChannelEventType_ClientAuditEntryId = init(3249);
    public static final NodeId AuditOpenSecureChannelEventType_ClientUserId = init(3250);
    public static final NodeId AuditOpenSecureChannelEventType_SecureChannelId = init(3251);
    public static final NodeId AuditSessionEventType_EventId = init(3252);
    public static final NodeId AuditSessionEventType_EventType = init(3253);
    public static final NodeId AuditSessionEventType_SourceNode = init(3254);
    public static final NodeId AuditSessionEventType_SourceName = init(3255);
    public static final NodeId AuditSessionEventType_Time = init(3256);
    public static final NodeId AuditSessionEventType_ReceiveTime = init(3257);
    public static final NodeId AuditSessionEventType_LocalTime = init(3258);
    public static final NodeId AuditSessionEventType_Message = init(3259);
    public static final NodeId AuditSessionEventType_Severity = init(3260);
    public static final NodeId AuditSessionEventType_ActionTimeStamp = init(3261);
    public static final NodeId AuditSessionEventType_Status = init(3262);
    public static final NodeId AuditSessionEventType_ServerId = init(3263);
    public static final NodeId AuditSessionEventType_ClientAuditEntryId = init(3264);
    public static final NodeId AuditSessionEventType_ClientUserId = init(3265);
    public static final NodeId AuditCreateSessionEventType_EventId = init(3266);
    public static final NodeId AuditCreateSessionEventType_EventType = init(3267);
    public static final NodeId AuditCreateSessionEventType_SourceNode = init(3268);
    public static final NodeId AuditCreateSessionEventType_SourceName = init(3269);
    public static final NodeId AuditCreateSessionEventType_Time = init(3270);
    public static final NodeId AuditCreateSessionEventType_ReceiveTime = init(3271);
    public static final NodeId AuditCreateSessionEventType_LocalTime = init(3272);
    public static final NodeId AuditCreateSessionEventType_Message = init(3273);
    public static final NodeId AuditCreateSessionEventType_Severity = init(3274);
    public static final NodeId AuditCreateSessionEventType_ActionTimeStamp = init(3275);
    public static final NodeId AuditCreateSessionEventType_Status = init(3276);
    public static final NodeId AuditCreateSessionEventType_ServerId = init(3277);
    public static final NodeId AuditCreateSessionEventType_ClientAuditEntryId = init(3278);
    public static final NodeId AuditCreateSessionEventType_ClientUserId = init(3279);
    public static final NodeId AuditUrlMismatchEventType_EventId = init(3281);
    public static final NodeId AuditUrlMismatchEventType_EventType = init(3282);
    public static final NodeId AuditUrlMismatchEventType_SourceNode = init(3283);
    public static final NodeId AuditUrlMismatchEventType_SourceName = init(3284);
    public static final NodeId AuditUrlMismatchEventType_Time = init(3285);
    public static final NodeId AuditUrlMismatchEventType_ReceiveTime = init(3286);
    public static final NodeId AuditUrlMismatchEventType_LocalTime = init(3287);
    public static final NodeId AuditUrlMismatchEventType_Message = init(3288);
    public static final NodeId AuditUrlMismatchEventType_Severity = init(3289);
    public static final NodeId AuditUrlMismatchEventType_ActionTimeStamp = init(3290);
    public static final NodeId AuditUrlMismatchEventType_Status = init(3291);
    public static final NodeId AuditUrlMismatchEventType_ServerId = init(3292);
    public static final NodeId AuditUrlMismatchEventType_ClientAuditEntryId = init(3293);
    public static final NodeId AuditUrlMismatchEventType_ClientUserId = init(3294);
    public static final NodeId AuditUrlMismatchEventType_SecureChannelId = init(3296);
    public static final NodeId AuditUrlMismatchEventType_ClientCertificate = init(3297);
    public static final NodeId AuditUrlMismatchEventType_ClientCertificateThumbprint = init(3298);
    public static final NodeId AuditUrlMismatchEventType_RevisedSessionTimeout = init(3299);
    public static final NodeId AuditActivateSessionEventType_EventId = init(3300);
    public static final NodeId AuditActivateSessionEventType_EventType = init(3301);
    public static final NodeId AuditActivateSessionEventType_SourceNode = init(3302);
    public static final NodeId AuditActivateSessionEventType_SourceName = init(3303);
    public static final NodeId AuditActivateSessionEventType_Time = init(3304);
    public static final NodeId AuditActivateSessionEventType_ReceiveTime = init(3305);
    public static final NodeId AuditActivateSessionEventType_LocalTime = init(3306);
    public static final NodeId AuditActivateSessionEventType_Message = init(3307);
    public static final NodeId AuditActivateSessionEventType_Severity = init(3308);
    public static final NodeId AuditActivateSessionEventType_ActionTimeStamp = init(3309);
    public static final NodeId AuditActivateSessionEventType_Status = init(3310);
    public static final NodeId AuditActivateSessionEventType_ServerId = init(3311);
    public static final NodeId AuditActivateSessionEventType_ClientAuditEntryId = init(3312);
    public static final NodeId AuditActivateSessionEventType_ClientUserId = init(3313);
    public static final NodeId AuditActivateSessionEventType_SessionId = init(3314);
    public static final NodeId AuditCancelEventType_EventId = init(3315);
    public static final NodeId AuditCancelEventType_EventType = init(3316);
    public static final NodeId AuditCancelEventType_SourceNode = init(3317);
    public static final NodeId AuditCancelEventType_SourceName = init(3318);
    public static final NodeId AuditCancelEventType_Time = init(3319);
    public static final NodeId AuditCancelEventType_ReceiveTime = init(3320);
    public static final NodeId AuditCancelEventType_LocalTime = init(3321);
    public static final NodeId AuditCancelEventType_Message = init(3322);
    public static final NodeId AuditCancelEventType_Severity = init(3323);
    public static final NodeId AuditCancelEventType_ActionTimeStamp = init(3324);
    public static final NodeId AuditCancelEventType_Status = init(3325);
    public static final NodeId AuditCancelEventType_ServerId = init(3326);
    public static final NodeId AuditCancelEventType_ClientAuditEntryId = init(3327);
    public static final NodeId AuditCancelEventType_ClientUserId = init(3328);
    public static final NodeId AuditCancelEventType_SessionId = init(3329);
    public static final NodeId AuditCertificateEventType_EventId = init(3330);
    public static final NodeId AuditCertificateEventType_EventType = init(3331);
    public static final NodeId AuditCertificateEventType_SourceNode = init(3332);
    public static final NodeId AuditCertificateEventType_SourceName = init(3333);
    public static final NodeId AuditCertificateEventType_Time = init(3334);
    public static final NodeId AuditCertificateEventType_ReceiveTime = init(3335);
    public static final NodeId AuditCertificateEventType_LocalTime = init(3336);
    public static final NodeId AuditCertificateEventType_Message = init(3337);
    public static final NodeId AuditCertificateEventType_Severity = init(3338);
    public static final NodeId AuditCertificateEventType_ActionTimeStamp = init(3339);
    public static final NodeId AuditCertificateEventType_Status = init(3340);
    public static final NodeId AuditCertificateEventType_ServerId = init(3341);
    public static final NodeId AuditCertificateEventType_ClientAuditEntryId = init(3342);
    public static final NodeId AuditCertificateEventType_ClientUserId = init(3343);
    public static final NodeId AuditCertificateDataMismatchEventType_EventId = init(3344);
    public static final NodeId AuditCertificateDataMismatchEventType_EventType = init(3345);
    public static final NodeId AuditCertificateDataMismatchEventType_SourceNode = init(3346);
    public static final NodeId AuditCertificateDataMismatchEventType_SourceName = init(3347);
    public static final NodeId AuditCertificateDataMismatchEventType_Time = init(3348);
    public static final NodeId AuditCertificateDataMismatchEventType_ReceiveTime = init(3349);
    public static final NodeId AuditCertificateDataMismatchEventType_LocalTime = init(3350);
    public static final NodeId AuditCertificateDataMismatchEventType_Message = init(3351);
    public static final NodeId AuditCertificateDataMismatchEventType_Severity = init(3352);
    public static final NodeId AuditCertificateDataMismatchEventType_ActionTimeStamp = init(3353);
    public static final NodeId AuditCertificateDataMismatchEventType_Status = init(3354);
    public static final NodeId AuditCertificateDataMismatchEventType_ServerId = init(3355);
    public static final NodeId AuditCertificateDataMismatchEventType_ClientAuditEntryId = init(3356);
    public static final NodeId AuditCertificateDataMismatchEventType_ClientUserId = init(3357);
    public static final NodeId AuditCertificateDataMismatchEventType_Certificate = init(3358);
    public static final NodeId AuditCertificateExpiredEventType_EventId = init(3359);
    public static final NodeId AuditCertificateExpiredEventType_EventType = init(3360);
    public static final NodeId AuditCertificateExpiredEventType_SourceNode = init(3361);
    public static final NodeId AuditCertificateExpiredEventType_SourceName = init(3362);
    public static final NodeId AuditCertificateExpiredEventType_Time = init(3363);
    public static final NodeId AuditCertificateExpiredEventType_ReceiveTime = init(3364);
    public static final NodeId AuditCertificateExpiredEventType_LocalTime = init(3365);
    public static final NodeId AuditCertificateExpiredEventType_Message = init(3366);
    public static final NodeId AuditCertificateExpiredEventType_Severity = init(3367);
    public static final NodeId AuditCertificateExpiredEventType_ActionTimeStamp = init(3368);
    public static final NodeId AuditCertificateExpiredEventType_Status = init(3369);
    public static final NodeId AuditCertificateExpiredEventType_ServerId = init(3370);
    public static final NodeId AuditCertificateExpiredEventType_ClientAuditEntryId = init(3371);
    public static final NodeId AuditCertificateExpiredEventType_ClientUserId = init(3372);
    public static final NodeId AuditCertificateExpiredEventType_Certificate = init(3373);
    public static final NodeId AuditCertificateInvalidEventType_EventId = init(3374);
    public static final NodeId AuditCertificateInvalidEventType_EventType = init(3375);
    public static final NodeId AuditCertificateInvalidEventType_SourceNode = init(3376);
    public static final NodeId AuditCertificateInvalidEventType_SourceName = init(3377);
    public static final NodeId AuditCertificateInvalidEventType_Time = init(3378);
    public static final NodeId AuditCertificateInvalidEventType_ReceiveTime = init(3379);
    public static final NodeId AuditCertificateInvalidEventType_LocalTime = init(3380);
    public static final NodeId AuditCertificateInvalidEventType_Message = init(3381);
    public static final NodeId AuditCertificateInvalidEventType_Severity = init(3382);
    public static final NodeId AuditCertificateInvalidEventType_ActionTimeStamp = init(3383);
    public static final NodeId AuditCertificateInvalidEventType_Status = init(3384);
    public static final NodeId AuditCertificateInvalidEventType_ServerId = init(3385);
    public static final NodeId AuditCertificateInvalidEventType_ClientAuditEntryId = init(3386);
    public static final NodeId AuditCertificateInvalidEventType_ClientUserId = init(3387);
    public static final NodeId AuditCertificateInvalidEventType_Certificate = init(3388);
    public static final NodeId AuditCertificateUntrustedEventType_EventId = init(3389);
    public static final NodeId AuditCertificateUntrustedEventType_EventType = init(3390);
    public static final NodeId AuditCertificateUntrustedEventType_SourceNode = init(3391);
    public static final NodeId AuditCertificateUntrustedEventType_SourceName = init(3392);
    public static final NodeId AuditCertificateUntrustedEventType_Time = init(3393);
    public static final NodeId AuditCertificateUntrustedEventType_ReceiveTime = init(3394);
    public static final NodeId AuditCertificateUntrustedEventType_LocalTime = init(3395);
    public static final NodeId AuditCertificateUntrustedEventType_Message = init(3396);
    public static final NodeId AuditCertificateUntrustedEventType_Severity = init(3397);
    public static final NodeId AuditCertificateUntrustedEventType_ActionTimeStamp = init(3398);
    public static final NodeId AuditCertificateUntrustedEventType_Status = init(3399);
    public static final NodeId AuditCertificateUntrustedEventType_ServerId = init(3400);
    public static final NodeId AuditCertificateUntrustedEventType_ClientAuditEntryId = init(3401);
    public static final NodeId AuditCertificateUntrustedEventType_ClientUserId = init(3402);
    public static final NodeId AuditCertificateUntrustedEventType_Certificate = init(3403);
    public static final NodeId AuditCertificateRevokedEventType_EventId = init(3404);
    public static final NodeId AuditCertificateRevokedEventType_EventType = init(3405);
    public static final NodeId AuditCertificateRevokedEventType_SourceNode = init(3406);
    public static final NodeId AuditCertificateRevokedEventType_SourceName = init(3407);
    public static final NodeId AuditCertificateRevokedEventType_Time = init(3408);
    public static final NodeId AuditCertificateRevokedEventType_ReceiveTime = init(3409);
    public static final NodeId AuditCertificateRevokedEventType_LocalTime = init(3410);
    public static final NodeId AuditCertificateRevokedEventType_Message = init(3411);
    public static final NodeId AuditCertificateRevokedEventType_Severity = init(3412);
    public static final NodeId AuditCertificateRevokedEventType_ActionTimeStamp = init(3413);
    public static final NodeId AuditCertificateRevokedEventType_Status = init(3414);
    public static final NodeId AuditCertificateRevokedEventType_ServerId = init(3415);
    public static final NodeId AuditCertificateRevokedEventType_ClientAuditEntryId = init(3416);
    public static final NodeId AuditCertificateRevokedEventType_ClientUserId = init(3417);
    public static final NodeId AuditCertificateRevokedEventType_Certificate = init(3418);
    public static final NodeId AuditCertificateMismatchEventType_EventId = init(3419);
    public static final NodeId AuditCertificateMismatchEventType_EventType = init(3420);
    public static final NodeId AuditCertificateMismatchEventType_SourceNode = init(3421);
    public static final NodeId AuditCertificateMismatchEventType_SourceName = init(3422);
    public static final NodeId AuditCertificateMismatchEventType_Time = init(3423);
    public static final NodeId AuditCertificateMismatchEventType_ReceiveTime = init(3424);
    public static final NodeId AuditCertificateMismatchEventType_LocalTime = init(3425);
    public static final NodeId AuditCertificateMismatchEventType_Message = init(3426);
    public static final NodeId AuditCertificateMismatchEventType_Severity = init(3427);
    public static final NodeId AuditCertificateMismatchEventType_ActionTimeStamp = init(3428);
    public static final NodeId AuditCertificateMismatchEventType_Status = init(3429);
    public static final NodeId AuditCertificateMismatchEventType_ServerId = init(3430);
    public static final NodeId AuditCertificateMismatchEventType_ClientAuditEntryId = init(3431);
    public static final NodeId AuditCertificateMismatchEventType_ClientUserId = init(3432);
    public static final NodeId AuditCertificateMismatchEventType_Certificate = init(3433);
    public static final NodeId AuditNodeManagementEventType_EventId = init(3434);
    public static final NodeId AuditNodeManagementEventType_EventType = init(3435);
    public static final NodeId AuditNodeManagementEventType_SourceNode = init(3436);
    public static final NodeId AuditNodeManagementEventType_SourceName = init(3437);
    public static final NodeId AuditNodeManagementEventType_Time = init(3438);
    public static final NodeId AuditNodeManagementEventType_ReceiveTime = init(3439);
    public static final NodeId AuditNodeManagementEventType_LocalTime = init(3440);
    public static final NodeId AuditNodeManagementEventType_Message = init(3441);
    public static final NodeId AuditNodeManagementEventType_Severity = init(3442);
    public static final NodeId AuditNodeManagementEventType_ActionTimeStamp = init(3443);
    public static final NodeId AuditNodeManagementEventType_Status = init(3444);
    public static final NodeId AuditNodeManagementEventType_ServerId = init(3445);
    public static final NodeId AuditNodeManagementEventType_ClientAuditEntryId = init(3446);
    public static final NodeId AuditNodeManagementEventType_ClientUserId = init(3447);
    public static final NodeId AuditAddNodesEventType_EventId = init(3448);
    public static final NodeId AuditAddNodesEventType_EventType = init(3449);
    public static final NodeId AuditAddNodesEventType_SourceNode = init(3450);
    public static final NodeId AuditAddNodesEventType_SourceName = init(3451);
    public static final NodeId AuditAddNodesEventType_Time = init(3452);
    public static final NodeId AuditAddNodesEventType_ReceiveTime = init(3453);
    public static final NodeId AuditAddNodesEventType_LocalTime = init(3454);
    public static final NodeId AuditAddNodesEventType_Message = init(3455);
    public static final NodeId AuditAddNodesEventType_Severity = init(3456);
    public static final NodeId AuditAddNodesEventType_ActionTimeStamp = init(3457);
    public static final NodeId AuditAddNodesEventType_Status = init(3458);
    public static final NodeId AuditAddNodesEventType_ServerId = init(3459);
    public static final NodeId AuditAddNodesEventType_ClientAuditEntryId = init(3460);
    public static final NodeId AuditAddNodesEventType_ClientUserId = init(3461);
    public static final NodeId AuditDeleteNodesEventType_EventId = init(3462);
    public static final NodeId AuditDeleteNodesEventType_EventType = init(3463);
    public static final NodeId AuditDeleteNodesEventType_SourceNode = init(3464);
    public static final NodeId AuditDeleteNodesEventType_SourceName = init(3465);
    public static final NodeId AuditDeleteNodesEventType_Time = init(3466);
    public static final NodeId AuditDeleteNodesEventType_ReceiveTime = init(3467);
    public static final NodeId AuditDeleteNodesEventType_LocalTime = init(3468);
    public static final NodeId AuditDeleteNodesEventType_Message = init(3469);
    public static final NodeId AuditDeleteNodesEventType_Severity = init(3470);
    public static final NodeId AuditDeleteNodesEventType_ActionTimeStamp = init(3471);
    public static final NodeId AuditDeleteNodesEventType_Status = init(3472);
    public static final NodeId AuditDeleteNodesEventType_ServerId = init(3473);
    public static final NodeId AuditDeleteNodesEventType_ClientAuditEntryId = init(3474);
    public static final NodeId AuditDeleteNodesEventType_ClientUserId = init(3475);
    public static final NodeId AuditAddReferencesEventType_EventId = init(3476);
    public static final NodeId AuditAddReferencesEventType_EventType = init(3477);
    public static final NodeId AuditAddReferencesEventType_SourceNode = init(3478);
    public static final NodeId AuditAddReferencesEventType_SourceName = init(3479);
    public static final NodeId AuditAddReferencesEventType_Time = init(3480);
    public static final NodeId AuditAddReferencesEventType_ReceiveTime = init(3481);
    public static final NodeId AuditAddReferencesEventType_LocalTime = init(3482);
    public static final NodeId AuditAddReferencesEventType_Message = init(3483);
    public static final NodeId AuditAddReferencesEventType_Severity = init(3484);
    public static final NodeId AuditAddReferencesEventType_ActionTimeStamp = init(3485);
    public static final NodeId AuditAddReferencesEventType_Status = init(3486);
    public static final NodeId AuditAddReferencesEventType_ServerId = init(3487);
    public static final NodeId AuditAddReferencesEventType_ClientAuditEntryId = init(3488);
    public static final NodeId AuditAddReferencesEventType_ClientUserId = init(3489);
    public static final NodeId AuditDeleteReferencesEventType_EventId = init(3490);
    public static final NodeId AuditDeleteReferencesEventType_EventType = init(3491);
    public static final NodeId AuditDeleteReferencesEventType_SourceNode = init(3492);
    public static final NodeId AuditDeleteReferencesEventType_SourceName = init(3493);
    public static final NodeId AuditDeleteReferencesEventType_Time = init(3494);
    public static final NodeId AuditDeleteReferencesEventType_ReceiveTime = init(3495);
    public static final NodeId AuditDeleteReferencesEventType_LocalTime = init(3496);
    public static final NodeId AuditDeleteReferencesEventType_Message = init(3497);
    public static final NodeId AuditDeleteReferencesEventType_Severity = init(3498);
    public static final NodeId AuditDeleteReferencesEventType_ActionTimeStamp = init(3499);
    public static final NodeId AuditDeleteReferencesEventType_Status = init(3500);
    public static final NodeId AuditDeleteReferencesEventType_ServerId = init(3501);
    public static final NodeId AuditDeleteReferencesEventType_ClientAuditEntryId = init(3502);
    public static final NodeId AuditDeleteReferencesEventType_ClientUserId = init(3503);
    public static final NodeId AuditUpdateEventType_EventId = init(3504);
    public static final NodeId AuditUpdateEventType_EventType = init(3505);
    public static final NodeId AuditUpdateEventType_SourceNode = init(3506);
    public static final NodeId AuditUpdateEventType_SourceName = init(3507);
    public static final NodeId AuditUpdateEventType_Time = init(3508);
    public static final NodeId AuditUpdateEventType_ReceiveTime = init(3509);
    public static final NodeId AuditUpdateEventType_LocalTime = init(3510);
    public static final NodeId AuditUpdateEventType_Message = init(3511);
    public static final NodeId AuditUpdateEventType_Severity = init(3512);
    public static final NodeId AuditUpdateEventType_ActionTimeStamp = init(3513);
    public static final NodeId AuditUpdateEventType_Status = init(3514);
    public static final NodeId AuditUpdateEventType_ServerId = init(3515);
    public static final NodeId AuditUpdateEventType_ClientAuditEntryId = init(3516);
    public static final NodeId AuditUpdateEventType_ClientUserId = init(3517);
    public static final NodeId AuditWriteUpdateEventType_EventId = init(3518);
    public static final NodeId AuditWriteUpdateEventType_EventType = init(3519);
    public static final NodeId AuditWriteUpdateEventType_SourceNode = init(3520);
    public static final NodeId AuditWriteUpdateEventType_SourceName = init(3521);
    public static final NodeId AuditWriteUpdateEventType_Time = init(3522);
    public static final NodeId AuditWriteUpdateEventType_ReceiveTime = init(3523);
    public static final NodeId AuditWriteUpdateEventType_LocalTime = init(3524);
    public static final NodeId AuditWriteUpdateEventType_Message = init(3525);
    public static final NodeId AuditWriteUpdateEventType_Severity = init(3526);
    public static final NodeId AuditWriteUpdateEventType_ActionTimeStamp = init(3527);
    public static final NodeId AuditWriteUpdateEventType_Status = init(3528);
    public static final NodeId AuditWriteUpdateEventType_ServerId = init(3529);
    public static final NodeId AuditWriteUpdateEventType_ClientAuditEntryId = init(3530);
    public static final NodeId AuditWriteUpdateEventType_ClientUserId = init(3531);
    public static final NodeId AuditHistoryUpdateEventType_EventId = init(3532);
    public static final NodeId AuditHistoryUpdateEventType_EventType = init(3533);
    public static final NodeId AuditHistoryUpdateEventType_SourceNode = init(3534);
    public static final NodeId AuditHistoryUpdateEventType_SourceName = init(3535);
    public static final NodeId AuditHistoryUpdateEventType_Time = init(3536);
    public static final NodeId AuditHistoryUpdateEventType_ReceiveTime = init(3537);
    public static final NodeId AuditHistoryUpdateEventType_LocalTime = init(3538);
    public static final NodeId AuditHistoryUpdateEventType_Message = init(3539);
    public static final NodeId AuditHistoryUpdateEventType_Severity = init(3540);
    public static final NodeId AuditHistoryUpdateEventType_ActionTimeStamp = init(3541);
    public static final NodeId AuditHistoryUpdateEventType_Status = init(3542);
    public static final NodeId AuditHistoryUpdateEventType_ServerId = init(3543);
    public static final NodeId AuditHistoryUpdateEventType_ClientAuditEntryId = init(3544);
    public static final NodeId AuditHistoryUpdateEventType_ClientUserId = init(3545);
    public static final NodeId AuditHistoryEventUpdateEventType_EventId = init(3546);
    public static final NodeId AuditHistoryEventUpdateEventType_EventType = init(3547);
    public static final NodeId AuditHistoryEventUpdateEventType_SourceNode = init(3548);
    public static final NodeId AuditHistoryEventUpdateEventType_SourceName = init(3549);
    public static final NodeId AuditHistoryEventUpdateEventType_Time = init(3550);
    public static final NodeId AuditHistoryEventUpdateEventType_ReceiveTime = init(3551);
    public static final NodeId AuditHistoryEventUpdateEventType_LocalTime = init(3552);
    public static final NodeId AuditHistoryEventUpdateEventType_Message = init(3553);
    public static final NodeId AuditHistoryEventUpdateEventType_Severity = init(3554);
    public static final NodeId AuditHistoryEventUpdateEventType_ActionTimeStamp = init(3555);
    public static final NodeId AuditHistoryEventUpdateEventType_Status = init(3556);
    public static final NodeId AuditHistoryEventUpdateEventType_ServerId = init(3557);
    public static final NodeId AuditHistoryEventUpdateEventType_ClientAuditEntryId = init(3558);
    public static final NodeId AuditHistoryEventUpdateEventType_ClientUserId = init(3559);
    public static final NodeId AuditHistoryEventUpdateEventType_ParameterDataTypeId = init(3560);
    public static final NodeId AuditHistoryValueUpdateEventType_EventId = init(3561);
    public static final NodeId AuditHistoryValueUpdateEventType_EventType = init(3562);
    public static final NodeId AuditHistoryValueUpdateEventType_SourceNode = init(3563);
    public static final NodeId AuditHistoryValueUpdateEventType_SourceName = init(3564);
    public static final NodeId AuditHistoryValueUpdateEventType_Time = init(3565);
    public static final NodeId AuditHistoryValueUpdateEventType_ReceiveTime = init(3566);
    public static final NodeId AuditHistoryValueUpdateEventType_LocalTime = init(3567);
    public static final NodeId AuditHistoryValueUpdateEventType_Message = init(3568);
    public static final NodeId AuditHistoryValueUpdateEventType_Severity = init(3569);
    public static final NodeId AuditHistoryValueUpdateEventType_ActionTimeStamp = init(3570);
    public static final NodeId AuditHistoryValueUpdateEventType_Status = init(3571);
    public static final NodeId AuditHistoryValueUpdateEventType_ServerId = init(3572);
    public static final NodeId AuditHistoryValueUpdateEventType_ClientAuditEntryId = init(3573);
    public static final NodeId AuditHistoryValueUpdateEventType_ClientUserId = init(3574);
    public static final NodeId AuditHistoryValueUpdateEventType_ParameterDataTypeId = init(3575);
    public static final NodeId AuditHistoryDeleteEventType_EventId = init(3576);
    public static final NodeId AuditHistoryDeleteEventType_EventType = init(3577);
    public static final NodeId AuditHistoryDeleteEventType_SourceNode = init(3578);
    public static final NodeId AuditHistoryDeleteEventType_SourceName = init(3579);
    public static final NodeId AuditHistoryDeleteEventType_Time = init(3580);
    public static final NodeId AuditHistoryDeleteEventType_ReceiveTime = init(3581);
    public static final NodeId AuditHistoryDeleteEventType_LocalTime = init(3582);
    public static final NodeId AuditHistoryDeleteEventType_Message = init(3583);
    public static final NodeId AuditHistoryDeleteEventType_Severity = init(3584);
    public static final NodeId AuditHistoryDeleteEventType_ActionTimeStamp = init(3585);
    public static final NodeId AuditHistoryDeleteEventType_Status = init(3586);
    public static final NodeId AuditHistoryDeleteEventType_ServerId = init(3587);
    public static final NodeId AuditHistoryDeleteEventType_ClientAuditEntryId = init(3588);
    public static final NodeId AuditHistoryDeleteEventType_ClientUserId = init(3589);
    public static final NodeId AuditHistoryDeleteEventType_ParameterDataTypeId = init(3590);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_EventId = init(3591);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_EventType = init(3592);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_SourceNode = init(3593);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_SourceName = init(3594);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_Time = init(3595);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_ReceiveTime = init(3596);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_LocalTime = init(3597);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_Message = init(3598);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_Severity = init(3599);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_ActionTimeStamp = init(3600);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_Status = init(3601);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_ServerId = init(3602);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_ClientAuditEntryId = init(3603);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_ClientUserId = init(3604);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_ParameterDataTypeId = init(3605);
    public static final NodeId AuditHistoryRawModifyDeleteEventType_UpdatedNode = init(3606);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_EventId = init(3607);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_EventType = init(3608);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_SourceNode = init(3609);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_SourceName = init(3610);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_Time = init(3611);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_ReceiveTime = init(3612);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_LocalTime = init(3613);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_Message = init(3614);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_Severity = init(3615);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_ActionTimeStamp = init(3616);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_Status = init(3617);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_ServerId = init(3618);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_ClientAuditEntryId = init(3619);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_ClientUserId = init(3620);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_ParameterDataTypeId = init(3621);
    public static final NodeId AuditHistoryAtTimeDeleteEventType_UpdatedNode = init(3622);
    public static final NodeId AuditHistoryEventDeleteEventType_EventId = init(3623);
    public static final NodeId AuditHistoryEventDeleteEventType_EventType = init(3624);
    public static final NodeId AuditHistoryEventDeleteEventType_SourceNode = init(3625);
    public static final NodeId AuditHistoryEventDeleteEventType_SourceName = init(3626);
    public static final NodeId AuditHistoryEventDeleteEventType_Time = init(3627);
    public static final NodeId AuditHistoryEventDeleteEventType_ReceiveTime = init(3628);
    public static final NodeId AuditHistoryEventDeleteEventType_LocalTime = init(3629);
    public static final NodeId AuditHistoryEventDeleteEventType_Message = init(3630);
    public static final NodeId AuditHistoryEventDeleteEventType_Severity = init(3631);
    public static final NodeId AuditHistoryEventDeleteEventType_ActionTimeStamp = init(3632);
    public static final NodeId AuditHistoryEventDeleteEventType_Status = init(3633);
    public static final NodeId AuditHistoryEventDeleteEventType_ServerId = init(3634);
    public static final NodeId AuditHistoryEventDeleteEventType_ClientAuditEntryId = init(3635);
    public static final NodeId AuditHistoryEventDeleteEventType_ClientUserId = init(3636);
    public static final NodeId AuditHistoryEventDeleteEventType_ParameterDataTypeId = init(3637);
    public static final NodeId AuditHistoryEventDeleteEventType_UpdatedNode = init(3638);
    public static final NodeId AuditUpdateMethodEventType_EventId = init(3639);
    public static final NodeId AuditUpdateMethodEventType_EventType = init(3640);
    public static final NodeId AuditUpdateMethodEventType_SourceNode = init(3641);
    public static final NodeId AuditUpdateMethodEventType_SourceName = init(3642);
    public static final NodeId AuditUpdateMethodEventType_Time = init(3643);
    public static final NodeId AuditUpdateMethodEventType_ReceiveTime = init(3644);
    public static final NodeId AuditUpdateMethodEventType_LocalTime = init(3645);
    public static final NodeId AuditUpdateMethodEventType_Message = init(3646);
    public static final NodeId AuditUpdateMethodEventType_Severity = init(3647);
    public static final NodeId AuditUpdateMethodEventType_ActionTimeStamp = init(3648);
    public static final NodeId AuditUpdateMethodEventType_Status = init(3649);
    public static final NodeId AuditUpdateMethodEventType_ServerId = init(3650);
    public static final NodeId AuditUpdateMethodEventType_ClientAuditEntryId = init(3651);
    public static final NodeId AuditUpdateMethodEventType_ClientUserId = init(3652);
    public static final NodeId SystemEventType_EventId = init(3653);
    public static final NodeId SystemEventType_EventType = init(3654);
    public static final NodeId SystemEventType_SourceNode = init(3655);
    public static final NodeId SystemEventType_SourceName = init(3656);
    public static final NodeId SystemEventType_Time = init(3657);
    public static final NodeId SystemEventType_ReceiveTime = init(3658);
    public static final NodeId SystemEventType_LocalTime = init(3659);
    public static final NodeId SystemEventType_Message = init(3660);
    public static final NodeId SystemEventType_Severity = init(3661);
    public static final NodeId DeviceFailureEventType_EventId = init(3662);
    public static final NodeId DeviceFailureEventType_EventType = init(3663);
    public static final NodeId DeviceFailureEventType_SourceNode = init(3664);
    public static final NodeId DeviceFailureEventType_SourceName = init(3665);
    public static final NodeId DeviceFailureEventType_Time = init(3666);
    public static final NodeId DeviceFailureEventType_ReceiveTime = init(3667);
    public static final NodeId DeviceFailureEventType_LocalTime = init(3668);
    public static final NodeId DeviceFailureEventType_Message = init(3669);
    public static final NodeId DeviceFailureEventType_Severity = init(3670);
    public static final NodeId BaseModelChangeEventType_EventId = init(3671);
    public static final NodeId BaseModelChangeEventType_EventType = init(3672);
    public static final NodeId BaseModelChangeEventType_SourceNode = init(3673);
    public static final NodeId BaseModelChangeEventType_SourceName = init(3674);
    public static final NodeId BaseModelChangeEventType_Time = init(3675);
    public static final NodeId BaseModelChangeEventType_ReceiveTime = init(3676);
    public static final NodeId BaseModelChangeEventType_LocalTime = init(3677);
    public static final NodeId BaseModelChangeEventType_Message = init(3678);
    public static final NodeId BaseModelChangeEventType_Severity = init(3679);
    public static final NodeId GeneralModelChangeEventType_EventId = init(3680);
    public static final NodeId GeneralModelChangeEventType_EventType = init(3681);
    public static final NodeId GeneralModelChangeEventType_SourceNode = init(3682);
    public static final NodeId GeneralModelChangeEventType_SourceName = init(3683);
    public static final NodeId GeneralModelChangeEventType_Time = init(3684);
    public static final NodeId GeneralModelChangeEventType_ReceiveTime = init(3685);
    public static final NodeId GeneralModelChangeEventType_LocalTime = init(3686);
    public static final NodeId GeneralModelChangeEventType_Message = init(3687);
    public static final NodeId GeneralModelChangeEventType_Severity = init(3688);
    public static final NodeId SemanticChangeEventType_EventId = init(3689);
    public static final NodeId SemanticChangeEventType_EventType = init(3690);
    public static final NodeId SemanticChangeEventType_SourceNode = init(3691);
    public static final NodeId SemanticChangeEventType_SourceName = init(3692);
    public static final NodeId SemanticChangeEventType_Time = init(3693);
    public static final NodeId SemanticChangeEventType_ReceiveTime = init(3694);
    public static final NodeId SemanticChangeEventType_LocalTime = init(3695);
    public static final NodeId SemanticChangeEventType_Message = init(3696);
    public static final NodeId SemanticChangeEventType_Severity = init(3697);
    public static final NodeId ServerStatusType_BuildInfo_ProductUri = init(3698);
    public static final NodeId ServerStatusType_BuildInfo_ManufacturerName = init(3699);
    public static final NodeId ServerStatusType_BuildInfo_ProductName = init(3700);
    public static final NodeId ServerStatusType_BuildInfo_SoftwareVersion = init(3701);
    public static final NodeId ServerStatusType_BuildInfo_BuildNumber = init(3702);
    public static final NodeId ServerStatusType_BuildInfo_BuildDate = init(3703);
    public static final NodeId Server_ServerCapabilities_SoftwareCertificates = init(3704);
    public static final NodeId Server_ServerDiagnostics_ServerDiagnosticsSummary_RejectedSessionCount = init(3705);
    public static final NodeId Server_ServerDiagnostics_SessionsDiagnosticsSummary = init(3706);
    public static final NodeId Server_ServerDiagnostics_SessionsDiagnosticsSummary_SessionDiagnosticsArray = init(3707);
    public static final NodeId Server_ServerDiagnostics_SessionsDiagnosticsSummary_SessionSecurityDiagnosticsArray = init(
        3708
    );
    public static final NodeId Server_ServerRedundancy_RedundancySupport = init(3709);
    public static final NodeId FiniteStateVariableType_Name = init(3714);
    public static final NodeId FiniteStateVariableType_Number = init(3715);
    public static final NodeId FiniteStateVariableType_EffectiveDisplayName = init(3716);
    public static final NodeId FiniteTransitionVariableType_Name = init(3717);
    public static final NodeId FiniteTransitionVariableType_Number = init(3718);
    public static final NodeId FiniteTransitionVariableType_TransitionTime = init(3719);
    public static final NodeId StateMachineType_CurrentState_Id = init(3720);
    public static final NodeId StateMachineType_CurrentState_Name = init(3721);
    public static final NodeId StateMachineType_CurrentState_Number = init(3722);
    public static final NodeId StateMachineType_CurrentState_EffectiveDisplayName = init(3723);
    public static final NodeId StateMachineType_LastTransition_Id = init(3724);
    public static final NodeId StateMachineType_LastTransition_Name = init(3725);
    public static final NodeId StateMachineType_LastTransition_Number = init(3726);
    public static final NodeId StateMachineType_LastTransition_TransitionTime = init(3727);
    public static final NodeId FiniteStateMachineType_CurrentState_Id = init(3728);
    public static final NodeId FiniteStateMachineType_CurrentState_Name = init(3729);
    public static final NodeId FiniteStateMachineType_CurrentState_Number = init(3730);
    public static final NodeId FiniteStateMachineType_CurrentState_EffectiveDisplayName = init(3731);
    public static final NodeId FiniteStateMachineType_LastTransition_Id = init(3732);
    public static final NodeId FiniteStateMachineType_LastTransition_Name = init(3733);
    public static final NodeId FiniteStateMachineType_LastTransition_Number = init(3734);
    public static final NodeId FiniteStateMachineType_LastTransition_TransitionTime = init(3735);
    public static final NodeId InitialStateType_StateNumber = init(3736);
    public static final NodeId TransitionEventType_EventId = init(3737);
    public static final NodeId TransitionEventType_EventType = init(3738);
    public static final NodeId TransitionEventType_SourceNode = init(3739);
    public static final NodeId TransitionEventType_SourceName = init(3740);
    public static final NodeId TransitionEventType_Time = init(3741);
    public static final NodeId TransitionEventType_ReceiveTime = init(3742);
    public static final NodeId TransitionEventType_LocalTime = init(3743);
    public static final NodeId TransitionEventType_Message = init(3744);
    public static final NodeId TransitionEventType_Severity = init(3745);
    public static final NodeId TransitionEventType_FromState_Id = init(3746);
    public static final NodeId TransitionEventType_FromState_Name = init(3747);
    public static final NodeId TransitionEventType_FromState_Number = init(3748);
    public static final NodeId TransitionEventType_FromState_EffectiveDisplayName = init(3749);
    public static final NodeId TransitionEventType_ToState_Id = init(3750);
    public static final NodeId TransitionEventType_ToState_Name = init(3751);
    public static final NodeId TransitionEventType_ToState_Number = init(3752);
    public static final NodeId TransitionEventType_ToState_EffectiveDisplayName = init(3753);
    public static final NodeId TransitionEventType_Transition_Id = init(3754);
    public static final NodeId TransitionEventType_Transition_Name = init(3755);
    public static final NodeId TransitionEventType_Transition_Number = init(3756);
    public static final NodeId TransitionEventType_Transition_TransitionTime = init(3757);
    public static final NodeId AuditUpdateStateEventType_EventId = init(3758);
    public static final NodeId AuditUpdateStateEventType_EventType = init(3759);
    public static final NodeId AuditUpdateStateEventType_SourceNode = init(3760);
    public static final NodeId AuditUpdateStateEventType_SourceName = init(3761);
    public static final NodeId AuditUpdateStateEventType_Time = init(3762);
    public static final NodeId AuditUpdateStateEventType_ReceiveTime = init(3763);
    public static final NodeId AuditUpdateStateEventType_LocalTime = init(3764);
    public static final NodeId AuditUpdateStateEventType_Message = init(3765);
    public static final NodeId AuditUpdateStateEventType_Severity = init(3766);
    public static final NodeId AuditUpdateStateEventType_ActionTimeStamp = init(3767);
    public static final NodeId AuditUpdateStateEventType_Status = init(3768);
    public static final NodeId AuditUpdateStateEventType_ServerId = init(3769);
    public static final NodeId AuditUpdateStateEventType_ClientAuditEntryId = init(3770);
    public static final NodeId AuditUpdateStateEventType_ClientUserId = init(3771);
    public static final NodeId AuditUpdateStateEventType_MethodId = init(3772);
    public static final NodeId AuditUpdateStateEventType_InputArguments = init(3773);
    public static final NodeId AnalogItemType_Definition = init(3774);
    public static final NodeId AnalogItemType_ValuePrecision = init(3775);
    public static final NodeId DiscreteItemType_Definition = init(3776);
    public static final NodeId DiscreteItemType_ValuePrecision = init(3777);
    public static final NodeId TwoStateDiscreteType_Definition = init(3778);
    public static final NodeId TwoStateDiscreteType_ValuePrecision = init(3779);
    public static final NodeId MultiStateDiscreteType_Definition = init(3780);
    public static final NodeId MultiStateDiscreteType_ValuePrecision = init(3781);
    public static final NodeId ProgramTransitionEventType_EventId = init(3782);
    public static final NodeId ProgramTransitionEventType_EventType = init(3783);
    public static final NodeId ProgramTransitionEventType_SourceNode = init(3784);
    public static final NodeId ProgramTransitionEventType_SourceName = init(3785);
    public static final NodeId ProgramTransitionEventType_Time = init(3786);
    public static final NodeId ProgramTransitionEventType_ReceiveTime = init(3787);
    public static final NodeId ProgramTransitionEventType_LocalTime = init(3788);
    public static final NodeId ProgramTransitionEventType_Message = init(3789);
    public static final NodeId ProgramTransitionEventType_Severity = init(3790);
    public static final NodeId ProgramTransitionEventType_FromState = init(3791);
    public static final NodeId ProgramTransitionEventType_FromState_Id = init(3792);
    public static final NodeId ProgramTransitionEventType_FromState_Name = init(3793);
    public static final NodeId ProgramTransitionEventType_FromState_Number = init(3794);
    public static final NodeId ProgramTransitionEventType_FromState_EffectiveDisplayName = init(3795);
    public static final NodeId ProgramTransitionEventType_ToState = init(3796);
    public static final NodeId ProgramTransitionEventType_ToState_Id = init(3797);
    public static final NodeId ProgramTransitionEventType_ToState_Name = init(3798);
    public static final NodeId ProgramTransitionEventType_ToState_Number = init(3799);
    public static final NodeId ProgramTransitionEventType_ToState_EffectiveDisplayName = init(3800);
    public static final NodeId ProgramTransitionEventType_Transition = init(3801);
    public static final NodeId ProgramTransitionEventType_Transition_Id = init(3802);
    public static final NodeId ProgramTransitionEventType_Transition_Name = init(3803);
    public static final NodeId ProgramTransitionEventType_Transition_Number = init(3804);
    public static final NodeId ProgramTransitionEventType_Transition_TransitionTime = init(3805);
    public static final NodeId ProgramTransitionAuditEventType = init(3806);
    public static final NodeId ProgramTransitionAuditEventType_EventId = init(3807);
    public static final NodeId ProgramTransitionAuditEventType_EventType = init(3808);
    public static final NodeId ProgramTransitionAuditEventType_SourceNode = init(3809);
    public static final NodeId ProgramTransitionAuditEventType_SourceName = init(3810);
    public static final NodeId ProgramTransitionAuditEventType_Time = init(3811);
    public static final NodeId ProgramTransitionAuditEventType_ReceiveTime = init(3812);
    public static final NodeId ProgramTransitionAuditEventType_LocalTime = init(3813);
    public static final NodeId ProgramTransitionAuditEventType_Message = init(3814);
    public static final NodeId ProgramTransitionAuditEventType_Severity = init(3815);
    public static final NodeId ProgramTransitionAuditEventType_ActionTimeStamp = init(3816);
    public static final NodeId ProgramTransitionAuditEventType_Status = init(3817);
    public static final NodeId ProgramTransitionAuditEventType_ServerId = init(3818);
    public static final NodeId ProgramTransitionAuditEventType_ClientAuditEntryId = init(3819);
    public static final NodeId ProgramTransitionAuditEventType_ClientUserId = init(3820);
    public static final NodeId ProgramTransitionAuditEventType_MethodId = init(3821);
    public static final NodeId ProgramTransitionAuditEventType_InputArguments = init(3822);
    public static final NodeId ProgramTransitionAuditEventType_OldStateId = init(3823);
    public static final NodeId ProgramTransitionAuditEventType_NewStateId = init(3824);
    public static final NodeId ProgramTransitionAuditEventType_Transition = init(3825);
    public static final NodeId ProgramTransitionAuditEventType_Transition_Id = init(3826);
    public static final NodeId ProgramTransitionAuditEventType_Transition_Name = init(3827);
    public static final NodeId ProgramTransitionAuditEventType_Transition_Number = init(3828);
    public static final NodeId ProgramTransitionAuditEventType_Transition_TransitionTime = init(3829);
    public static final NodeId ProgramStateMachineType_CurrentState = init(3830);
    public static final NodeId ProgramStateMachineType_CurrentState_Id = init(3831);
    public static final NodeId ProgramStateMachineType_CurrentState_Name = init(3832);
    public static final NodeId ProgramStateMachineType_CurrentState_Number = init(3833);
    public static final NodeId ProgramStateMachineType_CurrentState_EffectiveDisplayName = init(3834);
    public static final NodeId ProgramStateMachineType_LastTransition = init(3835);
    public static final NodeId ProgramStateMachineType_LastTransition_Id = init(3836);
    public static final NodeId ProgramStateMachineType_LastTransition_Name = init(3837);
    public static final NodeId ProgramStateMachineType_LastTransition_Number = init(3838);
    public static final NodeId ProgramStateMachineType_LastTransition_TransitionTime = init(3839);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_CreateSessionId = init(3840);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_CreateClientName = init(3841);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_InvocationCreationTime = init(3842);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_LastTransitionTime = init(3843);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_LastMethodCall = init(3844);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_LastMethodSessionId = init(3845);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_LastMethodInputArguments = init(3846);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_LastMethodOutputArguments = init(3847);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_LastMethodCallTime = init(3848);
    public static final NodeId ProgramStateMachineType_ProgramDiagnostics_LastMethodReturnStatus = init(3849);
    public static final NodeId ProgramStateMachineType_FinalResultData = init(3850);
    public static final NodeId AddCommentMethodType = init(3863);
    public static final NodeId AddCommentMethodType_InputArguments = init(3864);
    public static final NodeId ConditionType_EventId = init(3865);
    public static final NodeId ConditionType_EventType = init(3866);
    public static final NodeId ConditionType_SourceNode = init(3867);
    public static final NodeId ConditionType_SourceName = init(3868);
    public static final NodeId ConditionType_Time = init(3869);
    public static final NodeId ConditionType_ReceiveTime = init(3870);
    public static final NodeId ConditionType_LocalTime = init(3871);
    public static final NodeId ConditionType_Message = init(3872);
    public static final NodeId ConditionType_Severity = init(3873);
    public static final NodeId ConditionType_Retain = init(3874);
    public static final NodeId ConditionType_ConditionRefresh = init(3875);
    public static final NodeId ConditionType_ConditionRefresh_InputArguments = init(3876);
    public static final NodeId RefreshStartEventType_EventId = init(3969);
    public static final NodeId RefreshStartEventType_EventType = init(3970);
    public static final NodeId RefreshStartEventType_SourceNode = init(3971);
    public static final NodeId RefreshStartEventType_SourceName = init(3972);
    public static final NodeId RefreshStartEventType_Time = init(3973);
    public static final NodeId RefreshStartEventType_ReceiveTime = init(3974);
    public static final NodeId RefreshStartEventType_LocalTime = init(3975);
    public static final NodeId RefreshStartEventType_Message = init(3976);
    public static final NodeId RefreshStartEventType_Severity = init(3977);
    public static final NodeId RefreshEndEventType_EventId = init(3978);
    public static final NodeId RefreshEndEventType_EventType = init(3979);
    public static final NodeId RefreshEndEventType_SourceNode = init(3980);
    public static final NodeId RefreshEndEventType_SourceName = init(3981);
    public static final NodeId RefreshEndEventType_Time = init(3982);
    public static final NodeId RefreshEndEventType_ReceiveTime = init(3983);
    public static final NodeId RefreshEndEventType_LocalTime = init(3984);
    public static final NodeId RefreshEndEventType_Message = init(3985);
    public static final NodeId RefreshEndEventType_Severity = init(3986);
    public static final NodeId RefreshRequiredEventType_EventId = init(3987);
    public static final NodeId RefreshRequiredEventType_EventType = init(3988);
    public static final NodeId RefreshRequiredEventType_SourceNode = init(3989);
    public static final NodeId RefreshRequiredEventType_SourceName = init(3990);
    public static final NodeId RefreshRequiredEventType_Time = init(3991);
    public static final NodeId RefreshRequiredEventType_ReceiveTime = init(3992);
    public static final NodeId RefreshRequiredEventType_LocalTime = init(3993);
    public static final NodeId RefreshRequiredEventType_Message = init(3994);
    public static final NodeId RefreshRequiredEventType_Severity = init(3995);
    public static final NodeId AuditConditionEventType_EventId = init(3996);
    public static final NodeId AuditConditionEventType_EventType = init(3997);
    public static final NodeId AuditConditionEventType_SourceNode = init(3998);
    public static final NodeId AuditConditionEventType_SourceName = init(3999);
    public static final NodeId AuditConditionEventType_Time = init(4000);
    public static final NodeId AuditConditionEventType_ReceiveTime = init(4001);
    public static final NodeId AuditConditionEventType_LocalTime = init(4002);
    public static final NodeId AuditConditionEventType_Message = init(4003);
    public static final NodeId AuditConditionEventType_Severity = init(4004);
    public static final NodeId AuditConditionEventType_ActionTimeStamp = init(4005);
    public static final NodeId AuditConditionEventType_Status = init(4006);
    public static final NodeId AuditConditionEventType_ServerId = init(4007);
    public static final NodeId AuditConditionEventType_ClientAuditEntryId = init(4008);
    public static final NodeId AuditConditionEventType_ClientUserId = init(4009);
    public static final NodeId AuditConditionEventType_MethodId = init(4010);
    public static final NodeId AuditConditionEventType_InputArguments = init(4011);
    public static final NodeId AuditConditionEnableEventType_EventId = init(4106);
    public static final NodeId AuditConditionEnableEventType_EventType = init(4107);
    public static final NodeId AuditConditionEnableEventType_SourceNode = init(4108);
    public static final NodeId AuditConditionEnableEventType_SourceName = init(4109);
    public static final NodeId AuditConditionEnableEventType_Time = init(4110);
    public static final NodeId AuditConditionEnableEventType_ReceiveTime = init(4111);
    public static final NodeId AuditConditionEnableEventType_LocalTime = init(4112);
    public static final NodeId AuditConditionEnableEventType_Message = init(4113);
    public static final NodeId AuditConditionEnableEventType_Severity = init(4114);
    public static final NodeId AuditConditionEnableEventType_ActionTimeStamp = init(4115);
    public static final NodeId AuditConditionEnableEventType_Status = init(4116);
    public static final NodeId AuditConditionEnableEventType_ServerId = init(4117);
    public static final NodeId AuditConditionEnableEventType_ClientAuditEntryId = init(4118);
    public static final NodeId AuditConditionEnableEventType_ClientUserId = init(4119);
    public static final NodeId AuditConditionEnableEventType_MethodId = init(4120);
    public static final NodeId AuditConditionEnableEventType_InputArguments = init(4121);
    public static final NodeId AuditConditionCommentEventType_EventId = init(4170);
    public static final NodeId AuditConditionCommentEventType_EventType = init(4171);
    public static final NodeId AuditConditionCommentEventType_SourceNode = init(4172);
    public static final NodeId AuditConditionCommentEventType_SourceName = init(4173);
    public static final NodeId AuditConditionCommentEventType_Time = init(4174);
    public static final NodeId AuditConditionCommentEventType_ReceiveTime = init(4175);
    public static final NodeId AuditConditionCommentEventType_LocalTime = init(4176);
    public static final NodeId AuditConditionCommentEventType_Message = init(4177);
    public static final NodeId AuditConditionCommentEventType_Severity = init(4178);
    public static final NodeId AuditConditionCommentEventType_ActionTimeStamp = init(4179);
    public static final NodeId AuditConditionCommentEventType_Status = init(4180);
    public static final NodeId AuditConditionCommentEventType_ServerId = init(4181);
    public static final NodeId AuditConditionCommentEventType_ClientAuditEntryId = init(4182);
    public static final NodeId AuditConditionCommentEventType_ClientUserId = init(4183);
    public static final NodeId AuditConditionCommentEventType_MethodId = init(4184);
    public static final NodeId AuditConditionCommentEventType_InputArguments = init(4185);
    public static final NodeId DialogConditionType_EventId = init(4188);
    public static final NodeId DialogConditionType_EventType = init(4189);
    public static final NodeId DialogConditionType_SourceNode = init(4190);
    public static final NodeId DialogConditionType_SourceName = init(4191);
    public static final NodeId DialogConditionType_Time = init(4192);
    public static final NodeId DialogConditionType_ReceiveTime = init(4193);
    public static final NodeId DialogConditionType_LocalTime = init(4194);
    public static final NodeId DialogConditionType_Message = init(4195);
    public static final NodeId DialogConditionType_Severity = init(4196);
    public static final NodeId DialogConditionType_Retain = init(4197);
    public static final NodeId DialogConditionType_ConditionRefresh = init(4198);
    public static final NodeId DialogConditionType_ConditionRefresh_InputArguments = init(4199);
    public static final NodeId AcknowledgeableConditionType_EventId = init(5113);
    public static final NodeId AcknowledgeableConditionType_EventType = init(5114);
    public static final NodeId AcknowledgeableConditionType_SourceNode = init(5115);
    public static final NodeId AcknowledgeableConditionType_SourceName = init(5116);
    public static final NodeId AcknowledgeableConditionType_Time = init(5117);
    public static final NodeId AcknowledgeableConditionType_ReceiveTime = init(5118);
    public static final NodeId AcknowledgeableConditionType_LocalTime = init(5119);
    public static final NodeId AcknowledgeableConditionType_Message = init(5120);
    public static final NodeId AcknowledgeableConditionType_Severity = init(5121);
    public static final NodeId AcknowledgeableConditionType_Retain = init(5122);
    public static final NodeId AcknowledgeableConditionType_ConditionRefresh = init(5123);
    public static final NodeId AcknowledgeableConditionType_ConditionRefresh_InputArguments = init(5124);
    public static final NodeId AlarmConditionType_EventId = init(5540);
    public static final NodeId AlarmConditionType_EventType = init(5541);
    public static final NodeId AlarmConditionType_SourceNode = init(5542);
    public static final NodeId AlarmConditionType_SourceName = init(5543);
    public static final NodeId AlarmConditionType_Time = init(5544);
    public static final NodeId AlarmConditionType_ReceiveTime = init(5545);
    public static final NodeId AlarmConditionType_LocalTime = init(5546);
    public static final NodeId AlarmConditionType_Message = init(5547);
    public static final NodeId AlarmConditionType_Severity = init(5548);
    public static final NodeId AlarmConditionType_Retain = init(5549);
    public static final NodeId AlarmConditionType_ConditionRefresh = init(5550);
    public static final NodeId AlarmConditionType_ConditionRefresh_InputArguments = init(5551);
    public static final NodeId ShelvedStateMachineType_CurrentState = init(6088);
    public static final NodeId ShelvedStateMachineType_CurrentState_Id = init(6089);
    public static final NodeId ShelvedStateMachineType_CurrentState_Name = init(6090);
    public static final NodeId ShelvedStateMachineType_CurrentState_Number = init(6091);
    public static final NodeId ShelvedStateMachineType_CurrentState_EffectiveDisplayName = init(6092);
    public static final NodeId ShelvedStateMachineType_LastTransition = init(6093);
    public static final NodeId ShelvedStateMachineType_LastTransition_Id = init(6094);
    public static final NodeId ShelvedStateMachineType_LastTransition_Name = init(6095);
    public static final NodeId ShelvedStateMachineType_LastTransition_Number = init(6096);
    public static final NodeId ShelvedStateMachineType_LastTransition_TransitionTime = init(6097);
    public static final NodeId ShelvedStateMachineType_Unshelved_StateNumber = init(6098);
    public static final NodeId ShelvedStateMachineType_TimedShelved_StateNumber = init(6100);
    public static final NodeId ShelvedStateMachineType_OneShotShelved_StateNumber = init(6101);
    public static final NodeId TimedShelveMethodType = init(6102);
    public static final NodeId TimedShelveMethodType_InputArguments = init(6103);
    public static final NodeId LimitAlarmType_EventId = init(6116);
    public static final NodeId LimitAlarmType_EventType = init(6117);
    public static final NodeId LimitAlarmType_SourceNode = init(6118);
    public static final NodeId LimitAlarmType_SourceName = init(6119);
    public static final NodeId LimitAlarmType_Time = init(6120);
    public static final NodeId LimitAlarmType_ReceiveTime = init(6121);
    public static final NodeId LimitAlarmType_LocalTime = init(6122);
    public static final NodeId LimitAlarmType_Message = init(6123);
    public static final NodeId LimitAlarmType_Severity = init(6124);
    public static final NodeId LimitAlarmType_Retain = init(6125);
    public static final NodeId LimitAlarmType_ConditionRefresh = init(6126);
    public static final NodeId LimitAlarmType_ConditionRefresh_InputArguments = init(6127);
    public static final NodeId IdType_EnumStrings = init(7591);
    public static final NodeId EnumValueType = init(7594);
    public static final NodeId MessageSecurityMode_EnumStrings = init(7595);
    public static final NodeId UserTokenType_EnumStrings = init(7596);
    public static final NodeId ApplicationType_EnumStrings = init(7597);
    public static final NodeId SecurityTokenRequestType_EnumStrings = init(7598);
    public static final NodeId ComplianceLevel_EnumStrings = init(7599);
    public static final NodeId BrowseDirection_EnumStrings = init(7603);
    public static final NodeId FilterOperator_EnumStrings = init(7605);
    public static final NodeId TimestampsToReturn_EnumStrings = init(7606);
    public static final NodeId MonitoringMode_EnumStrings = init(7608);
    public static final NodeId DataChangeTrigger_EnumStrings = init(7609);
    public static final NodeId DeadbandType_EnumStrings = init(7610);
    public static final NodeId RedundancySupport_EnumStrings = init(7611);
    public static final NodeId ServerState_EnumStrings = init(7612);
    public static final NodeId ExceptionDeviationFormat_EnumStrings = init(7614);
    public static final NodeId EnumValueType_Encoding_DefaultXml = init(7616);
    public static final NodeId OpcUa_BinarySchema = init(7617);
    public static final NodeId OpcUa_BinarySchema_DataTypeVersion = init(7618);
    public static final NodeId OpcUa_BinarySchema_NamespaceUri = init(7619);
    public static final NodeId OpcUa_BinarySchema_Argument = init(7650);
    public static final NodeId OpcUa_BinarySchema_Argument_DataTypeVersion = init(7651);
    public static final NodeId OpcUa_BinarySchema_Argument_DictionaryFragment = init(7652);
    public static final NodeId OpcUa_BinarySchema_EnumValueType = init(7656);
    public static final NodeId OpcUa_BinarySchema_EnumValueType_DataTypeVersion = init(7657);
    public static final NodeId OpcUa_BinarySchema_EnumValueType_DictionaryFragment = init(7658);
    public static final NodeId OpcUa_BinarySchema_StatusResult = init(7659);
    public static final NodeId OpcUa_BinarySchema_StatusResult_DataTypeVersion = init(7660);
    public static final NodeId OpcUa_BinarySchema_StatusResult_DictionaryFragment = init(7661);
    public static final NodeId OpcUa_BinarySchema_UserTokenPolicy = init(7662);
    public static final NodeId OpcUa_BinarySchema_UserTokenPolicy_DataTypeVersion = init(7663);
    public static final NodeId OpcUa_BinarySchema_UserTokenPolicy_DictionaryFragment = init(7664);
    public static final NodeId OpcUa_BinarySchema_ApplicationDescription = init(7665);
    public static final NodeId OpcUa_BinarySchema_ApplicationDescription_DataTypeVersion = init(7666);
    public static final NodeId OpcUa_BinarySchema_ApplicationDescription_DictionaryFragment = init(7667);
    public static final NodeId OpcUa_BinarySchema_EndpointDescription = init(7668);
    public static final NodeId OpcUa_BinarySchema_EndpointDescription_DataTypeVersion = init(7669);
    public static final NodeId OpcUa_BinarySchema_EndpointDescription_DictionaryFragment = init(7670);
    public static final NodeId OpcUa_BinarySchema_UserIdentityToken = init(7671);
    public static final NodeId OpcUa_BinarySchema_UserIdentityToken_DataTypeVersion = init(7672);
    public static final NodeId OpcUa_BinarySchema_UserIdentityToken_DictionaryFragment = init(7673);
    public static final NodeId OpcUa_BinarySchema_AnonymousIdentityToken = init(7674);
    public static final NodeId OpcUa_BinarySchema_AnonymousIdentityToken_DataTypeVersion = init(7675);
    public static final NodeId OpcUa_BinarySchema_AnonymousIdentityToken_DictionaryFragment = init(7676);
    public static final NodeId OpcUa_BinarySchema_UserNameIdentityToken = init(7677);
    public static final NodeId OpcUa_BinarySchema_UserNameIdentityToken_DataTypeVersion = init(7678);
    public static final NodeId OpcUa_BinarySchema_UserNameIdentityToken_DictionaryFragment = init(7679);
    public static final NodeId OpcUa_BinarySchema_X509IdentityToken = init(7680);
    public static final NodeId OpcUa_BinarySchema_X509IdentityToken_DataTypeVersion = init(7681);
    public static final NodeId OpcUa_BinarySchema_X509IdentityToken_DictionaryFragment = init(7682);
    public static final NodeId OpcUa_BinarySchema_IssuedIdentityToken = init(7683);
    public static final NodeId OpcUa_BinarySchema_IssuedIdentityToken_DataTypeVersion = init(7684);
    public static final NodeId OpcUa_BinarySchema_IssuedIdentityToken_DictionaryFragment = init(7685);
    public static final NodeId OpcUa_BinarySchema_EndpointConfiguration = init(7686);
    public static final NodeId OpcUa_BinarySchema_EndpointConfiguration_DataTypeVersion = init(7687);
    public static final NodeId OpcUa_BinarySchema_EndpointConfiguration_DictionaryFragment = init(7688);
    public static final NodeId OpcUa_BinarySchema_SupportedProfile = init(7689);
    public static final NodeId OpcUa_BinarySchema_SupportedProfile_DataTypeVersion = init(7690);
    public static final NodeId OpcUa_BinarySchema_SupportedProfile_DictionaryFragment = init(7691);
    public static final NodeId OpcUa_BinarySchema_BuildInfo = init(7692);
    public static final NodeId OpcUa_BinarySchema_BuildInfo_DataTypeVersion = init(7693);
    public static final NodeId OpcUa_BinarySchema_BuildInfo_DictionaryFragment = init(7694);
    public static final NodeId OpcUa_BinarySchema_SoftwareCertificate = init(7695);
    public static final NodeId OpcUa_BinarySchema_SoftwareCertificate_DataTypeVersion = init(7696);
    public static final NodeId OpcUa_BinarySchema_SoftwareCertificate_DictionaryFragment = init(7697);
    public static final NodeId OpcUa_BinarySchema_SignedSoftwareCertificate = init(7698);
    public static final NodeId OpcUa_BinarySchema_SignedSoftwareCertificate_DataTypeVersion = init(7699);
    public static final NodeId OpcUa_BinarySchema_SignedSoftwareCertificate_DictionaryFragment = init(7700);
    public static final NodeId OpcUa_BinarySchema_AddNodesItem = init(7728);
    public static final NodeId OpcUa_BinarySchema_AddNodesItem_DataTypeVersion = init(7729);
    public static final NodeId OpcUa_BinarySchema_AddNodesItem_DictionaryFragment = init(7730);
    public static final NodeId OpcUa_BinarySchema_AddReferencesItem = init(7731);
    public static final NodeId OpcUa_BinarySchema_AddReferencesItem_DataTypeVersion = init(7732);
    public static final NodeId OpcUa_BinarySchema_AddReferencesItem_DictionaryFragment = init(7733);
    public static final NodeId OpcUa_BinarySchema_DeleteNodesItem = init(7734);
    public static final NodeId OpcUa_BinarySchema_DeleteNodesItem_DataTypeVersion = init(7735);
    public static final NodeId OpcUa_BinarySchema_DeleteNodesItem_DictionaryFragment = init(7736);
    public static final NodeId OpcUa_BinarySchema_DeleteReferencesItem = init(7737);
    public static final NodeId OpcUa_BinarySchema_DeleteReferencesItem_DataTypeVersion = init(7738);
    public static final NodeId OpcUa_BinarySchema_DeleteReferencesItem_DictionaryFragment = init(7739);
    public static final NodeId OpcUa_BinarySchema_RegisteredServer = init(7782);
    public static final NodeId OpcUa_BinarySchema_RegisteredServer_DataTypeVersion = init(7783);
    public static final NodeId OpcUa_BinarySchema_RegisteredServer_DictionaryFragment = init(7784);
    public static final NodeId OpcUa_BinarySchema_ContentFilterElement = init(7929);
    public static final NodeId OpcUa_BinarySchema_ContentFilterElement_DataTypeVersion = init(7930);
    public static final NodeId OpcUa_BinarySchema_ContentFilterElement_DictionaryFragment = init(7931);
    public static final NodeId OpcUa_BinarySchema_ContentFilter = init(7932);
    public static final NodeId OpcUa_BinarySchema_ContentFilter_DataTypeVersion = init(7933);
    public static final NodeId OpcUa_BinarySchema_ContentFilter_DictionaryFragment = init(7934);
    public static final NodeId OpcUa_BinarySchema_FilterOperand = init(7935);
    public static final NodeId OpcUa_BinarySchema_FilterOperand_DataTypeVersion = init(7936);
    public static final NodeId OpcUa_BinarySchema_FilterOperand_DictionaryFragment = init(7937);
    public static final NodeId OpcUa_BinarySchema_ElementOperand = init(7938);
    public static final NodeId OpcUa_BinarySchema_ElementOperand_DataTypeVersion = init(7939);
    public static final NodeId OpcUa_BinarySchema_ElementOperand_DictionaryFragment = init(7940);
    public static final NodeId OpcUa_BinarySchema_LiteralOperand = init(7941);
    public static final NodeId OpcUa_BinarySchema_LiteralOperand_DataTypeVersion = init(7942);
    public static final NodeId OpcUa_BinarySchema_LiteralOperand_DictionaryFragment = init(7943);
    public static final NodeId OpcUa_BinarySchema_AttributeOperand = init(7944);
    public static final NodeId OpcUa_BinarySchema_AttributeOperand_DataTypeVersion = init(7945);
    public static final NodeId OpcUa_BinarySchema_AttributeOperand_DictionaryFragment = init(7946);
    public static final NodeId OpcUa_BinarySchema_SimpleAttributeOperand = init(7947);
    public static final NodeId OpcUa_BinarySchema_SimpleAttributeOperand_DataTypeVersion = init(7948);
    public static final NodeId OpcUa_BinarySchema_SimpleAttributeOperand_DictionaryFragment = init(7949);
    public static final NodeId OpcUa_BinarySchema_HistoryEvent = init(8004);
    public static final NodeId OpcUa_BinarySchema_HistoryEvent_DataTypeVersion = init(8005);
    public static final NodeId OpcUa_BinarySchema_HistoryEvent_DictionaryFragment = init(8006);
    public static final NodeId OpcUa_BinarySchema_MonitoringFilter = init(8067);
    public static final NodeId OpcUa_BinarySchema_MonitoringFilter_DataTypeVersion = init(8068);
    public static final NodeId OpcUa_BinarySchema_MonitoringFilter_DictionaryFragment = init(8069);
    public static final NodeId OpcUa_BinarySchema_EventFilter = init(8073);
    public static final NodeId OpcUa_BinarySchema_EventFilter_DataTypeVersion = init(8074);
    public static final NodeId OpcUa_BinarySchema_EventFilter_DictionaryFragment = init(8075);
    public static final NodeId OpcUa_BinarySchema_AggregateConfiguration = init(8076);
    public static final NodeId OpcUa_BinarySchema_AggregateConfiguration_DataTypeVersion = init(8077);
    public static final NodeId OpcUa_BinarySchema_AggregateConfiguration_DictionaryFragment = init(8078);
    public static final NodeId OpcUa_BinarySchema_HistoryEventFieldList = init(8172);
    public static final NodeId OpcUa_BinarySchema_HistoryEventFieldList_DataTypeVersion = init(8173);
    public static final NodeId OpcUa_BinarySchema_HistoryEventFieldList_DictionaryFragment = init(8174);
    public static final NodeId OpcUa_BinarySchema_RedundantServerDataType = init(8208);
    public static final NodeId OpcUa_BinarySchema_RedundantServerDataType_DataTypeVersion = init(8209);
    public static final NodeId OpcUa_BinarySchema_RedundantServerDataType_DictionaryFragment = init(8210);
    public static final NodeId OpcUa_BinarySchema_SamplingIntervalDiagnosticsDataType = init(8211);
    public static final NodeId OpcUa_BinarySchema_SamplingIntervalDiagnosticsDataType_DataTypeVersion = init(8212);
    public static final NodeId OpcUa_BinarySchema_SamplingIntervalDiagnosticsDataType_DictionaryFragment = init(8213);
    public static final NodeId OpcUa_BinarySchema_ServerDiagnosticsSummaryDataType = init(8214);
    public static final NodeId OpcUa_BinarySchema_ServerDiagnosticsSummaryDataType_DataTypeVersion = init(8215);
    public static final NodeId OpcUa_BinarySchema_ServerDiagnosticsSummaryDataType_DictionaryFragment = init(8216);
    public static final NodeId OpcUa_BinarySchema_ServerStatusDataType = init(8217);
    public static final NodeId OpcUa_BinarySchema_ServerStatusDataType_DataTypeVersion = init(8218);
    public static final NodeId OpcUa_BinarySchema_ServerStatusDataType_DictionaryFragment = init(8219);
    public static final NodeId OpcUa_BinarySchema_SessionDiagnosticsDataType = init(8220);
    public static final NodeId OpcUa_BinarySchema_SessionDiagnosticsDataType_DataTypeVersion = init(8221);
    public static final NodeId OpcUa_BinarySchema_SessionDiagnosticsDataType_DictionaryFragment = init(8222);
    public static final NodeId OpcUa_BinarySchema_SessionSecurityDiagnosticsDataType = init(8223);
    public static final NodeId OpcUa_BinarySchema_SessionSecurityDiagnosticsDataType_DataTypeVersion = init(8224);
    public static final NodeId OpcUa_BinarySchema_SessionSecurityDiagnosticsDataType_DictionaryFragment = init(8225);
    public static final NodeId OpcUa_BinarySchema_ServiceCounterDataType = init(8226);
    public static final NodeId OpcUa_BinarySchema_ServiceCounterDataType_DataTypeVersion = init(8227);
    public static final NodeId OpcUa_BinarySchema_ServiceCounterDataType_DictionaryFragment = init(8228);
    public static final NodeId OpcUa_BinarySchema_SubscriptionDiagnosticsDataType = init(8229);
    public static final NodeId OpcUa_BinarySchema_SubscriptionDiagnosticsDataType_DataTypeVersion = init(8230);
    public static final NodeId OpcUa_BinarySchema_SubscriptionDiagnosticsDataType_DictionaryFragment = init(8231);
    public static final NodeId OpcUa_BinarySchema_ModelChangeStructureDataType = init(8232);
    public static final NodeId OpcUa_BinarySchema_ModelChangeStructureDataType_DataTypeVersion = init(8233);
    public static final NodeId OpcUa_BinarySchema_ModelChangeStructureDataType_DictionaryFragment = init(8234);
    public static final NodeId OpcUa_BinarySchema_SemanticChangeStructureDataType = init(8235);
    public static final NodeId OpcUa_BinarySchema_SemanticChangeStructureDataType_DataTypeVersion = init(8236);
    public static final NodeId OpcUa_BinarySchema_SemanticChangeStructureDataType_DictionaryFragment = init(8237);
    public static final NodeId OpcUa_BinarySchema_Range = init(8238);
    public static final NodeId OpcUa_BinarySchema_Range_DataTypeVersion = init(8239);
    public static final NodeId OpcUa_BinarySchema_Range_DictionaryFragment = init(8240);
    public static final NodeId OpcUa_BinarySchema_EUInformation = init(8241);
    public static final NodeId OpcUa_BinarySchema_EUInformation_DataTypeVersion = init(8242);
    public static final NodeId OpcUa_BinarySchema_EUInformation_DictionaryFragment = init(8243);
    public static final NodeId OpcUa_BinarySchema_Annotation = init(8244);
    public static final NodeId OpcUa_BinarySchema_Annotation_DataTypeVersion = init(8245);
    public static final NodeId OpcUa_BinarySchema_Annotation_DictionaryFragment = init(8246);
    public static final NodeId OpcUa_BinarySchema_ProgramDiagnosticDataType = init(8247);
    public static final NodeId OpcUa_BinarySchema_ProgramDiagnosticDataType_DataTypeVersion = init(8248);
    public static final NodeId OpcUa_BinarySchema_ProgramDiagnosticDataType_DictionaryFragment = init(8249);
    public static final NodeId EnumValueType_Encoding_DefaultBinary = init(8251);
    public static final NodeId OpcUa_XmlSchema = init(8252);
    public static final NodeId OpcUa_XmlSchema_DataTypeVersion = init(8253);
    public static final NodeId OpcUa_XmlSchema_NamespaceUri = init(8254);
    public static final NodeId OpcUa_XmlSchema_Argument = init(8285);
    public static final NodeId OpcUa_XmlSchema_Argument_DataTypeVersion = init(8286);
    public static final NodeId OpcUa_XmlSchema_Argument_DictionaryFragment = init(8287);
    public static final NodeId OpcUa_XmlSchema_EnumValueType = init(8291);
    public static final NodeId OpcUa_XmlSchema_EnumValueType_DataTypeVersion = init(8292);
    public static final NodeId OpcUa_XmlSchema_EnumValueType_DictionaryFragment = init(8293);
    public static final NodeId OpcUa_XmlSchema_StatusResult = init(8294);
    public static final NodeId OpcUa_XmlSchema_StatusResult_DataTypeVersion = init(8295);
    public static final NodeId OpcUa_XmlSchema_StatusResult_DictionaryFragment = init(8296);
    public static final NodeId OpcUa_XmlSchema_UserTokenPolicy = init(8297);
    public static final NodeId OpcUa_XmlSchema_UserTokenPolicy_DataTypeVersion = init(8298);
    public static final NodeId OpcUa_XmlSchema_UserTokenPolicy_DictionaryFragment = init(8299);
    public static final NodeId OpcUa_XmlSchema_ApplicationDescription = init(8300);
    public static final NodeId OpcUa_XmlSchema_ApplicationDescription_DataTypeVersion = init(8301);
    public static final NodeId OpcUa_XmlSchema_ApplicationDescription_DictionaryFragment = init(8302);
    public static final NodeId OpcUa_XmlSchema_EndpointDescription = init(8303);
    public static final NodeId OpcUa_XmlSchema_EndpointDescription_DataTypeVersion = init(8304);
    public static final NodeId OpcUa_XmlSchema_EndpointDescription_DictionaryFragment = init(8305);
    public static final NodeId OpcUa_XmlSchema_UserIdentityToken = init(8306);
    public static final NodeId OpcUa_XmlSchema_UserIdentityToken_DataTypeVersion = init(8307);
    public static final NodeId OpcUa_XmlSchema_UserIdentityToken_DictionaryFragment = init(8308);
    public static final NodeId OpcUa_XmlSchema_AnonymousIdentityToken = init(8309);
    public static final NodeId OpcUa_XmlSchema_AnonymousIdentityToken_DataTypeVersion = init(8310);
    public static final NodeId OpcUa_XmlSchema_AnonymousIdentityToken_DictionaryFragment = init(8311);
    public static final NodeId OpcUa_XmlSchema_UserNameIdentityToken = init(8312);
    public static final NodeId OpcUa_XmlSchema_UserNameIdentityToken_DataTypeVersion = init(8313);
    public static final NodeId OpcUa_XmlSchema_UserNameIdentityToken_DictionaryFragment = init(8314);
    public static final NodeId OpcUa_XmlSchema_X509IdentityToken = init(8315);
    public static final NodeId OpcUa_XmlSchema_X509IdentityToken_DataTypeVersion = init(8316);
    public static final NodeId OpcUa_XmlSchema_X509IdentityToken_DictionaryFragment = init(8317);
    public static final NodeId OpcUa_XmlSchema_IssuedIdentityToken = init(8318);
    public static final NodeId OpcUa_XmlSchema_IssuedIdentityToken_DataTypeVersion = init(8319);
    public static final NodeId OpcUa_XmlSchema_IssuedIdentityToken_DictionaryFragment = init(8320);
    public static final NodeId OpcUa_XmlSchema_EndpointConfiguration = init(8321);
    public static final NodeId OpcUa_XmlSchema_EndpointConfiguration_DataTypeVersion = init(8322);
    public static final NodeId OpcUa_XmlSchema_EndpointConfiguration_DictionaryFragment = init(8323);
    public static final NodeId OpcUa_XmlSchema_SupportedProfile = init(8324);
    public static final NodeId OpcUa_XmlSchema_SupportedProfile_DataTypeVersion = init(8325);
    public static final NodeId OpcUa_XmlSchema_SupportedProfile_DictionaryFragment = init(8326);
    public static final NodeId OpcUa_XmlSchema_BuildInfo = init(8327);
    public static final NodeId OpcUa_XmlSchema_BuildInfo_DataTypeVersion = init(8328);
    public static final NodeId OpcUa_XmlSchema_BuildInfo_DictionaryFragment = init(8329);
    public static final NodeId OpcUa_XmlSchema_SoftwareCertificate = init(8330);
    public static final NodeId OpcUa_XmlSchema_SoftwareCertificate_DataTypeVersion = init(8331);
    public static final NodeId OpcUa_XmlSchema_SoftwareCertificate_DictionaryFragment = init(8332);
    public static final NodeId OpcUa_XmlSchema_SignedSoftwareCertificate = init(8333);
    public static final NodeId OpcUa_XmlSchema_SignedSoftwareCertificate_DataTypeVersion = init(8334);
    public static final NodeId OpcUa_XmlSchema_SignedSoftwareCertificate_DictionaryFragment = init(8335);
    public static final NodeId OpcUa_XmlSchema_AddNodesItem = init(8363);
    public static final NodeId OpcUa_XmlSchema_AddNodesItem_DataTypeVersion = init(8364);
    public static final NodeId OpcUa_XmlSchema_AddNodesItem_DictionaryFragment = init(8365);
    public static final NodeId OpcUa_XmlSchema_AddReferencesItem = init(8366);
    public static final NodeId OpcUa_XmlSchema_AddReferencesItem_DataTypeVersion = init(8367);
    public static final NodeId OpcUa_XmlSchema_AddReferencesItem_DictionaryFragment = init(8368);
    public static final NodeId OpcUa_XmlSchema_DeleteNodesItem = init(8369);
    public static final NodeId OpcUa_XmlSchema_DeleteNodesItem_DataTypeVersion = init(8370);
    public static final NodeId OpcUa_XmlSchema_DeleteNodesItem_DictionaryFragment = init(8371);
    public static final NodeId OpcUa_XmlSchema_DeleteReferencesItem = init(8372);
    public static final NodeId OpcUa_XmlSchema_DeleteReferencesItem_DataTypeVersion = init(8373);
    public static final NodeId OpcUa_XmlSchema_DeleteReferencesItem_DictionaryFragment = init(8374);
    public static final NodeId OpcUa_XmlSchema_RegisteredServer = init(8417);
    public static final NodeId OpcUa_XmlSchema_RegisteredServer_DataTypeVersion = init(8418);
    public static final NodeId OpcUa_XmlSchema_RegisteredServer_DictionaryFragment = init(8419);
    public static final NodeId OpcUa_XmlSchema_ContentFilterElement = init(8564);
    public static final NodeId OpcUa_XmlSchema_ContentFilterElement_DataTypeVersion = init(8565);
    public static final NodeId OpcUa_XmlSchema_ContentFilterElement_DictionaryFragment = init(8566);
    public static final NodeId OpcUa_XmlSchema_ContentFilter = init(8567);
    public static final NodeId OpcUa_XmlSchema_ContentFilter_DataTypeVersion = init(8568);
    public static final NodeId OpcUa_XmlSchema_ContentFilter_DictionaryFragment = init(8569);
    public static final NodeId OpcUa_XmlSchema_FilterOperand = init(8570);
    public static final NodeId OpcUa_XmlSchema_FilterOperand_DataTypeVersion = init(8571);
    public static final NodeId OpcUa_XmlSchema_FilterOperand_DictionaryFragment = init(8572);
    public static final NodeId OpcUa_XmlSchema_ElementOperand = init(8573);
    public static final NodeId OpcUa_XmlSchema_ElementOperand_DataTypeVersion = init(8574);
    public static final NodeId OpcUa_XmlSchema_ElementOperand_DictionaryFragment = init(8575);
    public static final NodeId OpcUa_XmlSchema_LiteralOperand = init(8576);
    public static final NodeId OpcUa_XmlSchema_LiteralOperand_DataTypeVersion = init(8577);
    public static final NodeId OpcUa_XmlSchema_LiteralOperand_DictionaryFragment = init(8578);
    public static final NodeId OpcUa_XmlSchema_AttributeOperand = init(8579);
    public static final NodeId OpcUa_XmlSchema_AttributeOperand_DataTypeVersion = init(8580);
    public static final NodeId OpcUa_XmlSchema_AttributeOperand_DictionaryFragment = init(8581);
    public static final NodeId OpcUa_XmlSchema_SimpleAttributeOperand = init(8582);
    public static final NodeId OpcUa_XmlSchema_SimpleAttributeOperand_DataTypeVersion = init(8583);
    public static final NodeId OpcUa_XmlSchema_SimpleAttributeOperand_DictionaryFragment = init(8584);
    public static final NodeId OpcUa_XmlSchema_HistoryEvent = init(8639);
    public static final NodeId OpcUa_XmlSchema_HistoryEvent_DataTypeVersion = init(8640);
    public static final NodeId OpcUa_XmlSchema_HistoryEvent_DictionaryFragment = init(8641);
    public static final NodeId OpcUa_XmlSchema_MonitoringFilter = init(8702);
    public static final NodeId OpcUa_XmlSchema_MonitoringFilter_DataTypeVersion = init(8703);
    public static final NodeId OpcUa_XmlSchema_MonitoringFilter_DictionaryFragment = init(8704);
    public static final NodeId OpcUa_XmlSchema_EventFilter = init(8708);
    public static final NodeId OpcUa_XmlSchema_EventFilter_DataTypeVersion = init(8709);
    public static final NodeId OpcUa_XmlSchema_EventFilter_DictionaryFragment = init(8710);
    public static final NodeId OpcUa_XmlSchema_AggregateConfiguration = init(8711);
    public static final NodeId OpcUa_XmlSchema_AggregateConfiguration_DataTypeVersion = init(8712);
    public static final NodeId OpcUa_XmlSchema_AggregateConfiguration_DictionaryFragment = init(8713);
    public static final NodeId OpcUa_XmlSchema_HistoryEventFieldList = init(8807);
    public static final NodeId OpcUa_XmlSchema_HistoryEventFieldList_DataTypeVersion = init(8808);
    public static final NodeId OpcUa_XmlSchema_HistoryEventFieldList_DictionaryFragment = init(8809);
    public static final NodeId OpcUa_XmlSchema_RedundantServerDataType = init(8843);
    public static final NodeId OpcUa_XmlSchema_RedundantServerDataType_DataTypeVersion = init(8844);
    public static final NodeId OpcUa_XmlSchema_RedundantServerDataType_DictionaryFragment = init(8845);
    public static final NodeId OpcUa_XmlSchema_SamplingIntervalDiagnosticsDataType = init(8846);
    public static final NodeId OpcUa_XmlSchema_SamplingIntervalDiagnosticsDataType_DataTypeVersion = init(8847);
    public static final NodeId OpcUa_XmlSchema_SamplingIntervalDiagnosticsDataType_DictionaryFragment = init(8848);
    public static final NodeId OpcUa_XmlSchema_ServerDiagnosticsSummaryDataType = init(8849);
    public static final NodeId OpcUa_XmlSchema_ServerDiagnosticsSummaryDataType_DataTypeVersion = init(8850);
    public static final NodeId OpcUa_XmlSchema_ServerDiagnosticsSummaryDataType_DictionaryFragment = init(8851);
    public static final NodeId OpcUa_XmlSchema_ServerStatusDataType = init(8852);
    public static final NodeId OpcUa_XmlSchema_ServerStatusDataType_DataTypeVersion = init(8853);
    public static final NodeId OpcUa_XmlSchema_ServerStatusDataType_DictionaryFragment = init(8854);
    public static final NodeId OpcUa_XmlSchema_SessionDiagnosticsDataType = init(8855);
    public static final NodeId OpcUa_XmlSchema_SessionDiagnosticsDataType_DataTypeVersion = init(8856);
    public static final NodeId OpcUa_XmlSchema_SessionDiagnosticsDataType_DictionaryFragment = init(8857);
    public static final NodeId OpcUa_XmlSchema_SessionSecurityDiagnosticsDataType = init(8858);
    public static final NodeId OpcUa_XmlSchema_SessionSecurityDiagnosticsDataType_DataTypeVersion = init(8859);
    public static final NodeId OpcUa_XmlSchema_SessionSecurityDiagnosticsDataType_DictionaryFragment = init(8860);
    public static final NodeId OpcUa_XmlSchema_ServiceCounterDataType = init(8861);
    public static final NodeId OpcUa_XmlSchema_ServiceCounterDataType_DataTypeVersion = init(8862);
    public static final NodeId OpcUa_XmlSchema_ServiceCounterDataType_DictionaryFragment = init(8863);
    public static final NodeId OpcUa_XmlSchema_SubscriptionDiagnosticsDataType = init(8864);
    public static final NodeId OpcUa_XmlSchema_SubscriptionDiagnosticsDataType_DataTypeVersion = init(8865);
    public static final NodeId OpcUa_XmlSchema_SubscriptionDiagnosticsDataType_DictionaryFragment = init(8866);
    public static final NodeId OpcUa_XmlSchema_ModelChangeStructureDataType = init(8867);
    public static final NodeId OpcUa_XmlSchema_ModelChangeStructureDataType_DataTypeVersion = init(8868);
    public static final NodeId OpcUa_XmlSchema_ModelChangeStructureDataType_DictionaryFragment = init(8869);
    public static final NodeId OpcUa_XmlSchema_SemanticChangeStructureDataType = init(8870);
    public static final NodeId OpcUa_XmlSchema_SemanticChangeStructureDataType_DataTypeVersion = init(8871);
    public static final NodeId OpcUa_XmlSchema_SemanticChangeStructureDataType_DictionaryFragment = init(8872);
    public static final NodeId OpcUa_XmlSchema_Range = init(8873);
    public static final NodeId OpcUa_XmlSchema_Range_DataTypeVersion = init(8874);
    public static final NodeId OpcUa_XmlSchema_Range_DictionaryFragment = init(8875);
    public static final NodeId OpcUa_XmlSchema_EUInformation = init(8876);
    public static final NodeId OpcUa_XmlSchema_EUInformation_DataTypeVersion = init(8877);
    public static final NodeId OpcUa_XmlSchema_EUInformation_DictionaryFragment = init(8878);
    public static final NodeId OpcUa_XmlSchema_Annotation = init(8879);
    public static final NodeId OpcUa_XmlSchema_Annotation_DataTypeVersion = init(8880);
    public static final NodeId OpcUa_XmlSchema_Annotation_DictionaryFragment = init(8881);
    public static final NodeId OpcUa_XmlSchema_ProgramDiagnosticDataType = init(8882);
    public static final NodeId OpcUa_XmlSchema_ProgramDiagnosticDataType_DataTypeVersion = init(8883);
    public static final NodeId OpcUa_XmlSchema_ProgramDiagnosticDataType_DictionaryFragment = init(8884);
    public static final NodeId SubscriptionDiagnosticsType_MaxLifetimeCount = init(8888);
    public static final NodeId SubscriptionDiagnosticsType_LatePublishRequestCount = init(8889);
    public static final NodeId SubscriptionDiagnosticsType_CurrentKeepAliveCount = init(8890);
    public static final NodeId SubscriptionDiagnosticsType_CurrentLifetimeCount = init(8891);
    public static final NodeId SubscriptionDiagnosticsType_UnacknowledgedMessageCount = init(8892);
    public static final NodeId SubscriptionDiagnosticsType_DiscardedMessageCount = init(8893);
    public static final NodeId SubscriptionDiagnosticsType_MonitoredItemCount = init(8894);
    public static final NodeId SubscriptionDiagnosticsType_DisabledMonitoredItemCount = init(8895);
    public static final NodeId SubscriptionDiagnosticsType_MonitoringQueueOverflowCount = init(8896);
    public static final NodeId SubscriptionDiagnosticsType_NextSequenceNumber = init(8897);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_TotalRequestCount = init(8898);
    public static final NodeId SessionDiagnosticsVariableType_TotalRequestCount = init(8900);
    public static final NodeId SubscriptionDiagnosticsType_EventQueueOverFlowCount = init(8902);
    public static final NodeId TimeZoneDataType = init(8912);
    public static final NodeId TimeZoneDataType_Encoding_DefaultXml = init(8913);
    public static final NodeId OpcUa_BinarySchema_TimeZoneDataType = init(8914);
    public static final NodeId OpcUa_BinarySchema_TimeZoneDataType_DataTypeVersion = init(8915);
    public static final NodeId OpcUa_BinarySchema_TimeZoneDataType_DictionaryFragment = init(8916);
    public static final NodeId TimeZoneDataType_Encoding_DefaultBinary = init(8917);
    public static final NodeId OpcUa_XmlSchema_TimeZoneDataType = init(8918);
    public static final NodeId OpcUa_XmlSchema_TimeZoneDataType_DataTypeVersion = init(8919);
    public static final NodeId OpcUa_XmlSchema_TimeZoneDataType_DictionaryFragment = init(8920);
    public static final NodeId AuditConditionRespondEventType = init(8927);
    public static final NodeId AuditConditionRespondEventType_EventId = init(8928);
    public static final NodeId AuditConditionRespondEventType_EventType = init(8929);
    public static final NodeId AuditConditionRespondEventType_SourceNode = init(8930);
    public static final NodeId AuditConditionRespondEventType_SourceName = init(8931);
    public static final NodeId AuditConditionRespondEventType_Time = init(8932);
    public static final NodeId AuditConditionRespondEventType_ReceiveTime = init(8933);
    public static final NodeId AuditConditionRespondEventType_LocalTime = init(8934);
    public static final NodeId AuditConditionRespondEventType_Message = init(8935);
    public static final NodeId AuditConditionRespondEventType_Severity = init(8936);
    public static final NodeId AuditConditionRespondEventType_ActionTimeStamp = init(8937);
    public static final NodeId AuditConditionRespondEventType_Status = init(8938);
    public static final NodeId AuditConditionRespondEventType_ServerId = init(8939);
    public static final NodeId AuditConditionRespondEventType_ClientAuditEntryId = init(8940);
    public static final NodeId AuditConditionRespondEventType_ClientUserId = init(8941);
    public static final NodeId AuditConditionRespondEventType_MethodId = init(8942);
    public static final NodeId AuditConditionRespondEventType_InputArguments = init(8943);
    public static final NodeId AuditConditionAcknowledgeEventType = init(8944);
    public static final NodeId AuditConditionAcknowledgeEventType_EventId = init(8945);
    public static final NodeId AuditConditionAcknowledgeEventType_EventType = init(8946);
    public static final NodeId AuditConditionAcknowledgeEventType_SourceNode = init(8947);
    public static final NodeId AuditConditionAcknowledgeEventType_SourceName = init(8948);
    public static final NodeId AuditConditionAcknowledgeEventType_Time = init(8949);
    public static final NodeId AuditConditionAcknowledgeEventType_ReceiveTime = init(8950);
    public static final NodeId AuditConditionAcknowledgeEventType_LocalTime = init(8951);
    public static final NodeId AuditConditionAcknowledgeEventType_Message = init(8952);
    public static final NodeId AuditConditionAcknowledgeEventType_Severity = init(8953);
    public static final NodeId AuditConditionAcknowledgeEventType_ActionTimeStamp = init(8954);
    public static final NodeId AuditConditionAcknowledgeEventType_Status = init(8955);
    public static final NodeId AuditConditionAcknowledgeEventType_ServerId = init(8956);
    public static final NodeId AuditConditionAcknowledgeEventType_ClientAuditEntryId = init(8957);
    public static final NodeId AuditConditionAcknowledgeEventType_ClientUserId = init(8958);
    public static final NodeId AuditConditionAcknowledgeEventType_MethodId = init(8959);
    public static final NodeId AuditConditionAcknowledgeEventType_InputArguments = init(8960);
    public static final NodeId AuditConditionConfirmEventType = init(8961);
    public static final NodeId AuditConditionConfirmEventType_EventId = init(8962);
    public static final NodeId AuditConditionConfirmEventType_EventType = init(8963);
    public static final NodeId AuditConditionConfirmEventType_SourceNode = init(8964);
    public static final NodeId AuditConditionConfirmEventType_SourceName = init(8965);
    public static final NodeId AuditConditionConfirmEventType_Time = init(8966);
    public static final NodeId AuditConditionConfirmEventType_ReceiveTime = init(8967);
    public static final NodeId AuditConditionConfirmEventType_LocalTime = init(8968);
    public static final NodeId AuditConditionConfirmEventType_Message = init(8969);
    public static final NodeId AuditConditionConfirmEventType_Severity = init(8970);
    public static final NodeId AuditConditionConfirmEventType_ActionTimeStamp = init(8971);
    public static final NodeId AuditConditionConfirmEventType_Status = init(8972);
    public static final NodeId AuditConditionConfirmEventType_ServerId = init(8973);
    public static final NodeId AuditConditionConfirmEventType_ClientAuditEntryId = init(8974);
    public static final NodeId AuditConditionConfirmEventType_ClientUserId = init(8975);
    public static final NodeId AuditConditionConfirmEventType_MethodId = init(8976);
    public static final NodeId AuditConditionConfirmEventType_InputArguments = init(8977);
    public static final NodeId TwoStateVariableType = init(8995);
    public static final NodeId TwoStateVariableType_Id = init(8996);
    public static final NodeId TwoStateVariableType_Name = init(8997);
    public static final NodeId TwoStateVariableType_Number = init(8998);
    public static final NodeId TwoStateVariableType_EffectiveDisplayName = init(8999);
    public static final NodeId TwoStateVariableType_TransitionTime = init(9000);
    public static final NodeId TwoStateVariableType_EffectiveTransitionTime = init(9001);
    public static final NodeId ConditionVariableType = init(9002);
    public static final NodeId ConditionVariableType_SourceTimestamp = init(9003);
    public static final NodeId HasTrueSubState = init(9004);
    public static final NodeId HasFalseSubState = init(9005);
    public static final NodeId HasCondition = init(9006);
    public static final NodeId ConditionRefreshMethodType = init(9007);
    public static final NodeId ConditionRefreshMethodType_InputArguments = init(9008);
    public static final NodeId ConditionType_ConditionName = init(9009);
    public static final NodeId ConditionType_BranchId = init(9010);
    public static final NodeId ConditionType_EnabledState = init(9011);
    public static final NodeId ConditionType_EnabledState_Id = init(9012);
    public static final NodeId ConditionType_EnabledState_Name = init(9013);
    public static final NodeId ConditionType_EnabledState_Number = init(9014);
    public static final NodeId ConditionType_EnabledState_EffectiveDisplayName = init(9015);
    public static final NodeId ConditionType_EnabledState_TransitionTime = init(9016);
    public static final NodeId ConditionType_EnabledState_EffectiveTransitionTime = init(9017);
    public static final NodeId ConditionType_EnabledState_TrueState = init(9018);
    public static final NodeId ConditionType_EnabledState_FalseState = init(9019);
    public static final NodeId ConditionType_Quality = init(9020);
    public static final NodeId ConditionType_Quality_SourceTimestamp = init(9021);
    public static final NodeId ConditionType_LastSeverity = init(9022);
    public static final NodeId ConditionType_LastSeverity_SourceTimestamp = init(9023);
    public static final NodeId ConditionType_Comment = init(9024);
    public static final NodeId ConditionType_Comment_SourceTimestamp = init(9025);
    public static final NodeId ConditionType_ClientUserId = init(9026);
    public static final NodeId ConditionType_Enable = init(9027);
    public static final NodeId ConditionType_Disable = init(9028);
    public static final NodeId ConditionType_AddComment = init(9029);
    public static final NodeId ConditionType_AddComment_InputArguments = init(9030);
    public static final NodeId DialogResponseMethodType = init(9031);
    public static final NodeId DialogResponseMethodType_InputArguments = init(9032);
    public static final NodeId DialogConditionType_ConditionName = init(9033);
    public static final NodeId DialogConditionType_BranchId = init(9034);
    public static final NodeId DialogConditionType_EnabledState = init(9035);
    public static final NodeId DialogConditionType_EnabledState_Id = init(9036);
    public static final NodeId DialogConditionType_EnabledState_Name = init(9037);
    public static final NodeId DialogConditionType_EnabledState_Number = init(9038);
    public static final NodeId DialogConditionType_EnabledState_EffectiveDisplayName = init(9039);
    public static final NodeId DialogConditionType_EnabledState_TransitionTime = init(9040);
    public static final NodeId DialogConditionType_EnabledState_EffectiveTransitionTime = init(9041);
    public static final NodeId DialogConditionType_EnabledState_TrueState = init(9042);
    public static final NodeId DialogConditionType_EnabledState_FalseState = init(9043);
    public static final NodeId DialogConditionType_Quality = init(9044);
    public static final NodeId DialogConditionType_Quality_SourceTimestamp = init(9045);
    public static final NodeId DialogConditionType_LastSeverity = init(9046);
    public static final NodeId DialogConditionType_LastSeverity_SourceTimestamp = init(9047);
    public static final NodeId DialogConditionType_Comment = init(9048);
    public static final NodeId DialogConditionType_Comment_SourceTimestamp = init(9049);
    public static final NodeId DialogConditionType_ClientUserId = init(9050);
    public static final NodeId DialogConditionType_Enable = init(9051);
    public static final NodeId DialogConditionType_Disable = init(9052);
    public static final NodeId DialogConditionType_AddComment = init(9053);
    public static final NodeId DialogConditionType_AddComment_InputArguments = init(9054);
    public static final NodeId DialogConditionType_DialogState = init(9055);
    public static final NodeId DialogConditionType_DialogState_Id = init(9056);
    public static final NodeId DialogConditionType_DialogState_Name = init(9057);
    public static final NodeId DialogConditionType_DialogState_Number = init(9058);
    public static final NodeId DialogConditionType_DialogState_EffectiveDisplayName = init(9059);
    public static final NodeId DialogConditionType_DialogState_TransitionTime = init(9060);
    public static final NodeId DialogConditionType_DialogState_EffectiveTransitionTime = init(9061);
    public static final NodeId DialogConditionType_DialogState_TrueState = init(9062);
    public static final NodeId DialogConditionType_DialogState_FalseState = init(9063);
    public static final NodeId DialogConditionType_ResponseOptionSet = init(9064);
    public static final NodeId DialogConditionType_DefaultResponse = init(9065);
    public static final NodeId DialogConditionType_OkResponse = init(9066);
    public static final NodeId DialogConditionType_CancelResponse = init(9067);
    public static final NodeId DialogConditionType_LastResponse = init(9068);
    public static final NodeId DialogConditionType_Respond = init(9069);
    public static final NodeId DialogConditionType_Respond_InputArguments = init(9070);
    public static final NodeId AcknowledgeableConditionType_ConditionName = init(9071);
    public static final NodeId AcknowledgeableConditionType_BranchId = init(9072);
    public static final NodeId AcknowledgeableConditionType_EnabledState = init(9073);
    public static final NodeId AcknowledgeableConditionType_EnabledState_Id = init(9074);
    public static final NodeId AcknowledgeableConditionType_EnabledState_Name = init(9075);
    public static final NodeId AcknowledgeableConditionType_EnabledState_Number = init(9076);
    public static final NodeId AcknowledgeableConditionType_EnabledState_EffectiveDisplayName = init(9077);
    public static final NodeId AcknowledgeableConditionType_EnabledState_TransitionTime = init(9078);
    public static final NodeId AcknowledgeableConditionType_EnabledState_EffectiveTransitionTime = init(9079);
    public static final NodeId AcknowledgeableConditionType_EnabledState_TrueState = init(9080);
    public static final NodeId AcknowledgeableConditionType_EnabledState_FalseState = init(9081);
    public static final NodeId AcknowledgeableConditionType_Quality = init(9082);
    public static final NodeId AcknowledgeableConditionType_Quality_SourceTimestamp = init(9083);
    public static final NodeId AcknowledgeableConditionType_LastSeverity = init(9084);
    public static final NodeId AcknowledgeableConditionType_LastSeverity_SourceTimestamp = init(9085);
    public static final NodeId AcknowledgeableConditionType_Comment = init(9086);
    public static final NodeId AcknowledgeableConditionType_Comment_SourceTimestamp = init(9087);
    public static final NodeId AcknowledgeableConditionType_ClientUserId = init(9088);
    public static final NodeId AcknowledgeableConditionType_Enable = init(9089);
    public static final NodeId AcknowledgeableConditionType_Disable = init(9090);
    public static final NodeId AcknowledgeableConditionType_AddComment = init(9091);
    public static final NodeId AcknowledgeableConditionType_AddComment_InputArguments = init(9092);
    public static final NodeId AcknowledgeableConditionType_AckedState = init(9093);
    public static final NodeId AcknowledgeableConditionType_AckedState_Id = init(9094);
    public static final NodeId AcknowledgeableConditionType_AckedState_Name = init(9095);
    public static final NodeId AcknowledgeableConditionType_AckedState_Number = init(9096);
    public static final NodeId AcknowledgeableConditionType_AckedState_EffectiveDisplayName = init(9097);
    public static final NodeId AcknowledgeableConditionType_AckedState_TransitionTime = init(9098);
    public static final NodeId AcknowledgeableConditionType_AckedState_EffectiveTransitionTime = init(9099);
    public static final NodeId AcknowledgeableConditionType_AckedState_TrueState = init(9100);
    public static final NodeId AcknowledgeableConditionType_AckedState_FalseState = init(9101);
    public static final NodeId AcknowledgeableConditionType_ConfirmedState = init(9102);
    public static final NodeId AcknowledgeableConditionType_ConfirmedState_Id = init(9103);
    public static final NodeId AcknowledgeableConditionType_ConfirmedState_Name = init(9104);
    public static final NodeId AcknowledgeableConditionType_ConfirmedState_Number = init(9105);
    public static final NodeId AcknowledgeableConditionType_ConfirmedState_EffectiveDisplayName = init(9106);
    public static final NodeId AcknowledgeableConditionType_ConfirmedState_TransitionTime = init(9107);
    public static final NodeId AcknowledgeableConditionType_ConfirmedState_EffectiveTransitionTime = init(9108);
    public static final NodeId AcknowledgeableConditionType_ConfirmedState_TrueState = init(9109);
    public static final NodeId AcknowledgeableConditionType_ConfirmedState_FalseState = init(9110);
    public static final NodeId AcknowledgeableConditionType_Acknowledge = init(9111);
    public static final NodeId AcknowledgeableConditionType_Acknowledge_InputArguments = init(9112);
    public static final NodeId AcknowledgeableConditionType_Confirm = init(9113);
    public static final NodeId AcknowledgeableConditionType_Confirm_InputArguments = init(9114);
    public static final NodeId ShelvedStateMachineType_UnshelveTime = init(9115);
    public static final NodeId AlarmConditionType_ConditionName = init(9116);
    public static final NodeId AlarmConditionType_BranchId = init(9117);
    public static final NodeId AlarmConditionType_EnabledState = init(9118);
    public static final NodeId AlarmConditionType_EnabledState_Id = init(9119);
    public static final NodeId AlarmConditionType_EnabledState_Name = init(9120);
    public static final NodeId AlarmConditionType_EnabledState_Number = init(9121);
    public static final NodeId AlarmConditionType_EnabledState_EffectiveDisplayName = init(9122);
    public static final NodeId AlarmConditionType_EnabledState_TransitionTime = init(9123);
    public static final NodeId AlarmConditionType_EnabledState_EffectiveTransitionTime = init(9124);
    public static final NodeId AlarmConditionType_EnabledState_TrueState = init(9125);
    public static final NodeId AlarmConditionType_EnabledState_FalseState = init(9126);
    public static final NodeId AlarmConditionType_Quality = init(9127);
    public static final NodeId AlarmConditionType_Quality_SourceTimestamp = init(9128);
    public static final NodeId AlarmConditionType_LastSeverity = init(9129);
    public static final NodeId AlarmConditionType_LastSeverity_SourceTimestamp = init(9130);
    public static final NodeId AlarmConditionType_Comment = init(9131);
    public static final NodeId AlarmConditionType_Comment_SourceTimestamp = init(9132);
    public static final NodeId AlarmConditionType_ClientUserId = init(9133);
    public static final NodeId AlarmConditionType_Enable = init(9134);
    public static final NodeId AlarmConditionType_Disable = init(9135);
    public static final NodeId AlarmConditionType_AddComment = init(9136);
    public static final NodeId AlarmConditionType_AddComment_InputArguments = init(9137);
    public static final NodeId AlarmConditionType_AckedState = init(9138);
    public static final NodeId AlarmConditionType_AckedState_Id = init(9139);
    public static final NodeId AlarmConditionType_AckedState_Name = init(9140);
    public static final NodeId AlarmConditionType_AckedState_Number = init(9141);
    public static final NodeId AlarmConditionType_AckedState_EffectiveDisplayName = init(9142);
    public static final NodeId AlarmConditionType_AckedState_TransitionTime = init(9143);
    public static final NodeId AlarmConditionType_AckedState_EffectiveTransitionTime = init(9144);
    public static final NodeId AlarmConditionType_AckedState_TrueState = init(9145);
    public static final NodeId AlarmConditionType_AckedState_FalseState = init(9146);
    public static final NodeId AlarmConditionType_ConfirmedState = init(9147);
    public static final NodeId AlarmConditionType_ConfirmedState_Id = init(9148);
    public static final NodeId AlarmConditionType_ConfirmedState_Name = init(9149);
    public static final NodeId AlarmConditionType_ConfirmedState_Number = init(9150);
    public static final NodeId AlarmConditionType_ConfirmedState_EffectiveDisplayName = init(9151);
    public static final NodeId AlarmConditionType_ConfirmedState_TransitionTime = init(9152);
    public static final NodeId AlarmConditionType_ConfirmedState_EffectiveTransitionTime = init(9153);
    public static final NodeId AlarmConditionType_ConfirmedState_TrueState = init(9154);
    public static final NodeId AlarmConditionType_ConfirmedState_FalseState = init(9155);
    public static final NodeId AlarmConditionType_Acknowledge = init(9156);
    public static final NodeId AlarmConditionType_Acknowledge_InputArguments = init(9157);
    public static final NodeId AlarmConditionType_Confirm = init(9158);
    public static final NodeId AlarmConditionType_Confirm_InputArguments = init(9159);
    public static final NodeId AlarmConditionType_ActiveState = init(9160);
    public static final NodeId AlarmConditionType_ActiveState_Id = init(9161);
    public static final NodeId AlarmConditionType_ActiveState_Name = init(9162);
    public static final NodeId AlarmConditionType_ActiveState_Number = init(9163);
    public static final NodeId AlarmConditionType_ActiveState_EffectiveDisplayName = init(9164);
    public static final NodeId AlarmConditionType_ActiveState_TransitionTime = init(9165);
    public static final NodeId AlarmConditionType_ActiveState_EffectiveTransitionTime = init(9166);
    public static final NodeId AlarmConditionType_ActiveState_TrueState = init(9167);
    public static final NodeId AlarmConditionType_ActiveState_FalseState = init(9168);
    public static final NodeId AlarmConditionType_SuppressedState = init(9169);
    public static final NodeId AlarmConditionType_SuppressedState_Id = init(9170);
    public static final NodeId AlarmConditionType_SuppressedState_Name = init(9171);
    public static final NodeId AlarmConditionType_SuppressedState_Number = init(9172);
    public static final NodeId AlarmConditionType_SuppressedState_EffectiveDisplayName = init(9173);
    public static final NodeId AlarmConditionType_SuppressedState_TransitionTime = init(9174);
    public static final NodeId AlarmConditionType_SuppressedState_EffectiveTransitionTime = init(9175);
    public static final NodeId AlarmConditionType_SuppressedState_TrueState = init(9176);
    public static final NodeId AlarmConditionType_SuppressedState_FalseState = init(9177);
    public static final NodeId AlarmConditionType_ShelvingState = init(9178);
    public static final NodeId AlarmConditionType_ShelvingState_CurrentState = init(9179);
    public static final NodeId AlarmConditionType_ShelvingState_CurrentState_Id = init(9180);
    public static final NodeId AlarmConditionType_ShelvingState_CurrentState_Name = init(9181);
    public static final NodeId AlarmConditionType_ShelvingState_CurrentState_Number = init(9182);
    public static final NodeId AlarmConditionType_ShelvingState_CurrentState_EffectiveDisplayName = init(9183);
    public static final NodeId AlarmConditionType_ShelvingState_LastTransition = init(9184);
    public static final NodeId AlarmConditionType_ShelvingState_LastTransition_Id = init(9185);
    public static final NodeId AlarmConditionType_ShelvingState_LastTransition_Name = init(9186);
    public static final NodeId AlarmConditionType_ShelvingState_LastTransition_Number = init(9187);
    public static final NodeId AlarmConditionType_ShelvingState_LastTransition_TransitionTime = init(9188);
    public static final NodeId AlarmConditionType_ShelvingState_UnshelveTime = init(9189);
    public static final NodeId AlarmConditionType_ShelvingState_Unshelve = init(9211);
    public static final NodeId AlarmConditionType_ShelvingState_OneShotShelve = init(9212);
    public static final NodeId AlarmConditionType_ShelvingState_TimedShelve = init(9213);
    public static final NodeId AlarmConditionType_ShelvingState_TimedShelve_InputArguments = init(9214);
    public static final NodeId AlarmConditionType_SuppressedOrShelved = init(9215);
    public static final NodeId AlarmConditionType_MaxTimeShelved = init(9216);
    public static final NodeId LimitAlarmType_ConditionName = init(9217);
    public static final NodeId LimitAlarmType_BranchId = init(9218);
    public static final NodeId LimitAlarmType_EnabledState = init(9219);
    public static final NodeId LimitAlarmType_EnabledState_Id = init(9220);
    public static final NodeId LimitAlarmType_EnabledState_Name = init(9221);
    public static final NodeId LimitAlarmType_EnabledState_Number = init(9222);
    public static final NodeId LimitAlarmType_EnabledState_EffectiveDisplayName = init(9223);
    public static final NodeId LimitAlarmType_EnabledState_TransitionTime = init(9224);
    public static final NodeId LimitAlarmType_EnabledState_EffectiveTransitionTime = init(9225);
    public static final NodeId LimitAlarmType_EnabledState_TrueState = init(9226);
    public static final NodeId LimitAlarmType_EnabledState_FalseState = init(9227);
    public static final NodeId LimitAlarmType_Quality = init(9228);
    public static final NodeId LimitAlarmType_Quality_SourceTimestamp = init(9229);
    public static final NodeId LimitAlarmType_LastSeverity = init(9230);
    public static final NodeId LimitAlarmType_LastSeverity_SourceTimestamp = init(9231);
    public static final NodeId LimitAlarmType_Comment = init(9232);
    public static final NodeId LimitAlarmType_Comment_SourceTimestamp = init(9233);
    public static final NodeId LimitAlarmType_ClientUserId = init(9234);
    public static final NodeId LimitAlarmType_Enable = init(9235);
    public static final NodeId LimitAlarmType_Disable = init(9236);
    public static final NodeId LimitAlarmType_AddComment = init(9237);
    public static final NodeId LimitAlarmType_AddComment_InputArguments = init(9238);
    public static final NodeId LimitAlarmType_AckedState = init(9239);
    public static final NodeId LimitAlarmType_AckedState_Id = init(9240);
    public static final NodeId LimitAlarmType_AckedState_Name = init(9241);
    public static final NodeId LimitAlarmType_AckedState_Number = init(9242);
    public static final NodeId LimitAlarmType_AckedState_EffectiveDisplayName = init(9243);
    public static final NodeId LimitAlarmType_AckedState_TransitionTime = init(9244);
    public static final NodeId LimitAlarmType_AckedState_EffectiveTransitionTime = init(9245);
    public static final NodeId LimitAlarmType_AckedState_TrueState = init(9246);
    public static final NodeId LimitAlarmType_AckedState_FalseState = init(9247);
    public static final NodeId LimitAlarmType_ConfirmedState = init(9248);
    public static final NodeId LimitAlarmType_ConfirmedState_Id = init(9249);
    public static final NodeId LimitAlarmType_ConfirmedState_Name = init(9250);
    public static final NodeId LimitAlarmType_ConfirmedState_Number = init(9251);
    public static final NodeId LimitAlarmType_ConfirmedState_EffectiveDisplayName = init(9252);
    public static final NodeId LimitAlarmType_ConfirmedState_TransitionTime = init(9253);
    public static final NodeId LimitAlarmType_ConfirmedState_EffectiveTransitionTime = init(9254);
    public static final NodeId LimitAlarmType_ConfirmedState_TrueState = init(9255);
    public static final NodeId LimitAlarmType_ConfirmedState_FalseState = init(9256);
    public static final NodeId LimitAlarmType_Acknowledge = init(9257);
    public static final NodeId LimitAlarmType_Acknowledge_InputArguments = init(9258);
    public static final NodeId LimitAlarmType_Confirm = init(9259);
    public static final NodeId LimitAlarmType_Confirm_InputArguments = init(9260);
    public static final NodeId LimitAlarmType_ActiveState = init(9261);
    public static final NodeId LimitAlarmType_ActiveState_Id = init(9262);
    public static final NodeId LimitAlarmType_ActiveState_Name = init(9263);
    public static final NodeId LimitAlarmType_ActiveState_Number = init(9264);
    public static final NodeId LimitAlarmType_ActiveState_EffectiveDisplayName = init(9265);
    public static final NodeId LimitAlarmType_ActiveState_TransitionTime = init(9266);
    public static final NodeId LimitAlarmType_ActiveState_EffectiveTransitionTime = init(9267);
    public static final NodeId LimitAlarmType_ActiveState_TrueState = init(9268);
    public static final NodeId LimitAlarmType_ActiveState_FalseState = init(9269);
    public static final NodeId LimitAlarmType_SuppressedState = init(9270);
    public static final NodeId LimitAlarmType_SuppressedState_Id = init(9271);
    public static final NodeId LimitAlarmType_SuppressedState_Name = init(9272);
    public static final NodeId LimitAlarmType_SuppressedState_Number = init(9273);
    public static final NodeId LimitAlarmType_SuppressedState_EffectiveDisplayName = init(9274);
    public static final NodeId LimitAlarmType_SuppressedState_TransitionTime = init(9275);
    public static final NodeId LimitAlarmType_SuppressedState_EffectiveTransitionTime = init(9276);
    public static final NodeId LimitAlarmType_SuppressedState_TrueState = init(9277);
    public static final NodeId LimitAlarmType_SuppressedState_FalseState = init(9278);
    public static final NodeId LimitAlarmType_ShelvingState = init(9279);
    public static final NodeId LimitAlarmType_ShelvingState_CurrentState = init(9280);
    public static final NodeId LimitAlarmType_ShelvingState_CurrentState_Id = init(9281);
    public static final NodeId LimitAlarmType_ShelvingState_CurrentState_Name = init(9282);
    public static final NodeId LimitAlarmType_ShelvingState_CurrentState_Number = init(9283);
    public static final NodeId LimitAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(9284);
    public static final NodeId LimitAlarmType_ShelvingState_LastTransition = init(9285);
    public static final NodeId LimitAlarmType_ShelvingState_LastTransition_Id = init(9286);
    public static final NodeId LimitAlarmType_ShelvingState_LastTransition_Name = init(9287);
    public static final NodeId LimitAlarmType_ShelvingState_LastTransition_Number = init(9288);
    public static final NodeId LimitAlarmType_ShelvingState_LastTransition_TransitionTime = init(9289);
    public static final NodeId LimitAlarmType_ShelvingState_UnshelveTime = init(9290);
    public static final NodeId LimitAlarmType_ShelvingState_Unshelve = init(9312);
    public static final NodeId LimitAlarmType_ShelvingState_OneShotShelve = init(9313);
    public static final NodeId LimitAlarmType_ShelvingState_TimedShelve = init(9314);
    public static final NodeId LimitAlarmType_ShelvingState_TimedShelve_InputArguments = init(9315);
    public static final NodeId LimitAlarmType_SuppressedOrShelved = init(9316);
    public static final NodeId LimitAlarmType_MaxTimeShelved = init(9317);
    public static final NodeId ExclusiveLimitStateMachineType = init(9318);
    public static final NodeId ExclusiveLimitStateMachineType_CurrentState = init(9319);
    public static final NodeId ExclusiveLimitStateMachineType_CurrentState_Id = init(9320);
    public static final NodeId ExclusiveLimitStateMachineType_CurrentState_Name = init(9321);
    public static final NodeId ExclusiveLimitStateMachineType_CurrentState_Number = init(9322);
    public static final NodeId ExclusiveLimitStateMachineType_CurrentState_EffectiveDisplayName = init(9323);
    public static final NodeId ExclusiveLimitStateMachineType_LastTransition = init(9324);
    public static final NodeId ExclusiveLimitStateMachineType_LastTransition_Id = init(9325);
    public static final NodeId ExclusiveLimitStateMachineType_LastTransition_Name = init(9326);
    public static final NodeId ExclusiveLimitStateMachineType_LastTransition_Number = init(9327);
    public static final NodeId ExclusiveLimitStateMachineType_LastTransition_TransitionTime = init(9328);
    public static final NodeId ExclusiveLimitStateMachineType_HighHigh = init(9329);
    public static final NodeId ExclusiveLimitStateMachineType_HighHigh_StateNumber = init(9330);
    public static final NodeId ExclusiveLimitStateMachineType_High = init(9331);
    public static final NodeId ExclusiveLimitStateMachineType_High_StateNumber = init(9332);
    public static final NodeId ExclusiveLimitStateMachineType_Low = init(9333);
    public static final NodeId ExclusiveLimitStateMachineType_Low_StateNumber = init(9334);
    public static final NodeId ExclusiveLimitStateMachineType_LowLow = init(9335);
    public static final NodeId ExclusiveLimitStateMachineType_LowLow_StateNumber = init(9336);
    public static final NodeId ExclusiveLimitStateMachineType_LowLowToLow = init(9337);
    public static final NodeId ExclusiveLimitStateMachineType_LowToLowLow = init(9338);
    public static final NodeId ExclusiveLimitStateMachineType_HighHighToHigh = init(9339);
    public static final NodeId ExclusiveLimitStateMachineType_HighToHighHigh = init(9340);
    public static final NodeId ExclusiveLimitAlarmType = init(9341);
    public static final NodeId ExclusiveLimitAlarmType_EventId = init(9342);
    public static final NodeId ExclusiveLimitAlarmType_EventType = init(9343);
    public static final NodeId ExclusiveLimitAlarmType_SourceNode = init(9344);
    public static final NodeId ExclusiveLimitAlarmType_SourceName = init(9345);
    public static final NodeId ExclusiveLimitAlarmType_Time = init(9346);
    public static final NodeId ExclusiveLimitAlarmType_ReceiveTime = init(9347);
    public static final NodeId ExclusiveLimitAlarmType_LocalTime = init(9348);
    public static final NodeId ExclusiveLimitAlarmType_Message = init(9349);
    public static final NodeId ExclusiveLimitAlarmType_Severity = init(9350);
    public static final NodeId ExclusiveLimitAlarmType_ConditionName = init(9351);
    public static final NodeId ExclusiveLimitAlarmType_BranchId = init(9352);
    public static final NodeId ExclusiveLimitAlarmType_Retain = init(9353);
    public static final NodeId ExclusiveLimitAlarmType_EnabledState = init(9354);
    public static final NodeId ExclusiveLimitAlarmType_EnabledState_Id = init(9355);
    public static final NodeId ExclusiveLimitAlarmType_EnabledState_Name = init(9356);
    public static final NodeId ExclusiveLimitAlarmType_EnabledState_Number = init(9357);
    public static final NodeId ExclusiveLimitAlarmType_EnabledState_EffectiveDisplayName = init(9358);
    public static final NodeId ExclusiveLimitAlarmType_EnabledState_TransitionTime = init(9359);
    public static final NodeId ExclusiveLimitAlarmType_EnabledState_EffectiveTransitionTime = init(9360);
    public static final NodeId ExclusiveLimitAlarmType_EnabledState_TrueState = init(9361);
    public static final NodeId ExclusiveLimitAlarmType_EnabledState_FalseState = init(9362);
    public static final NodeId ExclusiveLimitAlarmType_Quality = init(9363);
    public static final NodeId ExclusiveLimitAlarmType_Quality_SourceTimestamp = init(9364);
    public static final NodeId ExclusiveLimitAlarmType_LastSeverity = init(9365);
    public static final NodeId ExclusiveLimitAlarmType_LastSeverity_SourceTimestamp = init(9366);
    public static final NodeId ExclusiveLimitAlarmType_Comment = init(9367);
    public static final NodeId ExclusiveLimitAlarmType_Comment_SourceTimestamp = init(9368);
    public static final NodeId ExclusiveLimitAlarmType_ClientUserId = init(9369);
    public static final NodeId ExclusiveLimitAlarmType_Enable = init(9370);
    public static final NodeId ExclusiveLimitAlarmType_Disable = init(9371);
    public static final NodeId ExclusiveLimitAlarmType_AddComment = init(9372);
    public static final NodeId ExclusiveLimitAlarmType_AddComment_InputArguments = init(9373);
    public static final NodeId ExclusiveLimitAlarmType_ConditionRefresh = init(9374);
    public static final NodeId ExclusiveLimitAlarmType_ConditionRefresh_InputArguments = init(9375);
    public static final NodeId ExclusiveLimitAlarmType_AckedState = init(9376);
    public static final NodeId ExclusiveLimitAlarmType_AckedState_Id = init(9377);
    public static final NodeId ExclusiveLimitAlarmType_AckedState_Name = init(9378);
    public static final NodeId ExclusiveLimitAlarmType_AckedState_Number = init(9379);
    public static final NodeId ExclusiveLimitAlarmType_AckedState_EffectiveDisplayName = init(9380);
    public static final NodeId ExclusiveLimitAlarmType_AckedState_TransitionTime = init(9381);
    public static final NodeId ExclusiveLimitAlarmType_AckedState_EffectiveTransitionTime = init(9382);
    public static final NodeId ExclusiveLimitAlarmType_AckedState_TrueState = init(9383);
    public static final NodeId ExclusiveLimitAlarmType_AckedState_FalseState = init(9384);
    public static final NodeId ExclusiveLimitAlarmType_ConfirmedState = init(9385);
    public static final NodeId ExclusiveLimitAlarmType_ConfirmedState_Id = init(9386);
    public static final NodeId ExclusiveLimitAlarmType_ConfirmedState_Name = init(9387);
    public static final NodeId ExclusiveLimitAlarmType_ConfirmedState_Number = init(9388);
    public static final NodeId ExclusiveLimitAlarmType_ConfirmedState_EffectiveDisplayName = init(9389);
    public static final NodeId ExclusiveLimitAlarmType_ConfirmedState_TransitionTime = init(9390);
    public static final NodeId ExclusiveLimitAlarmType_ConfirmedState_EffectiveTransitionTime = init(9391);
    public static final NodeId ExclusiveLimitAlarmType_ConfirmedState_TrueState = init(9392);
    public static final NodeId ExclusiveLimitAlarmType_ConfirmedState_FalseState = init(9393);
    public static final NodeId ExclusiveLimitAlarmType_Acknowledge = init(9394);
    public static final NodeId ExclusiveLimitAlarmType_Acknowledge_InputArguments = init(9395);
    public static final NodeId ExclusiveLimitAlarmType_Confirm = init(9396);
    public static final NodeId ExclusiveLimitAlarmType_Confirm_InputArguments = init(9397);
    public static final NodeId ExclusiveLimitAlarmType_ActiveState = init(9398);
    public static final NodeId ExclusiveLimitAlarmType_ActiveState_Id = init(9399);
    public static final NodeId ExclusiveLimitAlarmType_ActiveState_Name = init(9400);
    public static final NodeId ExclusiveLimitAlarmType_ActiveState_Number = init(9401);
    public static final NodeId ExclusiveLimitAlarmType_ActiveState_EffectiveDisplayName = init(9402);
    public static final NodeId ExclusiveLimitAlarmType_ActiveState_TransitionTime = init(9403);
    public static final NodeId ExclusiveLimitAlarmType_ActiveState_EffectiveTransitionTime = init(9404);
    public static final NodeId ExclusiveLimitAlarmType_ActiveState_TrueState = init(9405);
    public static final NodeId ExclusiveLimitAlarmType_ActiveState_FalseState = init(9406);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedState = init(9407);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedState_Id = init(9408);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedState_Name = init(9409);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedState_Number = init(9410);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedState_EffectiveDisplayName = init(9411);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedState_TransitionTime = init(9412);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedState_EffectiveTransitionTime = init(9413);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedState_TrueState = init(9414);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedState_FalseState = init(9415);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState = init(9416);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_CurrentState = init(9417);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_CurrentState_Id = init(9418);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_CurrentState_Name = init(9419);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_CurrentState_Number = init(9420);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(9421);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_LastTransition = init(9422);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_LastTransition_Id = init(9423);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_LastTransition_Name = init(9424);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_LastTransition_Number = init(9425);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_LastTransition_TransitionTime = init(9426);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_UnshelveTime = init(9427);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_Unshelve = init(9449);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_OneShotShelve = init(9450);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_TimedShelve = init(9451);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_TimedShelve_InputArguments = init(9452);
    public static final NodeId ExclusiveLimitAlarmType_SuppressedOrShelved = init(9453);
    public static final NodeId ExclusiveLimitAlarmType_MaxTimeShelved = init(9454);
    public static final NodeId ExclusiveLimitAlarmType_LimitState = init(9455);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_CurrentState = init(9456);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_CurrentState_Id = init(9457);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_CurrentState_Name = init(9458);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_CurrentState_Number = init(9459);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_CurrentState_EffectiveDisplayName = init(9460);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_LastTransition = init(9461);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_LastTransition_Id = init(9462);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_LastTransition_Name = init(9463);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_LastTransition_Number = init(9464);
    public static final NodeId ExclusiveLimitAlarmType_LimitState_LastTransition_TransitionTime = init(9465);
    public static final NodeId ExclusiveLimitAlarmType_HighHighLimit = init(9478);
    public static final NodeId ExclusiveLimitAlarmType_HighLimit = init(9479);
    public static final NodeId ExclusiveLimitAlarmType_LowLimit = init(9480);
    public static final NodeId ExclusiveLimitAlarmType_LowLowLimit = init(9481);
    public static final NodeId ExclusiveLevelAlarmType = init(9482);
    public static final NodeId ExclusiveLevelAlarmType_EventId = init(9483);
    public static final NodeId ExclusiveLevelAlarmType_EventType = init(9484);
    public static final NodeId ExclusiveLevelAlarmType_SourceNode = init(9485);
    public static final NodeId ExclusiveLevelAlarmType_SourceName = init(9486);
    public static final NodeId ExclusiveLevelAlarmType_Time = init(9487);
    public static final NodeId ExclusiveLevelAlarmType_ReceiveTime = init(9488);
    public static final NodeId ExclusiveLevelAlarmType_LocalTime = init(9489);
    public static final NodeId ExclusiveLevelAlarmType_Message = init(9490);
    public static final NodeId ExclusiveLevelAlarmType_Severity = init(9491);
    public static final NodeId ExclusiveLevelAlarmType_ConditionName = init(9492);
    public static final NodeId ExclusiveLevelAlarmType_BranchId = init(9493);
    public static final NodeId ExclusiveLevelAlarmType_Retain = init(9494);
    public static final NodeId ExclusiveLevelAlarmType_EnabledState = init(9495);
    public static final NodeId ExclusiveLevelAlarmType_EnabledState_Id = init(9496);
    public static final NodeId ExclusiveLevelAlarmType_EnabledState_Name = init(9497);
    public static final NodeId ExclusiveLevelAlarmType_EnabledState_Number = init(9498);
    public static final NodeId ExclusiveLevelAlarmType_EnabledState_EffectiveDisplayName = init(9499);
    public static final NodeId ExclusiveLevelAlarmType_EnabledState_TransitionTime = init(9500);
    public static final NodeId ExclusiveLevelAlarmType_EnabledState_EffectiveTransitionTime = init(9501);
    public static final NodeId ExclusiveLevelAlarmType_EnabledState_TrueState = init(9502);
    public static final NodeId ExclusiveLevelAlarmType_EnabledState_FalseState = init(9503);
    public static final NodeId ExclusiveLevelAlarmType_Quality = init(9504);
    public static final NodeId ExclusiveLevelAlarmType_Quality_SourceTimestamp = init(9505);
    public static final NodeId ExclusiveLevelAlarmType_LastSeverity = init(9506);
    public static final NodeId ExclusiveLevelAlarmType_LastSeverity_SourceTimestamp = init(9507);
    public static final NodeId ExclusiveLevelAlarmType_Comment = init(9508);
    public static final NodeId ExclusiveLevelAlarmType_Comment_SourceTimestamp = init(9509);
    public static final NodeId ExclusiveLevelAlarmType_ClientUserId = init(9510);
    public static final NodeId ExclusiveLevelAlarmType_Enable = init(9511);
    public static final NodeId ExclusiveLevelAlarmType_Disable = init(9512);
    public static final NodeId ExclusiveLevelAlarmType_AddComment = init(9513);
    public static final NodeId ExclusiveLevelAlarmType_AddComment_InputArguments = init(9514);
    public static final NodeId ExclusiveLevelAlarmType_ConditionRefresh = init(9515);
    public static final NodeId ExclusiveLevelAlarmType_ConditionRefresh_InputArguments = init(9516);
    public static final NodeId ExclusiveLevelAlarmType_AckedState = init(9517);
    public static final NodeId ExclusiveLevelAlarmType_AckedState_Id = init(9518);
    public static final NodeId ExclusiveLevelAlarmType_AckedState_Name = init(9519);
    public static final NodeId ExclusiveLevelAlarmType_AckedState_Number = init(9520);
    public static final NodeId ExclusiveLevelAlarmType_AckedState_EffectiveDisplayName = init(9521);
    public static final NodeId ExclusiveLevelAlarmType_AckedState_TransitionTime = init(9522);
    public static final NodeId ExclusiveLevelAlarmType_AckedState_EffectiveTransitionTime = init(9523);
    public static final NodeId ExclusiveLevelAlarmType_AckedState_TrueState = init(9524);
    public static final NodeId ExclusiveLevelAlarmType_AckedState_FalseState = init(9525);
    public static final NodeId ExclusiveLevelAlarmType_ConfirmedState = init(9526);
    public static final NodeId ExclusiveLevelAlarmType_ConfirmedState_Id = init(9527);
    public static final NodeId ExclusiveLevelAlarmType_ConfirmedState_Name = init(9528);
    public static final NodeId ExclusiveLevelAlarmType_ConfirmedState_Number = init(9529);
    public static final NodeId ExclusiveLevelAlarmType_ConfirmedState_EffectiveDisplayName = init(9530);
    public static final NodeId ExclusiveLevelAlarmType_ConfirmedState_TransitionTime = init(9531);
    public static final NodeId ExclusiveLevelAlarmType_ConfirmedState_EffectiveTransitionTime = init(9532);
    public static final NodeId ExclusiveLevelAlarmType_ConfirmedState_TrueState = init(9533);
    public static final NodeId ExclusiveLevelAlarmType_ConfirmedState_FalseState = init(9534);
    public static final NodeId ExclusiveLevelAlarmType_Acknowledge = init(9535);
    public static final NodeId ExclusiveLevelAlarmType_Acknowledge_InputArguments = init(9536);
    public static final NodeId ExclusiveLevelAlarmType_Confirm = init(9537);
    public static final NodeId ExclusiveLevelAlarmType_Confirm_InputArguments = init(9538);
    public static final NodeId ExclusiveLevelAlarmType_ActiveState = init(9539);
    public static final NodeId ExclusiveLevelAlarmType_ActiveState_Id = init(9540);
    public static final NodeId ExclusiveLevelAlarmType_ActiveState_Name = init(9541);
    public static final NodeId ExclusiveLevelAlarmType_ActiveState_Number = init(9542);
    public static final NodeId ExclusiveLevelAlarmType_ActiveState_EffectiveDisplayName = init(9543);
    public static final NodeId ExclusiveLevelAlarmType_ActiveState_TransitionTime = init(9544);
    public static final NodeId ExclusiveLevelAlarmType_ActiveState_EffectiveTransitionTime = init(9545);
    public static final NodeId ExclusiveLevelAlarmType_ActiveState_TrueState = init(9546);
    public static final NodeId ExclusiveLevelAlarmType_ActiveState_FalseState = init(9547);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedState = init(9548);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedState_Id = init(9549);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedState_Name = init(9550);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedState_Number = init(9551);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedState_EffectiveDisplayName = init(9552);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedState_TransitionTime = init(9553);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedState_EffectiveTransitionTime = init(9554);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedState_TrueState = init(9555);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedState_FalseState = init(9556);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState = init(9557);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_CurrentState = init(9558);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_CurrentState_Id = init(9559);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_CurrentState_Name = init(9560);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_CurrentState_Number = init(9561);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(9562);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_LastTransition = init(9563);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_LastTransition_Id = init(9564);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_LastTransition_Name = init(9565);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_LastTransition_Number = init(9566);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_LastTransition_TransitionTime = init(9567);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_UnshelveTime = init(9568);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_Unshelve = init(9590);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_OneShotShelve = init(9591);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_TimedShelve = init(9592);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_TimedShelve_InputArguments = init(9593);
    public static final NodeId ExclusiveLevelAlarmType_SuppressedOrShelved = init(9594);
    public static final NodeId ExclusiveLevelAlarmType_MaxTimeShelved = init(9595);
    public static final NodeId ExclusiveLevelAlarmType_LimitState = init(9596);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_CurrentState = init(9597);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_CurrentState_Id = init(9598);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_CurrentState_Name = init(9599);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_CurrentState_Number = init(9600);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_CurrentState_EffectiveDisplayName = init(9601);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_LastTransition = init(9602);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_LastTransition_Id = init(9603);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_LastTransition_Name = init(9604);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_LastTransition_Number = init(9605);
    public static final NodeId ExclusiveLevelAlarmType_LimitState_LastTransition_TransitionTime = init(9606);
    public static final NodeId ExclusiveLevelAlarmType_HighHighLimit = init(9619);
    public static final NodeId ExclusiveLevelAlarmType_HighLimit = init(9620);
    public static final NodeId ExclusiveLevelAlarmType_LowLimit = init(9621);
    public static final NodeId ExclusiveLevelAlarmType_LowLowLimit = init(9622);
    public static final NodeId ExclusiveRateOfChangeAlarmType = init(9623);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EventId = init(9624);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EventType = init(9625);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SourceNode = init(9626);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SourceName = init(9627);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Time = init(9628);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ReceiveTime = init(9629);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LocalTime = init(9630);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Message = init(9631);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Severity = init(9632);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConditionName = init(9633);
    public static final NodeId ExclusiveRateOfChangeAlarmType_BranchId = init(9634);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Retain = init(9635);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EnabledState = init(9636);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EnabledState_Id = init(9637);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EnabledState_Name = init(9638);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EnabledState_Number = init(9639);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EnabledState_EffectiveDisplayName = init(9640);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EnabledState_TransitionTime = init(9641);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EnabledState_EffectiveTransitionTime = init(9642);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EnabledState_TrueState = init(9643);
    public static final NodeId ExclusiveRateOfChangeAlarmType_EnabledState_FalseState = init(9644);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Quality = init(9645);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Quality_SourceTimestamp = init(9646);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LastSeverity = init(9647);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LastSeverity_SourceTimestamp = init(9648);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Comment = init(9649);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Comment_SourceTimestamp = init(9650);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ClientUserId = init(9651);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Enable = init(9652);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Disable = init(9653);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AddComment = init(9654);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AddComment_InputArguments = init(9655);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConditionRefresh = init(9656);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConditionRefresh_InputArguments = init(9657);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AckedState = init(9658);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AckedState_Id = init(9659);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AckedState_Name = init(9660);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AckedState_Number = init(9661);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AckedState_EffectiveDisplayName = init(9662);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AckedState_TransitionTime = init(9663);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AckedState_EffectiveTransitionTime = init(9664);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AckedState_TrueState = init(9665);
    public static final NodeId ExclusiveRateOfChangeAlarmType_AckedState_FalseState = init(9666);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConfirmedState = init(9667);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConfirmedState_Id = init(9668);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConfirmedState_Name = init(9669);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConfirmedState_Number = init(9670);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConfirmedState_EffectiveDisplayName = init(9671);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConfirmedState_TransitionTime = init(9672);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConfirmedState_EffectiveTransitionTime = init(9673);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConfirmedState_TrueState = init(9674);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConfirmedState_FalseState = init(9675);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Acknowledge = init(9676);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Acknowledge_InputArguments = init(9677);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Confirm = init(9678);
    public static final NodeId ExclusiveRateOfChangeAlarmType_Confirm_InputArguments = init(9679);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ActiveState = init(9680);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ActiveState_Id = init(9681);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ActiveState_Name = init(9682);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ActiveState_Number = init(9683);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ActiveState_EffectiveDisplayName = init(9684);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ActiveState_TransitionTime = init(9685);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ActiveState_EffectiveTransitionTime = init(9686);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ActiveState_TrueState = init(9687);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ActiveState_FalseState = init(9688);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedState = init(9689);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedState_Id = init(9690);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedState_Name = init(9691);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedState_Number = init(9692);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedState_EffectiveDisplayName = init(9693);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedState_TransitionTime = init(9694);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedState_EffectiveTransitionTime = init(9695);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedState_TrueState = init(9696);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedState_FalseState = init(9697);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState = init(9698);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState = init(9699);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState_Id = init(9700);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState_Name = init(9701);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState_Number = init(9702);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(
        9703
    );
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition = init(9704);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_Id = init(9705);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_Name = init(9706);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_Number = init(9707);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_TransitionTime = init(9708);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_UnshelveTime = init(9709);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_Unshelve = init(9731);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_OneShotShelve = init(9732);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_TimedShelve = init(9733);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_TimedShelve_InputArguments = init(9734);
    public static final NodeId ExclusiveRateOfChangeAlarmType_SuppressedOrShelved = init(9735);
    public static final NodeId ExclusiveRateOfChangeAlarmType_MaxTimeShelved = init(9736);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState = init(9737);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_CurrentState = init(9738);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_CurrentState_Id = init(9739);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_CurrentState_Name = init(9740);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_CurrentState_Number = init(9741);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_CurrentState_EffectiveDisplayName = init(9742);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_LastTransition = init(9743);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_LastTransition_Id = init(9744);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_LastTransition_Name = init(9745);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_LastTransition_Number = init(9746);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_LastTransition_TransitionTime = init(9747);
    public static final NodeId ExclusiveRateOfChangeAlarmType_HighHighLimit = init(9760);
    public static final NodeId ExclusiveRateOfChangeAlarmType_HighLimit = init(9761);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LowLimit = init(9762);
    public static final NodeId ExclusiveRateOfChangeAlarmType_LowLowLimit = init(9763);
    public static final NodeId ExclusiveDeviationAlarmType = init(9764);
    public static final NodeId ExclusiveDeviationAlarmType_EventId = init(9765);
    public static final NodeId ExclusiveDeviationAlarmType_EventType = init(9766);
    public static final NodeId ExclusiveDeviationAlarmType_SourceNode = init(9767);
    public static final NodeId ExclusiveDeviationAlarmType_SourceName = init(9768);
    public static final NodeId ExclusiveDeviationAlarmType_Time = init(9769);
    public static final NodeId ExclusiveDeviationAlarmType_ReceiveTime = init(9770);
    public static final NodeId ExclusiveDeviationAlarmType_LocalTime = init(9771);
    public static final NodeId ExclusiveDeviationAlarmType_Message = init(9772);
    public static final NodeId ExclusiveDeviationAlarmType_Severity = init(9773);
    public static final NodeId ExclusiveDeviationAlarmType_ConditionName = init(9774);
    public static final NodeId ExclusiveDeviationAlarmType_BranchId = init(9775);
    public static final NodeId ExclusiveDeviationAlarmType_Retain = init(9776);
    public static final NodeId ExclusiveDeviationAlarmType_EnabledState = init(9777);
    public static final NodeId ExclusiveDeviationAlarmType_EnabledState_Id = init(9778);
    public static final NodeId ExclusiveDeviationAlarmType_EnabledState_Name = init(9779);
    public static final NodeId ExclusiveDeviationAlarmType_EnabledState_Number = init(9780);
    public static final NodeId ExclusiveDeviationAlarmType_EnabledState_EffectiveDisplayName = init(9781);
    public static final NodeId ExclusiveDeviationAlarmType_EnabledState_TransitionTime = init(9782);
    public static final NodeId ExclusiveDeviationAlarmType_EnabledState_EffectiveTransitionTime = init(9783);
    public static final NodeId ExclusiveDeviationAlarmType_EnabledState_TrueState = init(9784);
    public static final NodeId ExclusiveDeviationAlarmType_EnabledState_FalseState = init(9785);
    public static final NodeId ExclusiveDeviationAlarmType_Quality = init(9786);
    public static final NodeId ExclusiveDeviationAlarmType_Quality_SourceTimestamp = init(9787);
    public static final NodeId ExclusiveDeviationAlarmType_LastSeverity = init(9788);
    public static final NodeId ExclusiveDeviationAlarmType_LastSeverity_SourceTimestamp = init(9789);
    public static final NodeId ExclusiveDeviationAlarmType_Comment = init(9790);
    public static final NodeId ExclusiveDeviationAlarmType_Comment_SourceTimestamp = init(9791);
    public static final NodeId ExclusiveDeviationAlarmType_ClientUserId = init(9792);
    public static final NodeId ExclusiveDeviationAlarmType_Enable = init(9793);
    public static final NodeId ExclusiveDeviationAlarmType_Disable = init(9794);
    public static final NodeId ExclusiveDeviationAlarmType_AddComment = init(9795);
    public static final NodeId ExclusiveDeviationAlarmType_AddComment_InputArguments = init(9796);
    public static final NodeId ExclusiveDeviationAlarmType_ConditionRefresh = init(9797);
    public static final NodeId ExclusiveDeviationAlarmType_ConditionRefresh_InputArguments = init(9798);
    public static final NodeId ExclusiveDeviationAlarmType_AckedState = init(9799);
    public static final NodeId ExclusiveDeviationAlarmType_AckedState_Id = init(9800);
    public static final NodeId ExclusiveDeviationAlarmType_AckedState_Name = init(9801);
    public static final NodeId ExclusiveDeviationAlarmType_AckedState_Number = init(9802);
    public static final NodeId ExclusiveDeviationAlarmType_AckedState_EffectiveDisplayName = init(9803);
    public static final NodeId ExclusiveDeviationAlarmType_AckedState_TransitionTime = init(9804);
    public static final NodeId ExclusiveDeviationAlarmType_AckedState_EffectiveTransitionTime = init(9805);
    public static final NodeId ExclusiveDeviationAlarmType_AckedState_TrueState = init(9806);
    public static final NodeId ExclusiveDeviationAlarmType_AckedState_FalseState = init(9807);
    public static final NodeId ExclusiveDeviationAlarmType_ConfirmedState = init(9808);
    public static final NodeId ExclusiveDeviationAlarmType_ConfirmedState_Id = init(9809);
    public static final NodeId ExclusiveDeviationAlarmType_ConfirmedState_Name = init(9810);
    public static final NodeId ExclusiveDeviationAlarmType_ConfirmedState_Number = init(9811);
    public static final NodeId ExclusiveDeviationAlarmType_ConfirmedState_EffectiveDisplayName = init(9812);
    public static final NodeId ExclusiveDeviationAlarmType_ConfirmedState_TransitionTime = init(9813);
    public static final NodeId ExclusiveDeviationAlarmType_ConfirmedState_EffectiveTransitionTime = init(9814);
    public static final NodeId ExclusiveDeviationAlarmType_ConfirmedState_TrueState = init(9815);
    public static final NodeId ExclusiveDeviationAlarmType_ConfirmedState_FalseState = init(9816);
    public static final NodeId ExclusiveDeviationAlarmType_Acknowledge = init(9817);
    public static final NodeId ExclusiveDeviationAlarmType_Acknowledge_InputArguments = init(9818);
    public static final NodeId ExclusiveDeviationAlarmType_Confirm = init(9819);
    public static final NodeId ExclusiveDeviationAlarmType_Confirm_InputArguments = init(9820);
    public static final NodeId ExclusiveDeviationAlarmType_ActiveState = init(9821);
    public static final NodeId ExclusiveDeviationAlarmType_ActiveState_Id = init(9822);
    public static final NodeId ExclusiveDeviationAlarmType_ActiveState_Name = init(9823);
    public static final NodeId ExclusiveDeviationAlarmType_ActiveState_Number = init(9824);
    public static final NodeId ExclusiveDeviationAlarmType_ActiveState_EffectiveDisplayName = init(9825);
    public static final NodeId ExclusiveDeviationAlarmType_ActiveState_TransitionTime = init(9826);
    public static final NodeId ExclusiveDeviationAlarmType_ActiveState_EffectiveTransitionTime = init(9827);
    public static final NodeId ExclusiveDeviationAlarmType_ActiveState_TrueState = init(9828);
    public static final NodeId ExclusiveDeviationAlarmType_ActiveState_FalseState = init(9829);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedState = init(9830);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedState_Id = init(9831);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedState_Name = init(9832);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedState_Number = init(9833);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedState_EffectiveDisplayName = init(9834);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedState_TransitionTime = init(9835);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedState_EffectiveTransitionTime = init(9836);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedState_TrueState = init(9837);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedState_FalseState = init(9838);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState = init(9839);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_CurrentState = init(9840);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_CurrentState_Id = init(9841);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_CurrentState_Name = init(9842);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_CurrentState_Number = init(9843);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(9844);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_LastTransition = init(9845);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_LastTransition_Id = init(9846);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_LastTransition_Name = init(9847);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_LastTransition_Number = init(9848);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_LastTransition_TransitionTime = init(9849);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_UnshelveTime = init(9850);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_Unshelve = init(9872);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_OneShotShelve = init(9873);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_TimedShelve = init(9874);
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_TimedShelve_InputArguments = init(9875);
    public static final NodeId ExclusiveDeviationAlarmType_SuppressedOrShelved = init(9876);
    public static final NodeId ExclusiveDeviationAlarmType_MaxTimeShelved = init(9877);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState = init(9878);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_CurrentState = init(9879);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_CurrentState_Id = init(9880);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_CurrentState_Name = init(9881);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_CurrentState_Number = init(9882);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_CurrentState_EffectiveDisplayName = init(9883);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_LastTransition = init(9884);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_LastTransition_Id = init(9885);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_LastTransition_Name = init(9886);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_LastTransition_Number = init(9887);
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_LastTransition_TransitionTime = init(9888);
    public static final NodeId ExclusiveDeviationAlarmType_HighHighLimit = init(9901);
    public static final NodeId ExclusiveDeviationAlarmType_HighLimit = init(9902);
    public static final NodeId ExclusiveDeviationAlarmType_LowLimit = init(9903);
    public static final NodeId ExclusiveDeviationAlarmType_LowLowLimit = init(9904);
    public static final NodeId ExclusiveDeviationAlarmType_SetpointNode = init(9905);
    public static final NodeId NonExclusiveLimitAlarmType = init(9906);
    public static final NodeId NonExclusiveLimitAlarmType_EventId = init(9907);
    public static final NodeId NonExclusiveLimitAlarmType_EventType = init(9908);
    public static final NodeId NonExclusiveLimitAlarmType_SourceNode = init(9909);
    public static final NodeId NonExclusiveLimitAlarmType_SourceName = init(9910);
    public static final NodeId NonExclusiveLimitAlarmType_Time = init(9911);
    public static final NodeId NonExclusiveLimitAlarmType_ReceiveTime = init(9912);
    public static final NodeId NonExclusiveLimitAlarmType_LocalTime = init(9913);
    public static final NodeId NonExclusiveLimitAlarmType_Message = init(9914);
    public static final NodeId NonExclusiveLimitAlarmType_Severity = init(9915);
    public static final NodeId NonExclusiveLimitAlarmType_ConditionName = init(9916);
    public static final NodeId NonExclusiveLimitAlarmType_BranchId = init(9917);
    public static final NodeId NonExclusiveLimitAlarmType_Retain = init(9918);
    public static final NodeId NonExclusiveLimitAlarmType_EnabledState = init(9919);
    public static final NodeId NonExclusiveLimitAlarmType_EnabledState_Id = init(9920);
    public static final NodeId NonExclusiveLimitAlarmType_EnabledState_Name = init(9921);
    public static final NodeId NonExclusiveLimitAlarmType_EnabledState_Number = init(9922);
    public static final NodeId NonExclusiveLimitAlarmType_EnabledState_EffectiveDisplayName = init(9923);
    public static final NodeId NonExclusiveLimitAlarmType_EnabledState_TransitionTime = init(9924);
    public static final NodeId NonExclusiveLimitAlarmType_EnabledState_EffectiveTransitionTime = init(9925);
    public static final NodeId NonExclusiveLimitAlarmType_EnabledState_TrueState = init(9926);
    public static final NodeId NonExclusiveLimitAlarmType_EnabledState_FalseState = init(9927);
    public static final NodeId NonExclusiveLimitAlarmType_Quality = init(9928);
    public static final NodeId NonExclusiveLimitAlarmType_Quality_SourceTimestamp = init(9929);
    public static final NodeId NonExclusiveLimitAlarmType_LastSeverity = init(9930);
    public static final NodeId NonExclusiveLimitAlarmType_LastSeverity_SourceTimestamp = init(9931);
    public static final NodeId NonExclusiveLimitAlarmType_Comment = init(9932);
    public static final NodeId NonExclusiveLimitAlarmType_Comment_SourceTimestamp = init(9933);
    public static final NodeId NonExclusiveLimitAlarmType_ClientUserId = init(9934);
    public static final NodeId NonExclusiveLimitAlarmType_Enable = init(9935);
    public static final NodeId NonExclusiveLimitAlarmType_Disable = init(9936);
    public static final NodeId NonExclusiveLimitAlarmType_AddComment = init(9937);
    public static final NodeId NonExclusiveLimitAlarmType_AddComment_InputArguments = init(9938);
    public static final NodeId NonExclusiveLimitAlarmType_ConditionRefresh = init(9939);
    public static final NodeId NonExclusiveLimitAlarmType_ConditionRefresh_InputArguments = init(9940);
    public static final NodeId NonExclusiveLimitAlarmType_AckedState = init(9941);
    public static final NodeId NonExclusiveLimitAlarmType_AckedState_Id = init(9942);
    public static final NodeId NonExclusiveLimitAlarmType_AckedState_Name = init(9943);
    public static final NodeId NonExclusiveLimitAlarmType_AckedState_Number = init(9944);
    public static final NodeId NonExclusiveLimitAlarmType_AckedState_EffectiveDisplayName = init(9945);
    public static final NodeId NonExclusiveLimitAlarmType_AckedState_TransitionTime = init(9946);
    public static final NodeId NonExclusiveLimitAlarmType_AckedState_EffectiveTransitionTime = init(9947);
    public static final NodeId NonExclusiveLimitAlarmType_AckedState_TrueState = init(9948);
    public static final NodeId NonExclusiveLimitAlarmType_AckedState_FalseState = init(9949);
    public static final NodeId NonExclusiveLimitAlarmType_ConfirmedState = init(9950);
    public static final NodeId NonExclusiveLimitAlarmType_ConfirmedState_Id = init(9951);
    public static final NodeId NonExclusiveLimitAlarmType_ConfirmedState_Name = init(9952);
    public static final NodeId NonExclusiveLimitAlarmType_ConfirmedState_Number = init(9953);
    public static final NodeId NonExclusiveLimitAlarmType_ConfirmedState_EffectiveDisplayName = init(9954);
    public static final NodeId NonExclusiveLimitAlarmType_ConfirmedState_TransitionTime = init(9955);
    public static final NodeId NonExclusiveLimitAlarmType_ConfirmedState_EffectiveTransitionTime = init(9956);
    public static final NodeId NonExclusiveLimitAlarmType_ConfirmedState_TrueState = init(9957);
    public static final NodeId NonExclusiveLimitAlarmType_ConfirmedState_FalseState = init(9958);
    public static final NodeId NonExclusiveLimitAlarmType_Acknowledge = init(9959);
    public static final NodeId NonExclusiveLimitAlarmType_Acknowledge_InputArguments = init(9960);
    public static final NodeId NonExclusiveLimitAlarmType_Confirm = init(9961);
    public static final NodeId NonExclusiveLimitAlarmType_Confirm_InputArguments = init(9962);
    public static final NodeId NonExclusiveLimitAlarmType_ActiveState = init(9963);
    public static final NodeId NonExclusiveLimitAlarmType_ActiveState_Id = init(9964);
    public static final NodeId NonExclusiveLimitAlarmType_ActiveState_Name = init(9965);
    public static final NodeId NonExclusiveLimitAlarmType_ActiveState_Number = init(9966);
    public static final NodeId NonExclusiveLimitAlarmType_ActiveState_EffectiveDisplayName = init(9967);
    public static final NodeId NonExclusiveLimitAlarmType_ActiveState_TransitionTime = init(9968);
    public static final NodeId NonExclusiveLimitAlarmType_ActiveState_EffectiveTransitionTime = init(9969);
    public static final NodeId NonExclusiveLimitAlarmType_ActiveState_TrueState = init(9970);
    public static final NodeId NonExclusiveLimitAlarmType_ActiveState_FalseState = init(9971);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedState = init(9972);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedState_Id = init(9973);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedState_Name = init(9974);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedState_Number = init(9975);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedState_EffectiveDisplayName = init(9976);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedState_TransitionTime = init(9977);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedState_EffectiveTransitionTime = init(9978);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedState_TrueState = init(9979);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedState_FalseState = init(9980);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState = init(9981);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_CurrentState = init(9982);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_CurrentState_Id = init(9983);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_CurrentState_Name = init(9984);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_CurrentState_Number = init(9985);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(9986);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_LastTransition = init(9987);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_LastTransition_Id = init(9988);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_LastTransition_Name = init(9989);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_LastTransition_Number = init(9990);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_LastTransition_TransitionTime = init(9991);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_UnshelveTime = init(9992);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_Unshelve = init(10014);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_OneShotShelve = init(10015);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_TimedShelve = init(10016);
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_TimedShelve_InputArguments = init(10017);
    public static final NodeId NonExclusiveLimitAlarmType_SuppressedOrShelved = init(10018);
    public static final NodeId NonExclusiveLimitAlarmType_MaxTimeShelved = init(10019);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighState = init(10020);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighState_Id = init(10021);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighState_Name = init(10022);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighState_Number = init(10023);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighState_EffectiveDisplayName = init(10024);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighState_TransitionTime = init(10025);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighState_EffectiveTransitionTime = init(10026);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighState_TrueState = init(10027);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighState_FalseState = init(10028);
    public static final NodeId NonExclusiveLimitAlarmType_HighState = init(10029);
    public static final NodeId NonExclusiveLimitAlarmType_HighState_Id = init(10030);
    public static final NodeId NonExclusiveLimitAlarmType_HighState_Name = init(10031);
    public static final NodeId NonExclusiveLimitAlarmType_HighState_Number = init(10032);
    public static final NodeId NonExclusiveLimitAlarmType_HighState_EffectiveDisplayName = init(10033);
    public static final NodeId NonExclusiveLimitAlarmType_HighState_TransitionTime = init(10034);
    public static final NodeId NonExclusiveLimitAlarmType_HighState_EffectiveTransitionTime = init(10035);
    public static final NodeId NonExclusiveLimitAlarmType_HighState_TrueState = init(10036);
    public static final NodeId NonExclusiveLimitAlarmType_HighState_FalseState = init(10037);
    public static final NodeId NonExclusiveLimitAlarmType_LowState = init(10038);
    public static final NodeId NonExclusiveLimitAlarmType_LowState_Id = init(10039);
    public static final NodeId NonExclusiveLimitAlarmType_LowState_Name = init(10040);
    public static final NodeId NonExclusiveLimitAlarmType_LowState_Number = init(10041);
    public static final NodeId NonExclusiveLimitAlarmType_LowState_EffectiveDisplayName = init(10042);
    public static final NodeId NonExclusiveLimitAlarmType_LowState_TransitionTime = init(10043);
    public static final NodeId NonExclusiveLimitAlarmType_LowState_EffectiveTransitionTime = init(10044);
    public static final NodeId NonExclusiveLimitAlarmType_LowState_TrueState = init(10045);
    public static final NodeId NonExclusiveLimitAlarmType_LowState_FalseState = init(10046);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowState = init(10047);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowState_Id = init(10048);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowState_Name = init(10049);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowState_Number = init(10050);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowState_EffectiveDisplayName = init(10051);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowState_TransitionTime = init(10052);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowState_EffectiveTransitionTime = init(10053);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowState_TrueState = init(10054);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowState_FalseState = init(10055);
    public static final NodeId NonExclusiveLimitAlarmType_HighHighLimit = init(10056);
    public static final NodeId NonExclusiveLimitAlarmType_HighLimit = init(10057);
    public static final NodeId NonExclusiveLimitAlarmType_LowLimit = init(10058);
    public static final NodeId NonExclusiveLimitAlarmType_LowLowLimit = init(10059);
    public static final NodeId NonExclusiveLevelAlarmType = init(10060);
    public static final NodeId NonExclusiveLevelAlarmType_EventId = init(10061);
    public static final NodeId NonExclusiveLevelAlarmType_EventType = init(10062);
    public static final NodeId NonExclusiveLevelAlarmType_SourceNode = init(10063);
    public static final NodeId NonExclusiveLevelAlarmType_SourceName = init(10064);
    public static final NodeId NonExclusiveLevelAlarmType_Time = init(10065);
    public static final NodeId NonExclusiveLevelAlarmType_ReceiveTime = init(10066);
    public static final NodeId NonExclusiveLevelAlarmType_LocalTime = init(10067);
    public static final NodeId NonExclusiveLevelAlarmType_Message = init(10068);
    public static final NodeId NonExclusiveLevelAlarmType_Severity = init(10069);
    public static final NodeId NonExclusiveLevelAlarmType_ConditionName = init(10070);
    public static final NodeId NonExclusiveLevelAlarmType_BranchId = init(10071);
    public static final NodeId NonExclusiveLevelAlarmType_Retain = init(10072);
    public static final NodeId NonExclusiveLevelAlarmType_EnabledState = init(10073);
    public static final NodeId NonExclusiveLevelAlarmType_EnabledState_Id = init(10074);
    public static final NodeId NonExclusiveLevelAlarmType_EnabledState_Name = init(10075);
    public static final NodeId NonExclusiveLevelAlarmType_EnabledState_Number = init(10076);
    public static final NodeId NonExclusiveLevelAlarmType_EnabledState_EffectiveDisplayName = init(10077);
    public static final NodeId NonExclusiveLevelAlarmType_EnabledState_TransitionTime = init(10078);
    public static final NodeId NonExclusiveLevelAlarmType_EnabledState_EffectiveTransitionTime = init(10079);
    public static final NodeId NonExclusiveLevelAlarmType_EnabledState_TrueState = init(10080);
    public static final NodeId NonExclusiveLevelAlarmType_EnabledState_FalseState = init(10081);
    public static final NodeId NonExclusiveLevelAlarmType_Quality = init(10082);
    public static final NodeId NonExclusiveLevelAlarmType_Quality_SourceTimestamp = init(10083);
    public static final NodeId NonExclusiveLevelAlarmType_LastSeverity = init(10084);
    public static final NodeId NonExclusiveLevelAlarmType_LastSeverity_SourceTimestamp = init(10085);
    public static final NodeId NonExclusiveLevelAlarmType_Comment = init(10086);
    public static final NodeId NonExclusiveLevelAlarmType_Comment_SourceTimestamp = init(10087);
    public static final NodeId NonExclusiveLevelAlarmType_ClientUserId = init(10088);
    public static final NodeId NonExclusiveLevelAlarmType_Enable = init(10089);
    public static final NodeId NonExclusiveLevelAlarmType_Disable = init(10090);
    public static final NodeId NonExclusiveLevelAlarmType_AddComment = init(10091);
    public static final NodeId NonExclusiveLevelAlarmType_AddComment_InputArguments = init(10092);
    public static final NodeId NonExclusiveLevelAlarmType_ConditionRefresh = init(10093);
    public static final NodeId NonExclusiveLevelAlarmType_ConditionRefresh_InputArguments = init(10094);
    public static final NodeId NonExclusiveLevelAlarmType_AckedState = init(10095);
    public static final NodeId NonExclusiveLevelAlarmType_AckedState_Id = init(10096);
    public static final NodeId NonExclusiveLevelAlarmType_AckedState_Name = init(10097);
    public static final NodeId NonExclusiveLevelAlarmType_AckedState_Number = init(10098);
    public static final NodeId NonExclusiveLevelAlarmType_AckedState_EffectiveDisplayName = init(10099);
    public static final NodeId NonExclusiveLevelAlarmType_AckedState_TransitionTime = init(10100);
    public static final NodeId NonExclusiveLevelAlarmType_AckedState_EffectiveTransitionTime = init(10101);
    public static final NodeId NonExclusiveLevelAlarmType_AckedState_TrueState = init(10102);
    public static final NodeId NonExclusiveLevelAlarmType_AckedState_FalseState = init(10103);
    public static final NodeId NonExclusiveLevelAlarmType_ConfirmedState = init(10104);
    public static final NodeId NonExclusiveLevelAlarmType_ConfirmedState_Id = init(10105);
    public static final NodeId NonExclusiveLevelAlarmType_ConfirmedState_Name = init(10106);
    public static final NodeId NonExclusiveLevelAlarmType_ConfirmedState_Number = init(10107);
    public static final NodeId NonExclusiveLevelAlarmType_ConfirmedState_EffectiveDisplayName = init(10108);
    public static final NodeId NonExclusiveLevelAlarmType_ConfirmedState_TransitionTime = init(10109);
    public static final NodeId NonExclusiveLevelAlarmType_ConfirmedState_EffectiveTransitionTime = init(10110);
    public static final NodeId NonExclusiveLevelAlarmType_ConfirmedState_TrueState = init(10111);
    public static final NodeId NonExclusiveLevelAlarmType_ConfirmedState_FalseState = init(10112);
    public static final NodeId NonExclusiveLevelAlarmType_Acknowledge = init(10113);
    public static final NodeId NonExclusiveLevelAlarmType_Acknowledge_InputArguments = init(10114);
    public static final NodeId NonExclusiveLevelAlarmType_Confirm = init(10115);
    public static final NodeId NonExclusiveLevelAlarmType_Confirm_InputArguments = init(10116);
    public static final NodeId NonExclusiveLevelAlarmType_ActiveState = init(10117);
    public static final NodeId NonExclusiveLevelAlarmType_ActiveState_Id = init(10118);
    public static final NodeId NonExclusiveLevelAlarmType_ActiveState_Name = init(10119);
    public static final NodeId NonExclusiveLevelAlarmType_ActiveState_Number = init(10120);
    public static final NodeId NonExclusiveLevelAlarmType_ActiveState_EffectiveDisplayName = init(10121);
    public static final NodeId NonExclusiveLevelAlarmType_ActiveState_TransitionTime = init(10122);
    public static final NodeId NonExclusiveLevelAlarmType_ActiveState_EffectiveTransitionTime = init(10123);
    public static final NodeId NonExclusiveLevelAlarmType_ActiveState_TrueState = init(10124);
    public static final NodeId NonExclusiveLevelAlarmType_ActiveState_FalseState = init(10125);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedState = init(10126);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedState_Id = init(10127);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedState_Name = init(10128);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedState_Number = init(10129);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedState_EffectiveDisplayName = init(10130);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedState_TransitionTime = init(10131);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedState_EffectiveTransitionTime = init(10132);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedState_TrueState = init(10133);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedState_FalseState = init(10134);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState = init(10135);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_CurrentState = init(10136);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_CurrentState_Id = init(10137);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_CurrentState_Name = init(10138);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_CurrentState_Number = init(10139);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(10140);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_LastTransition = init(10141);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_LastTransition_Id = init(10142);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_LastTransition_Name = init(10143);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_LastTransition_Number = init(10144);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_LastTransition_TransitionTime = init(10145);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_UnshelveTime = init(10146);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_Unshelve = init(10168);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_OneShotShelve = init(10169);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_TimedShelve = init(10170);
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_TimedShelve_InputArguments = init(10171);
    public static final NodeId NonExclusiveLevelAlarmType_SuppressedOrShelved = init(10172);
    public static final NodeId NonExclusiveLevelAlarmType_MaxTimeShelved = init(10173);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighState = init(10174);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighState_Id = init(10175);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighState_Name = init(10176);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighState_Number = init(10177);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighState_EffectiveDisplayName = init(10178);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighState_TransitionTime = init(10179);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighState_EffectiveTransitionTime = init(10180);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighState_TrueState = init(10181);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighState_FalseState = init(10182);
    public static final NodeId NonExclusiveLevelAlarmType_HighState = init(10183);
    public static final NodeId NonExclusiveLevelAlarmType_HighState_Id = init(10184);
    public static final NodeId NonExclusiveLevelAlarmType_HighState_Name = init(10185);
    public static final NodeId NonExclusiveLevelAlarmType_HighState_Number = init(10186);
    public static final NodeId NonExclusiveLevelAlarmType_HighState_EffectiveDisplayName = init(10187);
    public static final NodeId NonExclusiveLevelAlarmType_HighState_TransitionTime = init(10188);
    public static final NodeId NonExclusiveLevelAlarmType_HighState_EffectiveTransitionTime = init(10189);
    public static final NodeId NonExclusiveLevelAlarmType_HighState_TrueState = init(10190);
    public static final NodeId NonExclusiveLevelAlarmType_HighState_FalseState = init(10191);
    public static final NodeId NonExclusiveLevelAlarmType_LowState = init(10192);
    public static final NodeId NonExclusiveLevelAlarmType_LowState_Id = init(10193);
    public static final NodeId NonExclusiveLevelAlarmType_LowState_Name = init(10194);
    public static final NodeId NonExclusiveLevelAlarmType_LowState_Number = init(10195);
    public static final NodeId NonExclusiveLevelAlarmType_LowState_EffectiveDisplayName = init(10196);
    public static final NodeId NonExclusiveLevelAlarmType_LowState_TransitionTime = init(10197);
    public static final NodeId NonExclusiveLevelAlarmType_LowState_EffectiveTransitionTime = init(10198);
    public static final NodeId NonExclusiveLevelAlarmType_LowState_TrueState = init(10199);
    public static final NodeId NonExclusiveLevelAlarmType_LowState_FalseState = init(10200);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowState = init(10201);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowState_Id = init(10202);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowState_Name = init(10203);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowState_Number = init(10204);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowState_EffectiveDisplayName = init(10205);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowState_TransitionTime = init(10206);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowState_EffectiveTransitionTime = init(10207);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowState_TrueState = init(10208);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowState_FalseState = init(10209);
    public static final NodeId NonExclusiveLevelAlarmType_HighHighLimit = init(10210);
    public static final NodeId NonExclusiveLevelAlarmType_HighLimit = init(10211);
    public static final NodeId NonExclusiveLevelAlarmType_LowLimit = init(10212);
    public static final NodeId NonExclusiveLevelAlarmType_LowLowLimit = init(10213);
    public static final NodeId NonExclusiveRateOfChangeAlarmType = init(10214);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EventId = init(10215);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EventType = init(10216);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SourceNode = init(10217);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SourceName = init(10218);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Time = init(10219);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ReceiveTime = init(10220);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LocalTime = init(10221);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Message = init(10222);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Severity = init(10223);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConditionName = init(10224);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_BranchId = init(10225);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Retain = init(10226);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EnabledState = init(10227);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EnabledState_Id = init(10228);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EnabledState_Name = init(10229);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EnabledState_Number = init(10230);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EnabledState_EffectiveDisplayName = init(10231);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EnabledState_TransitionTime = init(10232);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EnabledState_EffectiveTransitionTime = init(10233);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EnabledState_TrueState = init(10234);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_EnabledState_FalseState = init(10235);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Quality = init(10236);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Quality_SourceTimestamp = init(10237);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LastSeverity = init(10238);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LastSeverity_SourceTimestamp = init(10239);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Comment = init(10240);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Comment_SourceTimestamp = init(10241);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ClientUserId = init(10242);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Enable = init(10243);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Disable = init(10244);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AddComment = init(10245);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AddComment_InputArguments = init(10246);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConditionRefresh = init(10247);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConditionRefresh_InputArguments = init(10248);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AckedState = init(10249);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AckedState_Id = init(10250);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AckedState_Name = init(10251);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AckedState_Number = init(10252);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AckedState_EffectiveDisplayName = init(10253);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AckedState_TransitionTime = init(10254);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AckedState_EffectiveTransitionTime = init(10255);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AckedState_TrueState = init(10256);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_AckedState_FalseState = init(10257);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConfirmedState = init(10258);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConfirmedState_Id = init(10259);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConfirmedState_Name = init(10260);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConfirmedState_Number = init(10261);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConfirmedState_EffectiveDisplayName = init(10262);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConfirmedState_TransitionTime = init(10263);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConfirmedState_EffectiveTransitionTime = init(10264);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConfirmedState_TrueState = init(10265);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConfirmedState_FalseState = init(10266);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Acknowledge = init(10267);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Acknowledge_InputArguments = init(10268);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Confirm = init(10269);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_Confirm_InputArguments = init(10270);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ActiveState = init(10271);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ActiveState_Id = init(10272);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ActiveState_Name = init(10273);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ActiveState_Number = init(10274);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ActiveState_EffectiveDisplayName = init(10275);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ActiveState_TransitionTime = init(10276);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ActiveState_EffectiveTransitionTime = init(10277);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ActiveState_TrueState = init(10278);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ActiveState_FalseState = init(10279);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedState = init(10280);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedState_Id = init(10281);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedState_Name = init(10282);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedState_Number = init(10283);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedState_EffectiveDisplayName = init(10284);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedState_TransitionTime = init(10285);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedState_EffectiveTransitionTime = init(10286);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedState_TrueState = init(10287);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedState_FalseState = init(10288);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState = init(10289);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState = init(10290);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState_Id = init(10291);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState_Name = init(10292);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState_Number = init(10293);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(
        10294
    );
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition = init(10295);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_Id = init(10296);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_Name = init(10297);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_Number = init(10298);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_TransitionTime = init(
        10299
    );
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_UnshelveTime = init(10300);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_Unshelve = init(10322);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_OneShotShelve = init(10323);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_TimedShelve = init(10324);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_TimedShelve_InputArguments = init(10325);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_SuppressedOrShelved = init(10326);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_MaxTimeShelved = init(10327);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighState = init(10328);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighState_Id = init(10329);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighState_Name = init(10330);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighState_Number = init(10331);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighState_EffectiveDisplayName = init(10332);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighState_TransitionTime = init(10333);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighState_EffectiveTransitionTime = init(10334);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighState_TrueState = init(10335);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighState_FalseState = init(10336);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighState = init(10337);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighState_Id = init(10338);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighState_Name = init(10339);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighState_Number = init(10340);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighState_EffectiveDisplayName = init(10341);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighState_TransitionTime = init(10342);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighState_EffectiveTransitionTime = init(10343);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighState_TrueState = init(10344);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighState_FalseState = init(10345);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowState = init(10346);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowState_Id = init(10347);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowState_Name = init(10348);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowState_Number = init(10349);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowState_EffectiveDisplayName = init(10350);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowState_TransitionTime = init(10351);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowState_EffectiveTransitionTime = init(10352);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowState_TrueState = init(10353);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowState_FalseState = init(10354);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowState = init(10355);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowState_Id = init(10356);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowState_Name = init(10357);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowState_Number = init(10358);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowState_EffectiveDisplayName = init(10359);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowState_TransitionTime = init(10360);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowState_EffectiveTransitionTime = init(10361);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowState_TrueState = init(10362);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowState_FalseState = init(10363);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighHighLimit = init(10364);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_HighLimit = init(10365);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLimit = init(10366);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_LowLowLimit = init(10367);
    public static final NodeId NonExclusiveDeviationAlarmType = init(10368);
    public static final NodeId NonExclusiveDeviationAlarmType_EventId = init(10369);
    public static final NodeId NonExclusiveDeviationAlarmType_EventType = init(10370);
    public static final NodeId NonExclusiveDeviationAlarmType_SourceNode = init(10371);
    public static final NodeId NonExclusiveDeviationAlarmType_SourceName = init(10372);
    public static final NodeId NonExclusiveDeviationAlarmType_Time = init(10373);
    public static final NodeId NonExclusiveDeviationAlarmType_ReceiveTime = init(10374);
    public static final NodeId NonExclusiveDeviationAlarmType_LocalTime = init(10375);
    public static final NodeId NonExclusiveDeviationAlarmType_Message = init(10376);
    public static final NodeId NonExclusiveDeviationAlarmType_Severity = init(10377);
    public static final NodeId NonExclusiveDeviationAlarmType_ConditionName = init(10378);
    public static final NodeId NonExclusiveDeviationAlarmType_BranchId = init(10379);
    public static final NodeId NonExclusiveDeviationAlarmType_Retain = init(10380);
    public static final NodeId NonExclusiveDeviationAlarmType_EnabledState = init(10381);
    public static final NodeId NonExclusiveDeviationAlarmType_EnabledState_Id = init(10382);
    public static final NodeId NonExclusiveDeviationAlarmType_EnabledState_Name = init(10383);
    public static final NodeId NonExclusiveDeviationAlarmType_EnabledState_Number = init(10384);
    public static final NodeId NonExclusiveDeviationAlarmType_EnabledState_EffectiveDisplayName = init(10385);
    public static final NodeId NonExclusiveDeviationAlarmType_EnabledState_TransitionTime = init(10386);
    public static final NodeId NonExclusiveDeviationAlarmType_EnabledState_EffectiveTransitionTime = init(10387);
    public static final NodeId NonExclusiveDeviationAlarmType_EnabledState_TrueState = init(10388);
    public static final NodeId NonExclusiveDeviationAlarmType_EnabledState_FalseState = init(10389);
    public static final NodeId NonExclusiveDeviationAlarmType_Quality = init(10390);
    public static final NodeId NonExclusiveDeviationAlarmType_Quality_SourceTimestamp = init(10391);
    public static final NodeId NonExclusiveDeviationAlarmType_LastSeverity = init(10392);
    public static final NodeId NonExclusiveDeviationAlarmType_LastSeverity_SourceTimestamp = init(10393);
    public static final NodeId NonExclusiveDeviationAlarmType_Comment = init(10394);
    public static final NodeId NonExclusiveDeviationAlarmType_Comment_SourceTimestamp = init(10395);
    public static final NodeId NonExclusiveDeviationAlarmType_ClientUserId = init(10396);
    public static final NodeId NonExclusiveDeviationAlarmType_Enable = init(10397);
    public static final NodeId NonExclusiveDeviationAlarmType_Disable = init(10398);
    public static final NodeId NonExclusiveDeviationAlarmType_AddComment = init(10399);
    public static final NodeId NonExclusiveDeviationAlarmType_AddComment_InputArguments = init(10400);
    public static final NodeId NonExclusiveDeviationAlarmType_ConditionRefresh = init(10401);
    public static final NodeId NonExclusiveDeviationAlarmType_ConditionRefresh_InputArguments = init(10402);
    public static final NodeId NonExclusiveDeviationAlarmType_AckedState = init(10403);
    public static final NodeId NonExclusiveDeviationAlarmType_AckedState_Id = init(10404);
    public static final NodeId NonExclusiveDeviationAlarmType_AckedState_Name = init(10405);
    public static final NodeId NonExclusiveDeviationAlarmType_AckedState_Number = init(10406);
    public static final NodeId NonExclusiveDeviationAlarmType_AckedState_EffectiveDisplayName = init(10407);
    public static final NodeId NonExclusiveDeviationAlarmType_AckedState_TransitionTime = init(10408);
    public static final NodeId NonExclusiveDeviationAlarmType_AckedState_EffectiveTransitionTime = init(10409);
    public static final NodeId NonExclusiveDeviationAlarmType_AckedState_TrueState = init(10410);
    public static final NodeId NonExclusiveDeviationAlarmType_AckedState_FalseState = init(10411);
    public static final NodeId NonExclusiveDeviationAlarmType_ConfirmedState = init(10412);
    public static final NodeId NonExclusiveDeviationAlarmType_ConfirmedState_Id = init(10413);
    public static final NodeId NonExclusiveDeviationAlarmType_ConfirmedState_Name = init(10414);
    public static final NodeId NonExclusiveDeviationAlarmType_ConfirmedState_Number = init(10415);
    public static final NodeId NonExclusiveDeviationAlarmType_ConfirmedState_EffectiveDisplayName = init(10416);
    public static final NodeId NonExclusiveDeviationAlarmType_ConfirmedState_TransitionTime = init(10417);
    public static final NodeId NonExclusiveDeviationAlarmType_ConfirmedState_EffectiveTransitionTime = init(10418);
    public static final NodeId NonExclusiveDeviationAlarmType_ConfirmedState_TrueState = init(10419);
    public static final NodeId NonExclusiveDeviationAlarmType_ConfirmedState_FalseState = init(10420);
    public static final NodeId NonExclusiveDeviationAlarmType_Acknowledge = init(10421);
    public static final NodeId NonExclusiveDeviationAlarmType_Acknowledge_InputArguments = init(10422);
    public static final NodeId NonExclusiveDeviationAlarmType_Confirm = init(10423);
    public static final NodeId NonExclusiveDeviationAlarmType_Confirm_InputArguments = init(10424);
    public static final NodeId NonExclusiveDeviationAlarmType_ActiveState = init(10425);
    public static final NodeId NonExclusiveDeviationAlarmType_ActiveState_Id = init(10426);
    public static final NodeId NonExclusiveDeviationAlarmType_ActiveState_Name = init(10427);
    public static final NodeId NonExclusiveDeviationAlarmType_ActiveState_Number = init(10428);
    public static final NodeId NonExclusiveDeviationAlarmType_ActiveState_EffectiveDisplayName = init(10429);
    public static final NodeId NonExclusiveDeviationAlarmType_ActiveState_TransitionTime = init(10430);
    public static final NodeId NonExclusiveDeviationAlarmType_ActiveState_EffectiveTransitionTime = init(10431);
    public static final NodeId NonExclusiveDeviationAlarmType_ActiveState_TrueState = init(10432);
    public static final NodeId NonExclusiveDeviationAlarmType_ActiveState_FalseState = init(10433);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedState = init(10434);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedState_Id = init(10435);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedState_Name = init(10436);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedState_Number = init(10437);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedState_EffectiveDisplayName = init(10438);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedState_TransitionTime = init(10439);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedState_EffectiveTransitionTime = init(10440);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedState_TrueState = init(10441);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedState_FalseState = init(10442);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState = init(10443);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_CurrentState = init(10444);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_CurrentState_Id = init(10445);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_CurrentState_Name = init(10446);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_CurrentState_Number = init(10447);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(
        10448
    );
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_LastTransition = init(10449);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_LastTransition_Id = init(10450);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_LastTransition_Name = init(10451);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_LastTransition_Number = init(10452);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_LastTransition_TransitionTime = init(10453);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_UnshelveTime = init(10454);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_Unshelve = init(10476);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_OneShotShelve = init(10477);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_TimedShelve = init(10478);
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_TimedShelve_InputArguments = init(10479);
    public static final NodeId NonExclusiveDeviationAlarmType_SuppressedOrShelved = init(10480);
    public static final NodeId NonExclusiveDeviationAlarmType_MaxTimeShelved = init(10481);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighState = init(10482);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighState_Id = init(10483);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighState_Name = init(10484);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighState_Number = init(10485);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighState_EffectiveDisplayName = init(10486);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighState_TransitionTime = init(10487);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighState_EffectiveTransitionTime = init(10488);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighState_TrueState = init(10489);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighState_FalseState = init(10490);
    public static final NodeId NonExclusiveDeviationAlarmType_HighState = init(10491);
    public static final NodeId NonExclusiveDeviationAlarmType_HighState_Id = init(10492);
    public static final NodeId NonExclusiveDeviationAlarmType_HighState_Name = init(10493);
    public static final NodeId NonExclusiveDeviationAlarmType_HighState_Number = init(10494);
    public static final NodeId NonExclusiveDeviationAlarmType_HighState_EffectiveDisplayName = init(10495);
    public static final NodeId NonExclusiveDeviationAlarmType_HighState_TransitionTime = init(10496);
    public static final NodeId NonExclusiveDeviationAlarmType_HighState_EffectiveTransitionTime = init(10497);
    public static final NodeId NonExclusiveDeviationAlarmType_HighState_TrueState = init(10498);
    public static final NodeId NonExclusiveDeviationAlarmType_HighState_FalseState = init(10499);
    public static final NodeId NonExclusiveDeviationAlarmType_LowState = init(10500);
    public static final NodeId NonExclusiveDeviationAlarmType_LowState_Id = init(10501);
    public static final NodeId NonExclusiveDeviationAlarmType_LowState_Name = init(10502);
    public static final NodeId NonExclusiveDeviationAlarmType_LowState_Number = init(10503);
    public static final NodeId NonExclusiveDeviationAlarmType_LowState_EffectiveDisplayName = init(10504);
    public static final NodeId NonExclusiveDeviationAlarmType_LowState_TransitionTime = init(10505);
    public static final NodeId NonExclusiveDeviationAlarmType_LowState_EffectiveTransitionTime = init(10506);
    public static final NodeId NonExclusiveDeviationAlarmType_LowState_TrueState = init(10507);
    public static final NodeId NonExclusiveDeviationAlarmType_LowState_FalseState = init(10508);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowState = init(10509);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowState_Id = init(10510);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowState_Name = init(10511);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowState_Number = init(10512);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowState_EffectiveDisplayName = init(10513);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowState_TransitionTime = init(10514);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowState_EffectiveTransitionTime = init(10515);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowState_TrueState = init(10516);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowState_FalseState = init(10517);
    public static final NodeId NonExclusiveDeviationAlarmType_HighHighLimit = init(10518);
    public static final NodeId NonExclusiveDeviationAlarmType_HighLimit = init(10519);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLimit = init(10520);
    public static final NodeId NonExclusiveDeviationAlarmType_LowLowLimit = init(10521);
    public static final NodeId NonExclusiveDeviationAlarmType_SetpointNode = init(10522);
    public static final NodeId DiscreteAlarmType = init(10523);
    public static final NodeId DiscreteAlarmType_EventId = init(10524);
    public static final NodeId DiscreteAlarmType_EventType = init(10525);
    public static final NodeId DiscreteAlarmType_SourceNode = init(10526);
    public static final NodeId DiscreteAlarmType_SourceName = init(10527);
    public static final NodeId DiscreteAlarmType_Time = init(10528);
    public static final NodeId DiscreteAlarmType_ReceiveTime = init(10529);
    public static final NodeId DiscreteAlarmType_LocalTime = init(10530);
    public static final NodeId DiscreteAlarmType_Message = init(10531);
    public static final NodeId DiscreteAlarmType_Severity = init(10532);
    public static final NodeId DiscreteAlarmType_ConditionName = init(10533);
    public static final NodeId DiscreteAlarmType_BranchId = init(10534);
    public static final NodeId DiscreteAlarmType_Retain = init(10535);
    public static final NodeId DiscreteAlarmType_EnabledState = init(10536);
    public static final NodeId DiscreteAlarmType_EnabledState_Id = init(10537);
    public static final NodeId DiscreteAlarmType_EnabledState_Name = init(10538);
    public static final NodeId DiscreteAlarmType_EnabledState_Number = init(10539);
    public static final NodeId DiscreteAlarmType_EnabledState_EffectiveDisplayName = init(10540);
    public static final NodeId DiscreteAlarmType_EnabledState_TransitionTime = init(10541);
    public static final NodeId DiscreteAlarmType_EnabledState_EffectiveTransitionTime = init(10542);
    public static final NodeId DiscreteAlarmType_EnabledState_TrueState = init(10543);
    public static final NodeId DiscreteAlarmType_EnabledState_FalseState = init(10544);
    public static final NodeId DiscreteAlarmType_Quality = init(10545);
    public static final NodeId DiscreteAlarmType_Quality_SourceTimestamp = init(10546);
    public static final NodeId DiscreteAlarmType_LastSeverity = init(10547);
    public static final NodeId DiscreteAlarmType_LastSeverity_SourceTimestamp = init(10548);
    public static final NodeId DiscreteAlarmType_Comment = init(10549);
    public static final NodeId DiscreteAlarmType_Comment_SourceTimestamp = init(10550);
    public static final NodeId DiscreteAlarmType_ClientUserId = init(10551);
    public static final NodeId DiscreteAlarmType_Enable = init(10552);
    public static final NodeId DiscreteAlarmType_Disable = init(10553);
    public static final NodeId DiscreteAlarmType_AddComment = init(10554);
    public static final NodeId DiscreteAlarmType_AddComment_InputArguments = init(10555);
    public static final NodeId DiscreteAlarmType_ConditionRefresh = init(10556);
    public static final NodeId DiscreteAlarmType_ConditionRefresh_InputArguments = init(10557);
    public static final NodeId DiscreteAlarmType_AckedState = init(10558);
    public static final NodeId DiscreteAlarmType_AckedState_Id = init(10559);
    public static final NodeId DiscreteAlarmType_AckedState_Name = init(10560);
    public static final NodeId DiscreteAlarmType_AckedState_Number = init(10561);
    public static final NodeId DiscreteAlarmType_AckedState_EffectiveDisplayName = init(10562);
    public static final NodeId DiscreteAlarmType_AckedState_TransitionTime = init(10563);
    public static final NodeId DiscreteAlarmType_AckedState_EffectiveTransitionTime = init(10564);
    public static final NodeId DiscreteAlarmType_AckedState_TrueState = init(10565);
    public static final NodeId DiscreteAlarmType_AckedState_FalseState = init(10566);
    public static final NodeId DiscreteAlarmType_ConfirmedState = init(10567);
    public static final NodeId DiscreteAlarmType_ConfirmedState_Id = init(10568);
    public static final NodeId DiscreteAlarmType_ConfirmedState_Name = init(10569);
    public static final NodeId DiscreteAlarmType_ConfirmedState_Number = init(10570);
    public static final NodeId DiscreteAlarmType_ConfirmedState_EffectiveDisplayName = init(10571);
    public static final NodeId DiscreteAlarmType_ConfirmedState_TransitionTime = init(10572);
    public static final NodeId DiscreteAlarmType_ConfirmedState_EffectiveTransitionTime = init(10573);
    public static final NodeId DiscreteAlarmType_ConfirmedState_TrueState = init(10574);
    public static final NodeId DiscreteAlarmType_ConfirmedState_FalseState = init(10575);
    public static final NodeId DiscreteAlarmType_Acknowledge = init(10576);
    public static final NodeId DiscreteAlarmType_Acknowledge_InputArguments = init(10577);
    public static final NodeId DiscreteAlarmType_Confirm = init(10578);
    public static final NodeId DiscreteAlarmType_Confirm_InputArguments = init(10579);
    public static final NodeId DiscreteAlarmType_ActiveState = init(10580);
    public static final NodeId DiscreteAlarmType_ActiveState_Id = init(10581);
    public static final NodeId DiscreteAlarmType_ActiveState_Name = init(10582);
    public static final NodeId DiscreteAlarmType_ActiveState_Number = init(10583);
    public static final NodeId DiscreteAlarmType_ActiveState_EffectiveDisplayName = init(10584);
    public static final NodeId DiscreteAlarmType_ActiveState_TransitionTime = init(10585);
    public static final NodeId DiscreteAlarmType_ActiveState_EffectiveTransitionTime = init(10586);
    public static final NodeId DiscreteAlarmType_ActiveState_TrueState = init(10587);
    public static final NodeId DiscreteAlarmType_ActiveState_FalseState = init(10588);
    public static final NodeId DiscreteAlarmType_SuppressedState = init(10589);
    public static final NodeId DiscreteAlarmType_SuppressedState_Id = init(10590);
    public static final NodeId DiscreteAlarmType_SuppressedState_Name = init(10591);
    public static final NodeId DiscreteAlarmType_SuppressedState_Number = init(10592);
    public static final NodeId DiscreteAlarmType_SuppressedState_EffectiveDisplayName = init(10593);
    public static final NodeId DiscreteAlarmType_SuppressedState_TransitionTime = init(10594);
    public static final NodeId DiscreteAlarmType_SuppressedState_EffectiveTransitionTime = init(10595);
    public static final NodeId DiscreteAlarmType_SuppressedState_TrueState = init(10596);
    public static final NodeId DiscreteAlarmType_SuppressedState_FalseState = init(10597);
    public static final NodeId DiscreteAlarmType_ShelvingState = init(10598);
    public static final NodeId DiscreteAlarmType_ShelvingState_CurrentState = init(10599);
    public static final NodeId DiscreteAlarmType_ShelvingState_CurrentState_Id = init(10600);
    public static final NodeId DiscreteAlarmType_ShelvingState_CurrentState_Name = init(10601);
    public static final NodeId DiscreteAlarmType_ShelvingState_CurrentState_Number = init(10602);
    public static final NodeId DiscreteAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(10603);
    public static final NodeId DiscreteAlarmType_ShelvingState_LastTransition = init(10604);
    public static final NodeId DiscreteAlarmType_ShelvingState_LastTransition_Id = init(10605);
    public static final NodeId DiscreteAlarmType_ShelvingState_LastTransition_Name = init(10606);
    public static final NodeId DiscreteAlarmType_ShelvingState_LastTransition_Number = init(10607);
    public static final NodeId DiscreteAlarmType_ShelvingState_LastTransition_TransitionTime = init(10608);
    public static final NodeId DiscreteAlarmType_ShelvingState_UnshelveTime = init(10609);
    public static final NodeId DiscreteAlarmType_ShelvingState_Unshelve = init(10631);
    public static final NodeId DiscreteAlarmType_ShelvingState_OneShotShelve = init(10632);
    public static final NodeId DiscreteAlarmType_ShelvingState_TimedShelve = init(10633);
    public static final NodeId DiscreteAlarmType_ShelvingState_TimedShelve_InputArguments = init(10634);
    public static final NodeId DiscreteAlarmType_SuppressedOrShelved = init(10635);
    public static final NodeId DiscreteAlarmType_MaxTimeShelved = init(10636);
    public static final NodeId OffNormalAlarmType = init(10637);
    public static final NodeId OffNormalAlarmType_EventId = init(10638);
    public static final NodeId OffNormalAlarmType_EventType = init(10639);
    public static final NodeId OffNormalAlarmType_SourceNode = init(10640);
    public static final NodeId OffNormalAlarmType_SourceName = init(10641);
    public static final NodeId OffNormalAlarmType_Time = init(10642);
    public static final NodeId OffNormalAlarmType_ReceiveTime = init(10643);
    public static final NodeId OffNormalAlarmType_LocalTime = init(10644);
    public static final NodeId OffNormalAlarmType_Message = init(10645);
    public static final NodeId OffNormalAlarmType_Severity = init(10646);
    public static final NodeId OffNormalAlarmType_ConditionName = init(10647);
    public static final NodeId OffNormalAlarmType_BranchId = init(10648);
    public static final NodeId OffNormalAlarmType_Retain = init(10649);
    public static final NodeId OffNormalAlarmType_EnabledState = init(10650);
    public static final NodeId OffNormalAlarmType_EnabledState_Id = init(10651);
    public static final NodeId OffNormalAlarmType_EnabledState_Name = init(10652);
    public static final NodeId OffNormalAlarmType_EnabledState_Number = init(10653);
    public static final NodeId OffNormalAlarmType_EnabledState_EffectiveDisplayName = init(10654);
    public static final NodeId OffNormalAlarmType_EnabledState_TransitionTime = init(10655);
    public static final NodeId OffNormalAlarmType_EnabledState_EffectiveTransitionTime = init(10656);
    public static final NodeId OffNormalAlarmType_EnabledState_TrueState = init(10657);
    public static final NodeId OffNormalAlarmType_EnabledState_FalseState = init(10658);
    public static final NodeId OffNormalAlarmType_Quality = init(10659);
    public static final NodeId OffNormalAlarmType_Quality_SourceTimestamp = init(10660);
    public static final NodeId OffNormalAlarmType_LastSeverity = init(10661);
    public static final NodeId OffNormalAlarmType_LastSeverity_SourceTimestamp = init(10662);
    public static final NodeId OffNormalAlarmType_Comment = init(10663);
    public static final NodeId OffNormalAlarmType_Comment_SourceTimestamp = init(10664);
    public static final NodeId OffNormalAlarmType_ClientUserId = init(10665);
    public static final NodeId OffNormalAlarmType_Enable = init(10666);
    public static final NodeId OffNormalAlarmType_Disable = init(10667);
    public static final NodeId OffNormalAlarmType_AddComment = init(10668);
    public static final NodeId OffNormalAlarmType_AddComment_InputArguments = init(10669);
    public static final NodeId OffNormalAlarmType_ConditionRefresh = init(10670);
    public static final NodeId OffNormalAlarmType_ConditionRefresh_InputArguments = init(10671);
    public static final NodeId OffNormalAlarmType_AckedState = init(10672);
    public static final NodeId OffNormalAlarmType_AckedState_Id = init(10673);
    public static final NodeId OffNormalAlarmType_AckedState_Name = init(10674);
    public static final NodeId OffNormalAlarmType_AckedState_Number = init(10675);
    public static final NodeId OffNormalAlarmType_AckedState_EffectiveDisplayName = init(10676);
    public static final NodeId OffNormalAlarmType_AckedState_TransitionTime = init(10677);
    public static final NodeId OffNormalAlarmType_AckedState_EffectiveTransitionTime = init(10678);
    public static final NodeId OffNormalAlarmType_AckedState_TrueState = init(10679);
    public static final NodeId OffNormalAlarmType_AckedState_FalseState = init(10680);
    public static final NodeId OffNormalAlarmType_ConfirmedState = init(10681);
    public static final NodeId OffNormalAlarmType_ConfirmedState_Id = init(10682);
    public static final NodeId OffNormalAlarmType_ConfirmedState_Name = init(10683);
    public static final NodeId OffNormalAlarmType_ConfirmedState_Number = init(10684);
    public static final NodeId OffNormalAlarmType_ConfirmedState_EffectiveDisplayName = init(10685);
    public static final NodeId OffNormalAlarmType_ConfirmedState_TransitionTime = init(10686);
    public static final NodeId OffNormalAlarmType_ConfirmedState_EffectiveTransitionTime = init(10687);
    public static final NodeId OffNormalAlarmType_ConfirmedState_TrueState = init(10688);
    public static final NodeId OffNormalAlarmType_ConfirmedState_FalseState = init(10689);
    public static final NodeId OffNormalAlarmType_Acknowledge = init(10690);
    public static final NodeId OffNormalAlarmType_Acknowledge_InputArguments = init(10691);
    public static final NodeId OffNormalAlarmType_Confirm = init(10692);
    public static final NodeId OffNormalAlarmType_Confirm_InputArguments = init(10693);
    public static final NodeId OffNormalAlarmType_ActiveState = init(10694);
    public static final NodeId OffNormalAlarmType_ActiveState_Id = init(10695);
    public static final NodeId OffNormalAlarmType_ActiveState_Name = init(10696);
    public static final NodeId OffNormalAlarmType_ActiveState_Number = init(10697);
    public static final NodeId OffNormalAlarmType_ActiveState_EffectiveDisplayName = init(10698);
    public static final NodeId OffNormalAlarmType_ActiveState_TransitionTime = init(10699);
    public static final NodeId OffNormalAlarmType_ActiveState_EffectiveTransitionTime = init(10700);
    public static final NodeId OffNormalAlarmType_ActiveState_TrueState = init(10701);
    public static final NodeId OffNormalAlarmType_ActiveState_FalseState = init(10702);
    public static final NodeId OffNormalAlarmType_SuppressedState = init(10703);
    public static final NodeId OffNormalAlarmType_SuppressedState_Id = init(10704);
    public static final NodeId OffNormalAlarmType_SuppressedState_Name = init(10705);
    public static final NodeId OffNormalAlarmType_SuppressedState_Number = init(10706);
    public static final NodeId OffNormalAlarmType_SuppressedState_EffectiveDisplayName = init(10707);
    public static final NodeId OffNormalAlarmType_SuppressedState_TransitionTime = init(10708);
    public static final NodeId OffNormalAlarmType_SuppressedState_EffectiveTransitionTime = init(10709);
    public static final NodeId OffNormalAlarmType_SuppressedState_TrueState = init(10710);
    public static final NodeId OffNormalAlarmType_SuppressedState_FalseState = init(10711);
    public static final NodeId OffNormalAlarmType_ShelvingState = init(10712);
    public static final NodeId OffNormalAlarmType_ShelvingState_CurrentState = init(10713);
    public static final NodeId OffNormalAlarmType_ShelvingState_CurrentState_Id = init(10714);
    public static final NodeId OffNormalAlarmType_ShelvingState_CurrentState_Name = init(10715);
    public static final NodeId OffNormalAlarmType_ShelvingState_CurrentState_Number = init(10716);
    public static final NodeId OffNormalAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(10717);
    public static final NodeId OffNormalAlarmType_ShelvingState_LastTransition = init(10718);
    public static final NodeId OffNormalAlarmType_ShelvingState_LastTransition_Id = init(10719);
    public static final NodeId OffNormalAlarmType_ShelvingState_LastTransition_Name = init(10720);
    public static final NodeId OffNormalAlarmType_ShelvingState_LastTransition_Number = init(10721);
    public static final NodeId OffNormalAlarmType_ShelvingState_LastTransition_TransitionTime = init(10722);
    public static final NodeId OffNormalAlarmType_ShelvingState_UnshelveTime = init(10723);
    public static final NodeId OffNormalAlarmType_ShelvingState_Unshelve = init(10745);
    public static final NodeId OffNormalAlarmType_ShelvingState_OneShotShelve = init(10746);
    public static final NodeId OffNormalAlarmType_ShelvingState_TimedShelve = init(10747);
    public static final NodeId OffNormalAlarmType_ShelvingState_TimedShelve_InputArguments = init(10748);
    public static final NodeId OffNormalAlarmType_SuppressedOrShelved = init(10749);
    public static final NodeId OffNormalAlarmType_MaxTimeShelved = init(10750);
    public static final NodeId TripAlarmType = init(10751);
    public static final NodeId TripAlarmType_EventId = init(10752);
    public static final NodeId TripAlarmType_EventType = init(10753);
    public static final NodeId TripAlarmType_SourceNode = init(10754);
    public static final NodeId TripAlarmType_SourceName = init(10755);
    public static final NodeId TripAlarmType_Time = init(10756);
    public static final NodeId TripAlarmType_ReceiveTime = init(10757);
    public static final NodeId TripAlarmType_LocalTime = init(10758);
    public static final NodeId TripAlarmType_Message = init(10759);
    public static final NodeId TripAlarmType_Severity = init(10760);
    public static final NodeId TripAlarmType_ConditionName = init(10761);
    public static final NodeId TripAlarmType_BranchId = init(10762);
    public static final NodeId TripAlarmType_Retain = init(10763);
    public static final NodeId TripAlarmType_EnabledState = init(10764);
    public static final NodeId TripAlarmType_EnabledState_Id = init(10765);
    public static final NodeId TripAlarmType_EnabledState_Name = init(10766);
    public static final NodeId TripAlarmType_EnabledState_Number = init(10767);
    public static final NodeId TripAlarmType_EnabledState_EffectiveDisplayName = init(10768);
    public static final NodeId TripAlarmType_EnabledState_TransitionTime = init(10769);
    public static final NodeId TripAlarmType_EnabledState_EffectiveTransitionTime = init(10770);
    public static final NodeId TripAlarmType_EnabledState_TrueState = init(10771);
    public static final NodeId TripAlarmType_EnabledState_FalseState = init(10772);
    public static final NodeId TripAlarmType_Quality = init(10773);
    public static final NodeId TripAlarmType_Quality_SourceTimestamp = init(10774);
    public static final NodeId TripAlarmType_LastSeverity = init(10775);
    public static final NodeId TripAlarmType_LastSeverity_SourceTimestamp = init(10776);
    public static final NodeId TripAlarmType_Comment = init(10777);
    public static final NodeId TripAlarmType_Comment_SourceTimestamp = init(10778);
    public static final NodeId TripAlarmType_ClientUserId = init(10779);
    public static final NodeId TripAlarmType_Enable = init(10780);
    public static final NodeId TripAlarmType_Disable = init(10781);
    public static final NodeId TripAlarmType_AddComment = init(10782);
    public static final NodeId TripAlarmType_AddComment_InputArguments = init(10783);
    public static final NodeId TripAlarmType_ConditionRefresh = init(10784);
    public static final NodeId TripAlarmType_ConditionRefresh_InputArguments = init(10785);
    public static final NodeId TripAlarmType_AckedState = init(10786);
    public static final NodeId TripAlarmType_AckedState_Id = init(10787);
    public static final NodeId TripAlarmType_AckedState_Name = init(10788);
    public static final NodeId TripAlarmType_AckedState_Number = init(10789);
    public static final NodeId TripAlarmType_AckedState_EffectiveDisplayName = init(10790);
    public static final NodeId TripAlarmType_AckedState_TransitionTime = init(10791);
    public static final NodeId TripAlarmType_AckedState_EffectiveTransitionTime = init(10792);
    public static final NodeId TripAlarmType_AckedState_TrueState = init(10793);
    public static final NodeId TripAlarmType_AckedState_FalseState = init(10794);
    public static final NodeId TripAlarmType_ConfirmedState = init(10795);
    public static final NodeId TripAlarmType_ConfirmedState_Id = init(10796);
    public static final NodeId TripAlarmType_ConfirmedState_Name = init(10797);
    public static final NodeId TripAlarmType_ConfirmedState_Number = init(10798);
    public static final NodeId TripAlarmType_ConfirmedState_EffectiveDisplayName = init(10799);
    public static final NodeId TripAlarmType_ConfirmedState_TransitionTime = init(10800);
    public static final NodeId TripAlarmType_ConfirmedState_EffectiveTransitionTime = init(10801);
    public static final NodeId TripAlarmType_ConfirmedState_TrueState = init(10802);
    public static final NodeId TripAlarmType_ConfirmedState_FalseState = init(10803);
    public static final NodeId TripAlarmType_Acknowledge = init(10804);
    public static final NodeId TripAlarmType_Acknowledge_InputArguments = init(10805);
    public static final NodeId TripAlarmType_Confirm = init(10806);
    public static final NodeId TripAlarmType_Confirm_InputArguments = init(10807);
    public static final NodeId TripAlarmType_ActiveState = init(10808);
    public static final NodeId TripAlarmType_ActiveState_Id = init(10809);
    public static final NodeId TripAlarmType_ActiveState_Name = init(10810);
    public static final NodeId TripAlarmType_ActiveState_Number = init(10811);
    public static final NodeId TripAlarmType_ActiveState_EffectiveDisplayName = init(10812);
    public static final NodeId TripAlarmType_ActiveState_TransitionTime = init(10813);
    public static final NodeId TripAlarmType_ActiveState_EffectiveTransitionTime = init(10814);
    public static final NodeId TripAlarmType_ActiveState_TrueState = init(10815);
    public static final NodeId TripAlarmType_ActiveState_FalseState = init(10816);
    public static final NodeId TripAlarmType_SuppressedState = init(10817);
    public static final NodeId TripAlarmType_SuppressedState_Id = init(10818);
    public static final NodeId TripAlarmType_SuppressedState_Name = init(10819);
    public static final NodeId TripAlarmType_SuppressedState_Number = init(10820);
    public static final NodeId TripAlarmType_SuppressedState_EffectiveDisplayName = init(10821);
    public static final NodeId TripAlarmType_SuppressedState_TransitionTime = init(10822);
    public static final NodeId TripAlarmType_SuppressedState_EffectiveTransitionTime = init(10823);
    public static final NodeId TripAlarmType_SuppressedState_TrueState = init(10824);
    public static final NodeId TripAlarmType_SuppressedState_FalseState = init(10825);
    public static final NodeId TripAlarmType_ShelvingState = init(10826);
    public static final NodeId TripAlarmType_ShelvingState_CurrentState = init(10827);
    public static final NodeId TripAlarmType_ShelvingState_CurrentState_Id = init(10828);
    public static final NodeId TripAlarmType_ShelvingState_CurrentState_Name = init(10829);
    public static final NodeId TripAlarmType_ShelvingState_CurrentState_Number = init(10830);
    public static final NodeId TripAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(10831);
    public static final NodeId TripAlarmType_ShelvingState_LastTransition = init(10832);
    public static final NodeId TripAlarmType_ShelvingState_LastTransition_Id = init(10833);
    public static final NodeId TripAlarmType_ShelvingState_LastTransition_Name = init(10834);
    public static final NodeId TripAlarmType_ShelvingState_LastTransition_Number = init(10835);
    public static final NodeId TripAlarmType_ShelvingState_LastTransition_TransitionTime = init(10836);
    public static final NodeId TripAlarmType_ShelvingState_UnshelveTime = init(10837);
    public static final NodeId TripAlarmType_ShelvingState_Unshelve = init(10859);
    public static final NodeId TripAlarmType_ShelvingState_OneShotShelve = init(10860);
    public static final NodeId TripAlarmType_ShelvingState_TimedShelve = init(10861);
    public static final NodeId TripAlarmType_ShelvingState_TimedShelve_InputArguments = init(10862);
    public static final NodeId TripAlarmType_SuppressedOrShelved = init(10863);
    public static final NodeId TripAlarmType_MaxTimeShelved = init(10864);
    public static final NodeId AuditConditionShelvingEventType = init(11093);
    public static final NodeId AuditConditionShelvingEventType_EventId = init(11094);
    public static final NodeId AuditConditionShelvingEventType_EventType = init(11095);
    public static final NodeId AuditConditionShelvingEventType_SourceNode = init(11096);
    public static final NodeId AuditConditionShelvingEventType_SourceName = init(11097);
    public static final NodeId AuditConditionShelvingEventType_Time = init(11098);
    public static final NodeId AuditConditionShelvingEventType_ReceiveTime = init(11099);
    public static final NodeId AuditConditionShelvingEventType_LocalTime = init(11100);
    public static final NodeId AuditConditionShelvingEventType_Message = init(11101);
    public static final NodeId AuditConditionShelvingEventType_Severity = init(11102);
    public static final NodeId AuditConditionShelvingEventType_ActionTimeStamp = init(11103);
    public static final NodeId AuditConditionShelvingEventType_Status = init(11104);
    public static final NodeId AuditConditionShelvingEventType_ServerId = init(11105);
    public static final NodeId AuditConditionShelvingEventType_ClientAuditEntryId = init(11106);
    public static final NodeId AuditConditionShelvingEventType_ClientUserId = init(11107);
    public static final NodeId AuditConditionShelvingEventType_MethodId = init(11108);
    public static final NodeId AuditConditionShelvingEventType_InputArguments = init(11109);
    public static final NodeId TwoStateVariableType_TrueState = init(11110);
    public static final NodeId TwoStateVariableType_FalseState = init(11111);
    public static final NodeId ConditionType_ConditionClassId = init(11112);
    public static final NodeId ConditionType_ConditionClassName = init(11113);
    public static final NodeId DialogConditionType_ConditionClassId = init(11114);
    public static final NodeId DialogConditionType_ConditionClassName = init(11115);
    public static final NodeId AcknowledgeableConditionType_ConditionClassId = init(11116);
    public static final NodeId AcknowledgeableConditionType_ConditionClassName = init(11117);
    public static final NodeId AlarmConditionType_ConditionClassId = init(11118);
    public static final NodeId AlarmConditionType_ConditionClassName = init(11119);
    public static final NodeId AlarmConditionType_InputNode = init(11120);
    public static final NodeId LimitAlarmType_ConditionClassId = init(11121);
    public static final NodeId LimitAlarmType_ConditionClassName = init(11122);
    public static final NodeId LimitAlarmType_InputNode = init(11123);
    public static final NodeId LimitAlarmType_HighHighLimit = init(11124);
    public static final NodeId LimitAlarmType_HighLimit = init(11125);
    public static final NodeId LimitAlarmType_LowLimit = init(11126);
    public static final NodeId LimitAlarmType_LowLowLimit = init(11127);
    public static final NodeId ExclusiveLimitAlarmType_ConditionClassId = init(11128);
    public static final NodeId ExclusiveLimitAlarmType_ConditionClassName = init(11129);
    public static final NodeId ExclusiveLimitAlarmType_InputNode = init(11130);
    public static final NodeId ExclusiveLevelAlarmType_ConditionClassId = init(11131);
    public static final NodeId ExclusiveLevelAlarmType_ConditionClassName = init(11132);
    public static final NodeId ExclusiveLevelAlarmType_InputNode = init(11133);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConditionClassId = init(11134);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConditionClassName = init(11135);
    public static final NodeId ExclusiveRateOfChangeAlarmType_InputNode = init(11136);
    public static final NodeId ExclusiveDeviationAlarmType_ConditionClassId = init(11137);
    public static final NodeId ExclusiveDeviationAlarmType_ConditionClassName = init(11138);
    public static final NodeId ExclusiveDeviationAlarmType_InputNode = init(11139);
    public static final NodeId NonExclusiveLimitAlarmType_ConditionClassId = init(11140);
    public static final NodeId NonExclusiveLimitAlarmType_ConditionClassName = init(11141);
    public static final NodeId NonExclusiveLimitAlarmType_InputNode = init(11142);
    public static final NodeId NonExclusiveLevelAlarmType_ConditionClassId = init(11143);
    public static final NodeId NonExclusiveLevelAlarmType_ConditionClassName = init(11144);
    public static final NodeId NonExclusiveLevelAlarmType_InputNode = init(11145);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConditionClassId = init(11146);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConditionClassName = init(11147);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_InputNode = init(11148);
    public static final NodeId NonExclusiveDeviationAlarmType_ConditionClassId = init(11149);
    public static final NodeId NonExclusiveDeviationAlarmType_ConditionClassName = init(11150);
    public static final NodeId NonExclusiveDeviationAlarmType_InputNode = init(11151);
    public static final NodeId DiscreteAlarmType_ConditionClassId = init(11152);
    public static final NodeId DiscreteAlarmType_ConditionClassName = init(11153);
    public static final NodeId DiscreteAlarmType_InputNode = init(11154);
    public static final NodeId OffNormalAlarmType_ConditionClassId = init(11155);
    public static final NodeId OffNormalAlarmType_ConditionClassName = init(11156);
    public static final NodeId OffNormalAlarmType_InputNode = init(11157);
    public static final NodeId OffNormalAlarmType_NormalState = init(11158);
    public static final NodeId TripAlarmType_ConditionClassId = init(11159);
    public static final NodeId TripAlarmType_ConditionClassName = init(11160);
    public static final NodeId TripAlarmType_InputNode = init(11161);
    public static final NodeId TripAlarmType_NormalState = init(11162);
    public static final NodeId BaseConditionClassType = init(11163);
    public static final NodeId ProcessConditionClassType = init(11164);
    public static final NodeId MaintenanceConditionClassType = init(11165);
    public static final NodeId SystemConditionClassType = init(11166);
    public static final NodeId HistoricalDataConfigurationType_AggregateConfiguration_TreatUncertainAsBad = init(11168);
    public static final NodeId HistoricalDataConfigurationType_AggregateConfiguration_PercentDataBad = init(11169);
    public static final NodeId HistoricalDataConfigurationType_AggregateConfiguration_PercentDataGood = init(11170);
    public static final NodeId HistoricalDataConfigurationType_AggregateConfiguration_UseSlopedExtrapolation = init(
        11171
    );
    public static final NodeId HistoryServerCapabilitiesType_AggregateFunctions = init(11172);
    public static final NodeId AggregateConfigurationType = init(11187);
    public static final NodeId AggregateConfigurationType_TreatUncertainAsBad = init(11188);
    public static final NodeId AggregateConfigurationType_PercentDataBad = init(11189);
    public static final NodeId AggregateConfigurationType_PercentDataGood = init(11190);
    public static final NodeId AggregateConfigurationType_UseSlopedExtrapolation = init(11191);
    public static final NodeId HistoryServerCapabilities = init(11192);
    public static final NodeId HistoryServerCapabilities_AccessHistoryDataCapability = init(11193);
    public static final NodeId HistoryServerCapabilities_InsertDataCapability = init(11196);
    public static final NodeId HistoryServerCapabilities_ReplaceDataCapability = init(11197);
    public static final NodeId HistoryServerCapabilities_UpdateDataCapability = init(11198);
    public static final NodeId HistoryServerCapabilities_DeleteRawCapability = init(11199);
    public static final NodeId HistoryServerCapabilities_DeleteAtTimeCapability = init(11200);
    public static final NodeId HistoryServerCapabilities_AggregateFunctions = init(11201);
    public static final NodeId HAConfiguration = init(11202);
    public static final NodeId HAConfiguration_AggregateConfiguration = init(11203);
    public static final NodeId HAConfiguration_AggregateConfiguration_TreatUncertainAsBad = init(11204);
    public static final NodeId HAConfiguration_AggregateConfiguration_PercentDataBad = init(11205);
    public static final NodeId HAConfiguration_AggregateConfiguration_PercentDataGood = init(11206);
    public static final NodeId HAConfiguration_AggregateConfiguration_UseSlopedExtrapolation = init(11207);
    public static final NodeId HAConfiguration_Stepped = init(11208);
    public static final NodeId HAConfiguration_Definition = init(11209);
    public static final NodeId HAConfiguration_MaxTimeInterval = init(11210);
    public static final NodeId HAConfiguration_MinTimeInterval = init(11211);
    public static final NodeId HAConfiguration_ExceptionDeviation = init(11212);
    public static final NodeId HAConfiguration_ExceptionDeviationFormat = init(11213);
    public static final NodeId Annotations = init(11214);
    public static final NodeId HistoricalEventFilter = init(11215);
    public static final NodeId ModificationInfo = init(11216);
    public static final NodeId HistoryModifiedData = init(11217);
    public static final NodeId ModificationInfo_Encoding_DefaultXml = init(11218);
    public static final NodeId HistoryModifiedData_Encoding_DefaultXml = init(11219);
    public static final NodeId ModificationInfo_Encoding_DefaultBinary = init(11226);
    public static final NodeId HistoryModifiedData_Encoding_DefaultBinary = init(11227);
    public static final NodeId HistoryUpdateType = init(11234);
    public static final NodeId MultiStateValueDiscreteType = init(11238);
    public static final NodeId MultiStateValueDiscreteType_Definition = init(11239);
    public static final NodeId MultiStateValueDiscreteType_ValuePrecision = init(11240);
    public static final NodeId MultiStateValueDiscreteType_EnumValues = init(11241);
    public static final NodeId HistoryServerCapabilities_AccessHistoryEventsCapability = init(11242);
    public static final NodeId HistoryServerCapabilitiesType_MaxReturnDataValues = init(11268);
    public static final NodeId HistoryServerCapabilitiesType_MaxReturnEventValues = init(11269);
    public static final NodeId HistoryServerCapabilitiesType_InsertAnnotationCapability = init(11270);
    public static final NodeId HistoryServerCapabilities_MaxReturnDataValues = init(11273);
    public static final NodeId HistoryServerCapabilities_MaxReturnEventValues = init(11274);
    public static final NodeId HistoryServerCapabilities_InsertAnnotationCapability = init(11275);
    public static final NodeId HistoryServerCapabilitiesType_InsertEventCapability = init(11278);
    public static final NodeId HistoryServerCapabilitiesType_ReplaceEventCapability = init(11279);
    public static final NodeId HistoryServerCapabilitiesType_UpdateEventCapability = init(11280);
    public static final NodeId HistoryServerCapabilities_InsertEventCapability = init(11281);
    public static final NodeId HistoryServerCapabilities_ReplaceEventCapability = init(11282);
    public static final NodeId HistoryServerCapabilities_UpdateEventCapability = init(11283);
    public static final NodeId AggregateFunction_TimeAverage2 = init(11285);
    public static final NodeId AggregateFunction_Minimum2 = init(11286);
    public static final NodeId AggregateFunction_Maximum2 = init(11287);
    public static final NodeId AggregateFunction_Range2 = init(11288);
    public static final NodeId AggregateFunction_WorstQuality2 = init(11292);
    public static final NodeId PerformUpdateType = init(11293);
    public static final NodeId UpdateStructureDataDetails = init(11295);
    public static final NodeId UpdateStructureDataDetails_Encoding_DefaultXml = init(11296);
    public static final NodeId UpdateStructureDataDetails_Encoding_DefaultBinary = init(11300);
    public static final NodeId AggregateFunction_Total2 = init(11304);
    public static final NodeId AggregateFunction_MinimumActualTime2 = init(11305);
    public static final NodeId AggregateFunction_MaximumActualTime2 = init(11306);
    public static final NodeId AggregateFunction_DurationInStateZero = init(11307);
    public static final NodeId AggregateFunction_DurationInStateNonZero = init(11308);
    public static final NodeId Server_ServerRedundancy_CurrentServerId = init(11312);
    public static final NodeId Server_ServerRedundancy_RedundantServerArray = init(11313);
    public static final NodeId Server_ServerRedundancy_ServerUriArray = init(11314);
    public static final NodeId ShelvedStateMachineType_UnshelvedToTimedShelved_TransitionNumber = init(11322);
    public static final NodeId ShelvedStateMachineType_UnshelvedToOneShotShelved_TransitionNumber = init(11323);
    public static final NodeId ShelvedStateMachineType_TimedShelvedToUnshelved_TransitionNumber = init(11324);
    public static final NodeId ShelvedStateMachineType_TimedShelvedToOneShotShelved_TransitionNumber = init(11325);
    public static final NodeId ShelvedStateMachineType_OneShotShelvedToUnshelved_TransitionNumber = init(11326);
    public static final NodeId ShelvedStateMachineType_OneShotShelvedToTimedShelved_TransitionNumber = init(11327);
    public static final NodeId ExclusiveLimitStateMachineType_LowLowToLow_TransitionNumber = init(11340);
    public static final NodeId ExclusiveLimitStateMachineType_LowToLowLow_TransitionNumber = init(11341);
    public static final NodeId ExclusiveLimitStateMachineType_HighHighToHigh_TransitionNumber = init(11342);
    public static final NodeId ExclusiveLimitStateMachineType_HighToHighHigh_TransitionNumber = init(11343);
    public static final NodeId AggregateFunction_StandardDeviationSample = init(11426);
    public static final NodeId AggregateFunction_StandardDeviationPopulation = init(11427);
    public static final NodeId AggregateFunction_VarianceSample = init(11428);
    public static final NodeId AggregateFunction_VariancePopulation = init(11429);
    public static final NodeId EnumStrings = init(11432);
    public static final NodeId ValueAsText = init(11433);
    public static final NodeId ProgressEventType = init(11436);
    public static final NodeId ProgressEventType_EventId = init(11437);
    public static final NodeId ProgressEventType_EventType = init(11438);
    public static final NodeId ProgressEventType_SourceNode = init(11439);
    public static final NodeId ProgressEventType_SourceName = init(11440);
    public static final NodeId ProgressEventType_Time = init(11441);
    public static final NodeId ProgressEventType_ReceiveTime = init(11442);
    public static final NodeId ProgressEventType_LocalTime = init(11443);
    public static final NodeId ProgressEventType_Message = init(11444);
    public static final NodeId ProgressEventType_Severity = init(11445);
    public static final NodeId SystemStatusChangeEventType = init(11446);
    public static final NodeId SystemStatusChangeEventType_EventId = init(11447);
    public static final NodeId SystemStatusChangeEventType_EventType = init(11448);
    public static final NodeId SystemStatusChangeEventType_SourceNode = init(11449);
    public static final NodeId SystemStatusChangeEventType_SourceName = init(11450);
    public static final NodeId SystemStatusChangeEventType_Time = init(11451);
    public static final NodeId SystemStatusChangeEventType_ReceiveTime = init(11452);
    public static final NodeId SystemStatusChangeEventType_LocalTime = init(11453);
    public static final NodeId SystemStatusChangeEventType_Message = init(11454);
    public static final NodeId SystemStatusChangeEventType_Severity = init(11455);
    public static final NodeId TransitionVariableType_EffectiveTransitionTime = init(11456);
    public static final NodeId FiniteTransitionVariableType_EffectiveTransitionTime = init(11457);
    public static final NodeId StateMachineType_LastTransition_EffectiveTransitionTime = init(11458);
    public static final NodeId FiniteStateMachineType_LastTransition_EffectiveTransitionTime = init(11459);
    public static final NodeId TransitionEventType_Transition_EffectiveTransitionTime = init(11460);
    public static final NodeId MultiStateValueDiscreteType_ValueAsText = init(11461);
    public static final NodeId ProgramTransitionEventType_Transition_EffectiveTransitionTime = init(11462);
    public static final NodeId ProgramTransitionAuditEventType_Transition_EffectiveTransitionTime = init(11463);
    public static final NodeId ProgramStateMachineType_LastTransition_EffectiveTransitionTime = init(11464);
    public static final NodeId ShelvedStateMachineType_LastTransition_EffectiveTransitionTime = init(11465);
    public static final NodeId AlarmConditionType_ShelvingState_LastTransition_EffectiveTransitionTime = init(11466);
    public static final NodeId LimitAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(11467);
    public static final NodeId ExclusiveLimitStateMachineType_LastTransition_EffectiveTransitionTime = init(11468);
    public static final NodeId ExclusiveLimitAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        11469
    );
    public static final NodeId ExclusiveLimitAlarmType_LimitState_LastTransition_EffectiveTransitionTime = init(11470);
    public static final NodeId ExclusiveLevelAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        11471
    );
    public static final NodeId ExclusiveLevelAlarmType_LimitState_LastTransition_EffectiveTransitionTime = init(11472);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        11473
    );
    public static final NodeId ExclusiveRateOfChangeAlarmType_LimitState_LastTransition_EffectiveTransitionTime = init(
        11474
    );
    public static final NodeId ExclusiveDeviationAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        11475
    );
    public static final NodeId ExclusiveDeviationAlarmType_LimitState_LastTransition_EffectiveTransitionTime = init(
        11476
    );
    public static final NodeId NonExclusiveLimitAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        11477
    );
    public static final NodeId NonExclusiveLevelAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        11478
    );
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        11479
    );
    public static final NodeId NonExclusiveDeviationAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        11480
    );
    public static final NodeId DiscreteAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(11481);
    public static final NodeId OffNormalAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(11482);
    public static final NodeId TripAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(11483);
    public static final NodeId AuditActivateSessionEventType_SecureChannelId = init(11485);
    public static final NodeId OptionSetType = init(11487);
    public static final NodeId OptionSetType_OptionSetValues = init(11488);
    public static final NodeId ServerType_GetMonitoredItems = init(11489);
    public static final NodeId ServerType_GetMonitoredItems_InputArguments = init(11490);
    public static final NodeId ServerType_GetMonitoredItems_OutputArguments = init(11491);
    public static final NodeId Server_GetMonitoredItems = init(11492);
    public static final NodeId Server_GetMonitoredItems_InputArguments = init(11493);
    public static final NodeId Server_GetMonitoredItems_OutputArguments = init(11494);
    public static final NodeId GetMonitoredItemsMethodType = init(11495);
    public static final NodeId GetMonitoredItemsMethodType_InputArguments = init(11496);
    public static final NodeId GetMonitoredItemsMethodType_OutputArguments = init(11497);
    public static final NodeId MaxStringLength = init(11498);
    public static final NodeId HistoricalDataConfigurationType_StartOfArchive = init(11499);
    public static final NodeId HistoricalDataConfigurationType_StartOfOnlineArchive = init(11500);
    public static final NodeId HistoryServerCapabilitiesType_DeleteEventCapability = init(11501);
    public static final NodeId HistoryServerCapabilities_DeleteEventCapability = init(11502);
    public static final NodeId HAConfiguration_StartOfArchive = init(11503);
    public static final NodeId HAConfiguration_StartOfOnlineArchive = init(11504);
    public static final NodeId AggregateFunction_StartBound = init(11505);
    public static final NodeId AggregateFunction_EndBound = init(11506);
    public static final NodeId AggregateFunction_DeltaBounds = init(11507);
    public static final NodeId ModellingRule_OptionalPlaceholder = init(11508);
    public static final NodeId ModellingRule_OptionalPlaceholder_NamingRule = init(11509);
    public static final NodeId ModellingRule_MandatoryPlaceholder = init(11510);
    public static final NodeId ModellingRule_MandatoryPlaceholder_NamingRule = init(11511);
    public static final NodeId MaxArrayLength = init(11512);
    public static final NodeId EngineeringUnits = init(11513);
    public static final NodeId ServerType_ServerCapabilities_MaxArrayLength = init(11514);
    public static final NodeId ServerType_ServerCapabilities_MaxStringLength = init(11515);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits = init(11516);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerRead = init(11517);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerWrite = init(11519);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerMethodCall = init(11521);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerBrowse = init(11522);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerRegisterNodes = init(11523);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerTranslateBrowsePathsToNodeIds = init(
        11524
    );
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerNodeManagement = init(11525);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxMonitoredItemsPerCall = init(11526);
    public static final NodeId ServerType_Namespaces = init(11527);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile = init(11528);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Size = init(11529);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_OpenCount = init(11532);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Open = init(11533);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Open_InputArguments = init(11534);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Open_OutputArguments = init(11535);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Close = init(11536);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Close_InputArguments = init(11537);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Read = init(11538);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Read_InputArguments = init(11539);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Read_OutputArguments = init(11540);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Write = init(11541);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Write_InputArguments = init(11542);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_GetPosition = init(11543);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_GetPosition_InputArguments = init(11544);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_GetPosition_OutputArguments = init(11545);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_SetPosition = init(11546);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_SetPosition_InputArguments = init(11547);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_ExportNamespace = init(11548);
    public static final NodeId ServerCapabilitiesType_MaxArrayLength = init(11549);
    public static final NodeId ServerCapabilitiesType_MaxStringLength = init(11550);
    public static final NodeId ServerCapabilitiesType_OperationLimits = init(11551);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerRead = init(11552);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerWrite = init(11554);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerMethodCall = init(11556);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerBrowse = init(11557);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerRegisterNodes = init(11558);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerTranslateBrowsePathsToNodeIds = init(
        11559
    );
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerNodeManagement = init(11560);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxMonitoredItemsPerCall = init(11561);
    public static final NodeId ServerCapabilitiesType_VendorCapability = init(11562);
    public static final NodeId OperationLimitsType = init(11564);
    public static final NodeId OperationLimitsType_MaxNodesPerRead = init(11565);
    public static final NodeId OperationLimitsType_MaxNodesPerWrite = init(11567);
    public static final NodeId OperationLimitsType_MaxNodesPerMethodCall = init(11569);
    public static final NodeId OperationLimitsType_MaxNodesPerBrowse = init(11570);
    public static final NodeId OperationLimitsType_MaxNodesPerRegisterNodes = init(11571);
    public static final NodeId OperationLimitsType_MaxNodesPerTranslateBrowsePathsToNodeIds = init(11572);
    public static final NodeId OperationLimitsType_MaxNodesPerNodeManagement = init(11573);
    public static final NodeId OperationLimitsType_MaxMonitoredItemsPerCall = init(11574);
    public static final NodeId FileType = init(11575);
    public static final NodeId FileType_Size = init(11576);
    public static final NodeId FileType_OpenCount = init(11579);
    public static final NodeId FileType_Open = init(11580);
    public static final NodeId FileType_Open_InputArguments = init(11581);
    public static final NodeId FileType_Open_OutputArguments = init(11582);
    public static final NodeId FileType_Close = init(11583);
    public static final NodeId FileType_Close_InputArguments = init(11584);
    public static final NodeId FileType_Read = init(11585);
    public static final NodeId FileType_Read_InputArguments = init(11586);
    public static final NodeId FileType_Read_OutputArguments = init(11587);
    public static final NodeId FileType_Write = init(11588);
    public static final NodeId FileType_Write_InputArguments = init(11589);
    public static final NodeId FileType_GetPosition = init(11590);
    public static final NodeId FileType_GetPosition_InputArguments = init(11591);
    public static final NodeId FileType_GetPosition_OutputArguments = init(11592);
    public static final NodeId FileType_SetPosition = init(11593);
    public static final NodeId FileType_SetPosition_InputArguments = init(11594);
    public static final NodeId AddressSpaceFileType = init(11595);
    public static final NodeId AddressSpaceFileType_Size = init(11596);
    public static final NodeId AddressSpaceFileType_OpenCount = init(11599);
    public static final NodeId AddressSpaceFileType_Open = init(11600);
    public static final NodeId AddressSpaceFileType_Open_InputArguments = init(11601);
    public static final NodeId AddressSpaceFileType_Open_OutputArguments = init(11602);
    public static final NodeId AddressSpaceFileType_Close = init(11603);
    public static final NodeId AddressSpaceFileType_Close_InputArguments = init(11604);
    public static final NodeId AddressSpaceFileType_Read = init(11605);
    public static final NodeId AddressSpaceFileType_Read_InputArguments = init(11606);
    public static final NodeId AddressSpaceFileType_Read_OutputArguments = init(11607);
    public static final NodeId AddressSpaceFileType_Write = init(11608);
    public static final NodeId AddressSpaceFileType_Write_InputArguments = init(11609);
    public static final NodeId AddressSpaceFileType_GetPosition = init(11610);
    public static final NodeId AddressSpaceFileType_GetPosition_InputArguments = init(11611);
    public static final NodeId AddressSpaceFileType_GetPosition_OutputArguments = init(11612);
    public static final NodeId AddressSpaceFileType_SetPosition = init(11613);
    public static final NodeId AddressSpaceFileType_SetPosition_InputArguments = init(11614);
    public static final NodeId AddressSpaceFileType_ExportNamespace = init(11615);
    public static final NodeId NamespaceMetadataType = init(11616);
    public static final NodeId NamespaceMetadataType_NamespaceUri = init(11617);
    public static final NodeId NamespaceMetadataType_NamespaceVersion = init(11618);
    public static final NodeId NamespaceMetadataType_NamespacePublicationDate = init(11619);
    public static final NodeId NamespaceMetadataType_IsNamespaceSubset = init(11620);
    public static final NodeId NamespaceMetadataType_StaticNodeIdIdentifierTypes = init(11621);
    public static final NodeId NamespaceMetadataType_StaticNumericNodeIdRange = init(11622);
    public static final NodeId NamespaceMetadataType_StaticStringNodeIdPattern = init(11623);
    public static final NodeId NamespaceMetadataType_NamespaceFile = init(11624);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Size = init(11625);
    public static final NodeId NamespaceMetadataType_NamespaceFile_OpenCount = init(11628);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Open = init(11629);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Open_InputArguments = init(11630);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Open_OutputArguments = init(11631);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Close = init(11632);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Close_InputArguments = init(11633);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Read = init(11634);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Read_InputArguments = init(11635);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Read_OutputArguments = init(11636);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Write = init(11637);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Write_InputArguments = init(11638);
    public static final NodeId NamespaceMetadataType_NamespaceFile_GetPosition = init(11639);
    public static final NodeId NamespaceMetadataType_NamespaceFile_GetPosition_InputArguments = init(11640);
    public static final NodeId NamespaceMetadataType_NamespaceFile_GetPosition_OutputArguments = init(11641);
    public static final NodeId NamespaceMetadataType_NamespaceFile_SetPosition = init(11642);
    public static final NodeId NamespaceMetadataType_NamespaceFile_SetPosition_InputArguments = init(11643);
    public static final NodeId NamespaceMetadataType_NamespaceFile_ExportNamespace = init(11644);
    public static final NodeId NamespacesType = init(11645);
    public static final NodeId NamespacesType_NamespaceIdentifier = init(11646);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceUri = init(11647);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceVersion = init(11648);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespacePublicationDate = init(11649);
    public static final NodeId NamespacesType_NamespaceIdentifier_IsNamespaceSubset = init(11650);
    public static final NodeId NamespacesType_NamespaceIdentifier_StaticNodeIdIdentifierTypes = init(11651);
    public static final NodeId NamespacesType_NamespaceIdentifier_StaticNumericNodeIdRange = init(11652);
    public static final NodeId NamespacesType_NamespaceIdentifier_StaticStringNodeIdPattern = init(11653);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile = init(11654);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Size = init(11655);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_OpenCount = init(11658);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Open = init(11659);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Open_InputArguments = init(11660);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Open_OutputArguments = init(11661);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Close = init(11662);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Close_InputArguments = init(11663);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Read = init(11664);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Read_InputArguments = init(11665);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Read_OutputArguments = init(11666);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Write = init(11667);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Write_InputArguments = init(11668);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_GetPosition = init(11669);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_GetPosition_InputArguments = init(
        11670
    );
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_GetPosition_OutputArguments = init(
        11671
    );
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_SetPosition = init(11672);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_SetPosition_InputArguments = init(
        11673
    );
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_ExportNamespace = init(11674);
    public static final NodeId NamespacesType_AddressSpaceFile = init(11675);
    public static final NodeId NamespacesType_AddressSpaceFile_Size = init(11676);
    public static final NodeId NamespacesType_AddressSpaceFile_OpenCount = init(11679);
    public static final NodeId NamespacesType_AddressSpaceFile_Open = init(11680);
    public static final NodeId NamespacesType_AddressSpaceFile_Open_InputArguments = init(11681);
    public static final NodeId NamespacesType_AddressSpaceFile_Open_OutputArguments = init(11682);
    public static final NodeId NamespacesType_AddressSpaceFile_Close = init(11683);
    public static final NodeId NamespacesType_AddressSpaceFile_Close_InputArguments = init(11684);
    public static final NodeId NamespacesType_AddressSpaceFile_Read = init(11685);
    public static final NodeId NamespacesType_AddressSpaceFile_Read_InputArguments = init(11686);
    public static final NodeId NamespacesType_AddressSpaceFile_Read_OutputArguments = init(11687);
    public static final NodeId NamespacesType_AddressSpaceFile_Write = init(11688);
    public static final NodeId NamespacesType_AddressSpaceFile_Write_InputArguments = init(11689);
    public static final NodeId NamespacesType_AddressSpaceFile_GetPosition = init(11690);
    public static final NodeId NamespacesType_AddressSpaceFile_GetPosition_InputArguments = init(11691);
    public static final NodeId NamespacesType_AddressSpaceFile_GetPosition_OutputArguments = init(11692);
    public static final NodeId NamespacesType_AddressSpaceFile_SetPosition = init(11693);
    public static final NodeId NamespacesType_AddressSpaceFile_SetPosition_InputArguments = init(11694);
    public static final NodeId NamespacesType_AddressSpaceFile_ExportNamespace = init(11695);
    public static final NodeId SystemStatusChangeEventType_SystemState = init(11696);
    public static final NodeId SamplingIntervalDiagnosticsType_SampledMonitoredItemsCount = init(11697);
    public static final NodeId SamplingIntervalDiagnosticsType_MaxSampledMonitoredItemsCount = init(11698);
    public static final NodeId SamplingIntervalDiagnosticsType_DisabledMonitoredItemsSamplingCount = init(11699);
    public static final NodeId OptionSetType_BitMask = init(11701);
    public static final NodeId Server_ServerCapabilities_MaxArrayLength = init(11702);
    public static final NodeId Server_ServerCapabilities_MaxStringLength = init(11703);
    public static final NodeId Server_ServerCapabilities_OperationLimits = init(11704);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerRead = init(11705);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerWrite = init(11707);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerMethodCall = init(11709);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerBrowse = init(11710);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerRegisterNodes = init(11711);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerTranslateBrowsePathsToNodeIds = init(
        11712
    );
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerNodeManagement = init(11713);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxMonitoredItemsPerCall = init(11714);
    public static final NodeId Server_Namespaces = init(11715);
    public static final NodeId Server_Namespaces_AddressSpaceFile = init(11716);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Size = init(11717);
    public static final NodeId Server_Namespaces_AddressSpaceFile_OpenCount = init(11720);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Open = init(11721);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Open_InputArguments = init(11722);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Open_OutputArguments = init(11723);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Close = init(11724);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Close_InputArguments = init(11725);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Read = init(11726);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Read_InputArguments = init(11727);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Read_OutputArguments = init(11728);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Write = init(11729);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Write_InputArguments = init(11730);
    public static final NodeId Server_Namespaces_AddressSpaceFile_GetPosition = init(11731);
    public static final NodeId Server_Namespaces_AddressSpaceFile_GetPosition_InputArguments = init(11732);
    public static final NodeId Server_Namespaces_AddressSpaceFile_GetPosition_OutputArguments = init(11733);
    public static final NodeId Server_Namespaces_AddressSpaceFile_SetPosition = init(11734);
    public static final NodeId Server_Namespaces_AddressSpaceFile_SetPosition_InputArguments = init(11735);
    public static final NodeId Server_Namespaces_AddressSpaceFile_ExportNamespace = init(11736);
    public static final NodeId BitFieldMaskDataType = init(11737);
    public static final NodeId OpenMethodType = init(11738);
    public static final NodeId OpenMethodType_InputArguments = init(11739);
    public static final NodeId OpenMethodType_OutputArguments = init(11740);
    public static final NodeId CloseMethodType = init(11741);
    public static final NodeId CloseMethodType_InputArguments = init(11742);
    public static final NodeId ReadMethodType = init(11743);
    public static final NodeId ReadMethodType_InputArguments = init(11744);
    public static final NodeId ReadMethodType_OutputArguments = init(11745);
    public static final NodeId WriteMethodType = init(11746);
    public static final NodeId WriteMethodType_InputArguments = init(11747);
    public static final NodeId GetPositionMethodType = init(11748);
    public static final NodeId GetPositionMethodType_InputArguments = init(11749);
    public static final NodeId GetPositionMethodType_OutputArguments = init(11750);
    public static final NodeId SetPositionMethodType = init(11751);
    public static final NodeId SetPositionMethodType_InputArguments = init(11752);
    public static final NodeId SystemOffNormalAlarmType = init(11753);
    public static final NodeId SystemOffNormalAlarmType_EventId = init(11754);
    public static final NodeId SystemOffNormalAlarmType_EventType = init(11755);
    public static final NodeId SystemOffNormalAlarmType_SourceNode = init(11756);
    public static final NodeId SystemOffNormalAlarmType_SourceName = init(11757);
    public static final NodeId SystemOffNormalAlarmType_Time = init(11758);
    public static final NodeId SystemOffNormalAlarmType_ReceiveTime = init(11759);
    public static final NodeId SystemOffNormalAlarmType_LocalTime = init(11760);
    public static final NodeId SystemOffNormalAlarmType_Message = init(11761);
    public static final NodeId SystemOffNormalAlarmType_Severity = init(11762);
    public static final NodeId SystemOffNormalAlarmType_ConditionClassId = init(11763);
    public static final NodeId SystemOffNormalAlarmType_ConditionClassName = init(11764);
    public static final NodeId SystemOffNormalAlarmType_ConditionName = init(11765);
    public static final NodeId SystemOffNormalAlarmType_BranchId = init(11766);
    public static final NodeId SystemOffNormalAlarmType_Retain = init(11767);
    public static final NodeId SystemOffNormalAlarmType_EnabledState = init(11768);
    public static final NodeId SystemOffNormalAlarmType_EnabledState_Id = init(11769);
    public static final NodeId SystemOffNormalAlarmType_EnabledState_Name = init(11770);
    public static final NodeId SystemOffNormalAlarmType_EnabledState_Number = init(11771);
    public static final NodeId SystemOffNormalAlarmType_EnabledState_EffectiveDisplayName = init(11772);
    public static final NodeId SystemOffNormalAlarmType_EnabledState_TransitionTime = init(11773);
    public static final NodeId SystemOffNormalAlarmType_EnabledState_EffectiveTransitionTime = init(11774);
    public static final NodeId SystemOffNormalAlarmType_EnabledState_TrueState = init(11775);
    public static final NodeId SystemOffNormalAlarmType_EnabledState_FalseState = init(11776);
    public static final NodeId SystemOffNormalAlarmType_Quality = init(11777);
    public static final NodeId SystemOffNormalAlarmType_Quality_SourceTimestamp = init(11778);
    public static final NodeId SystemOffNormalAlarmType_LastSeverity = init(11779);
    public static final NodeId SystemOffNormalAlarmType_LastSeverity_SourceTimestamp = init(11780);
    public static final NodeId SystemOffNormalAlarmType_Comment = init(11781);
    public static final NodeId SystemOffNormalAlarmType_Comment_SourceTimestamp = init(11782);
    public static final NodeId SystemOffNormalAlarmType_ClientUserId = init(11783);
    public static final NodeId SystemOffNormalAlarmType_Disable = init(11784);
    public static final NodeId SystemOffNormalAlarmType_Enable = init(11785);
    public static final NodeId SystemOffNormalAlarmType_AddComment = init(11786);
    public static final NodeId SystemOffNormalAlarmType_AddComment_InputArguments = init(11787);
    public static final NodeId SystemOffNormalAlarmType_ConditionRefresh = init(11788);
    public static final NodeId SystemOffNormalAlarmType_ConditionRefresh_InputArguments = init(11789);
    public static final NodeId SystemOffNormalAlarmType_AckedState = init(11790);
    public static final NodeId SystemOffNormalAlarmType_AckedState_Id = init(11791);
    public static final NodeId SystemOffNormalAlarmType_AckedState_Name = init(11792);
    public static final NodeId SystemOffNormalAlarmType_AckedState_Number = init(11793);
    public static final NodeId SystemOffNormalAlarmType_AckedState_EffectiveDisplayName = init(11794);
    public static final NodeId SystemOffNormalAlarmType_AckedState_TransitionTime = init(11795);
    public static final NodeId SystemOffNormalAlarmType_AckedState_EffectiveTransitionTime = init(11796);
    public static final NodeId SystemOffNormalAlarmType_AckedState_TrueState = init(11797);
    public static final NodeId SystemOffNormalAlarmType_AckedState_FalseState = init(11798);
    public static final NodeId SystemOffNormalAlarmType_ConfirmedState = init(11799);
    public static final NodeId SystemOffNormalAlarmType_ConfirmedState_Id = init(11800);
    public static final NodeId SystemOffNormalAlarmType_ConfirmedState_Name = init(11801);
    public static final NodeId SystemOffNormalAlarmType_ConfirmedState_Number = init(11802);
    public static final NodeId SystemOffNormalAlarmType_ConfirmedState_EffectiveDisplayName = init(11803);
    public static final NodeId SystemOffNormalAlarmType_ConfirmedState_TransitionTime = init(11804);
    public static final NodeId SystemOffNormalAlarmType_ConfirmedState_EffectiveTransitionTime = init(11805);
    public static final NodeId SystemOffNormalAlarmType_ConfirmedState_TrueState = init(11806);
    public static final NodeId SystemOffNormalAlarmType_ConfirmedState_FalseState = init(11807);
    public static final NodeId SystemOffNormalAlarmType_Acknowledge = init(11808);
    public static final NodeId SystemOffNormalAlarmType_Acknowledge_InputArguments = init(11809);
    public static final NodeId SystemOffNormalAlarmType_Confirm = init(11810);
    public static final NodeId SystemOffNormalAlarmType_Confirm_InputArguments = init(11811);
    public static final NodeId SystemOffNormalAlarmType_ActiveState = init(11812);
    public static final NodeId SystemOffNormalAlarmType_ActiveState_Id = init(11813);
    public static final NodeId SystemOffNormalAlarmType_ActiveState_Name = init(11814);
    public static final NodeId SystemOffNormalAlarmType_ActiveState_Number = init(11815);
    public static final NodeId SystemOffNormalAlarmType_ActiveState_EffectiveDisplayName = init(11816);
    public static final NodeId SystemOffNormalAlarmType_ActiveState_TransitionTime = init(11817);
    public static final NodeId SystemOffNormalAlarmType_ActiveState_EffectiveTransitionTime = init(11818);
    public static final NodeId SystemOffNormalAlarmType_ActiveState_TrueState = init(11819);
    public static final NodeId SystemOffNormalAlarmType_ActiveState_FalseState = init(11820);
    public static final NodeId SystemOffNormalAlarmType_InputNode = init(11821);
    public static final NodeId SystemOffNormalAlarmType_SuppressedState = init(11822);
    public static final NodeId SystemOffNormalAlarmType_SuppressedState_Id = init(11823);
    public static final NodeId SystemOffNormalAlarmType_SuppressedState_Name = init(11824);
    public static final NodeId SystemOffNormalAlarmType_SuppressedState_Number = init(11825);
    public static final NodeId SystemOffNormalAlarmType_SuppressedState_EffectiveDisplayName = init(11826);
    public static final NodeId SystemOffNormalAlarmType_SuppressedState_TransitionTime = init(11827);
    public static final NodeId SystemOffNormalAlarmType_SuppressedState_EffectiveTransitionTime = init(11828);
    public static final NodeId SystemOffNormalAlarmType_SuppressedState_TrueState = init(11829);
    public static final NodeId SystemOffNormalAlarmType_SuppressedState_FalseState = init(11830);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState = init(11831);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_CurrentState = init(11832);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_CurrentState_Id = init(11833);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_CurrentState_Name = init(11834);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_CurrentState_Number = init(11835);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(11836);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_LastTransition = init(11837);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_LastTransition_Id = init(11838);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_LastTransition_Name = init(11839);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_LastTransition_Number = init(11840);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_LastTransition_TransitionTime = init(11841);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        11842
    );
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_UnshelveTime = init(11843);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_Unshelve = init(11844);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_OneShotShelve = init(11845);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_TimedShelve = init(11846);
    public static final NodeId SystemOffNormalAlarmType_ShelvingState_TimedShelve_InputArguments = init(11847);
    public static final NodeId SystemOffNormalAlarmType_SuppressedOrShelved = init(11848);
    public static final NodeId SystemOffNormalAlarmType_MaxTimeShelved = init(11849);
    public static final NodeId SystemOffNormalAlarmType_NormalState = init(11850);
    public static final NodeId AuditConditionCommentEventType_Comment = init(11851);
    public static final NodeId AuditConditionRespondEventType_SelectedResponse = init(11852);
    public static final NodeId AuditConditionAcknowledgeEventType_Comment = init(11853);
    public static final NodeId AuditConditionConfirmEventType_Comment = init(11854);
    public static final NodeId AuditConditionShelvingEventType_ShelvingTime = init(11855);
    public static final NodeId AuditProgramTransitionEventType = init(11856);
    public static final NodeId AuditProgramTransitionEventType_EventId = init(11857);
    public static final NodeId AuditProgramTransitionEventType_EventType = init(11858);
    public static final NodeId AuditProgramTransitionEventType_SourceNode = init(11859);
    public static final NodeId AuditProgramTransitionEventType_SourceName = init(11860);
    public static final NodeId AuditProgramTransitionEventType_Time = init(11861);
    public static final NodeId AuditProgramTransitionEventType_ReceiveTime = init(11862);
    public static final NodeId AuditProgramTransitionEventType_LocalTime = init(11863);
    public static final NodeId AuditProgramTransitionEventType_Message = init(11864);
    public static final NodeId AuditProgramTransitionEventType_Severity = init(11865);
    public static final NodeId AuditProgramTransitionEventType_ActionTimeStamp = init(11866);
    public static final NodeId AuditProgramTransitionEventType_Status = init(11867);
    public static final NodeId AuditProgramTransitionEventType_ServerId = init(11868);
    public static final NodeId AuditProgramTransitionEventType_ClientAuditEntryId = init(11869);
    public static final NodeId AuditProgramTransitionEventType_ClientUserId = init(11870);
    public static final NodeId AuditProgramTransitionEventType_MethodId = init(11871);
    public static final NodeId AuditProgramTransitionEventType_InputArguments = init(11872);
    public static final NodeId AuditProgramTransitionEventType_OldStateId = init(11873);
    public static final NodeId AuditProgramTransitionEventType_NewStateId = init(11874);
    public static final NodeId AuditProgramTransitionEventType_TransitionNumber = init(11875);
    public static final NodeId HistoricalDataConfigurationType_AggregateFunctions = init(11876);
    public static final NodeId HAConfiguration_AggregateFunctions = init(11877);
    public static final NodeId NodeClass_EnumValues = init(11878);
    public static final NodeId InstanceNode = init(11879);
    public static final NodeId TypeNode = init(11880);
    public static final NodeId NodeAttributesMask_EnumValues = init(11881);
    public static final NodeId AttributeWriteMask_EnumValues = init(11882);
    public static final NodeId BrowseResultMask_EnumValues = init(11883);
    public static final NodeId HistoryUpdateType_EnumValues = init(11884);
    public static final NodeId PerformUpdateType_EnumValues = init(11885);
    public static final NodeId EnumeratedTestType_EnumValues = init(11886);
    public static final NodeId InstanceNode_Encoding_DefaultXml = init(11887);
    public static final NodeId TypeNode_Encoding_DefaultXml = init(11888);
    public static final NodeId InstanceNode_Encoding_DefaultBinary = init(11889);
    public static final NodeId TypeNode_Encoding_DefaultBinary = init(11890);
    public static final NodeId SessionDiagnosticsObjectType_SessionDiagnostics_UnauthorizedRequestCount = init(11891);
    public static final NodeId SessionDiagnosticsVariableType_UnauthorizedRequestCount = init(11892);
    public static final NodeId OpenFileMode = init(11939);
    public static final NodeId OpenFileMode_EnumValues = init(11940);
    public static final NodeId ModelChangeStructureVerbMask = init(11941);
    public static final NodeId ModelChangeStructureVerbMask_EnumValues = init(11942);
    public static final NodeId EndpointUrlListDataType = init(11943);
    public static final NodeId NetworkGroupDataType = init(11944);
    public static final NodeId NonTransparentNetworkRedundancyType = init(11945);
    public static final NodeId NonTransparentNetworkRedundancyType_RedundancySupport = init(11946);
    public static final NodeId NonTransparentNetworkRedundancyType_ServerUriArray = init(11947);
    public static final NodeId NonTransparentNetworkRedundancyType_ServerNetworkGroups = init(11948);
    public static final NodeId EndpointUrlListDataType_Encoding_DefaultXml = init(11949);
    public static final NodeId NetworkGroupDataType_Encoding_DefaultXml = init(11950);
    public static final NodeId OpcUa_XmlSchema_EndpointUrlListDataType = init(11951);
    public static final NodeId OpcUa_XmlSchema_EndpointUrlListDataType_DataTypeVersion = init(11952);
    public static final NodeId OpcUa_XmlSchema_EndpointUrlListDataType_DictionaryFragment = init(11953);
    public static final NodeId OpcUa_XmlSchema_NetworkGroupDataType = init(11954);
    public static final NodeId OpcUa_XmlSchema_NetworkGroupDataType_DataTypeVersion = init(11955);
    public static final NodeId OpcUa_XmlSchema_NetworkGroupDataType_DictionaryFragment = init(11956);
    public static final NodeId EndpointUrlListDataType_Encoding_DefaultBinary = init(11957);
    public static final NodeId NetworkGroupDataType_Encoding_DefaultBinary = init(11958);
    public static final NodeId OpcUa_BinarySchema_EndpointUrlListDataType = init(11959);
    public static final NodeId OpcUa_BinarySchema_EndpointUrlListDataType_DataTypeVersion = init(11960);
    public static final NodeId OpcUa_BinarySchema_EndpointUrlListDataType_DictionaryFragment = init(11961);
    public static final NodeId OpcUa_BinarySchema_NetworkGroupDataType = init(11962);
    public static final NodeId OpcUa_BinarySchema_NetworkGroupDataType_DataTypeVersion = init(11963);
    public static final NodeId OpcUa_BinarySchema_NetworkGroupDataType_DictionaryFragment = init(11964);
    public static final NodeId ArrayItemType = init(12021);
    public static final NodeId ArrayItemType_Definition = init(12022);
    public static final NodeId ArrayItemType_ValuePrecision = init(12023);
    public static final NodeId ArrayItemType_InstrumentRange = init(12024);
    public static final NodeId ArrayItemType_EURange = init(12025);
    public static final NodeId ArrayItemType_EngineeringUnits = init(12026);
    public static final NodeId ArrayItemType_Title = init(12027);
    public static final NodeId ArrayItemType_AxisScaleType = init(12028);
    public static final NodeId YArrayItemType = init(12029);
    public static final NodeId YArrayItemType_Definition = init(12030);
    public static final NodeId YArrayItemType_ValuePrecision = init(12031);
    public static final NodeId YArrayItemType_InstrumentRange = init(12032);
    public static final NodeId YArrayItemType_EURange = init(12033);
    public static final NodeId YArrayItemType_EngineeringUnits = init(12034);
    public static final NodeId YArrayItemType_Title = init(12035);
    public static final NodeId YArrayItemType_AxisScaleType = init(12036);
    public static final NodeId YArrayItemType_XAxisDefinition = init(12037);
    public static final NodeId XYArrayItemType = init(12038);
    public static final NodeId XYArrayItemType_Definition = init(12039);
    public static final NodeId XYArrayItemType_ValuePrecision = init(12040);
    public static final NodeId XYArrayItemType_InstrumentRange = init(12041);
    public static final NodeId XYArrayItemType_EURange = init(12042);
    public static final NodeId XYArrayItemType_EngineeringUnits = init(12043);
    public static final NodeId XYArrayItemType_Title = init(12044);
    public static final NodeId XYArrayItemType_AxisScaleType = init(12045);
    public static final NodeId XYArrayItemType_XAxisDefinition = init(12046);
    public static final NodeId ImageItemType = init(12047);
    public static final NodeId ImageItemType_Definition = init(12048);
    public static final NodeId ImageItemType_ValuePrecision = init(12049);
    public static final NodeId ImageItemType_InstrumentRange = init(12050);
    public static final NodeId ImageItemType_EURange = init(12051);
    public static final NodeId ImageItemType_EngineeringUnits = init(12052);
    public static final NodeId ImageItemType_Title = init(12053);
    public static final NodeId ImageItemType_AxisScaleType = init(12054);
    public static final NodeId ImageItemType_XAxisDefinition = init(12055);
    public static final NodeId ImageItemType_YAxisDefinition = init(12056);
    public static final NodeId CubeItemType = init(12057);
    public static final NodeId CubeItemType_Definition = init(12058);
    public static final NodeId CubeItemType_ValuePrecision = init(12059);
    public static final NodeId CubeItemType_InstrumentRange = init(12060);
    public static final NodeId CubeItemType_EURange = init(12061);
    public static final NodeId CubeItemType_EngineeringUnits = init(12062);
    public static final NodeId CubeItemType_Title = init(12063);
    public static final NodeId CubeItemType_AxisScaleType = init(12064);
    public static final NodeId CubeItemType_XAxisDefinition = init(12065);
    public static final NodeId CubeItemType_YAxisDefinition = init(12066);
    public static final NodeId CubeItemType_ZAxisDefinition = init(12067);
    public static final NodeId NDimensionArrayItemType = init(12068);
    public static final NodeId NDimensionArrayItemType_Definition = init(12069);
    public static final NodeId NDimensionArrayItemType_ValuePrecision = init(12070);
    public static final NodeId NDimensionArrayItemType_InstrumentRange = init(12071);
    public static final NodeId NDimensionArrayItemType_EURange = init(12072);
    public static final NodeId NDimensionArrayItemType_EngineeringUnits = init(12073);
    public static final NodeId NDimensionArrayItemType_Title = init(12074);
    public static final NodeId NDimensionArrayItemType_AxisScaleType = init(12075);
    public static final NodeId NDimensionArrayItemType_AxisDefinition = init(12076);
    public static final NodeId AxisScaleEnumeration = init(12077);
    public static final NodeId AxisScaleEnumeration_EnumStrings = init(12078);
    public static final NodeId AxisInformation = init(12079);
    public static final NodeId XVType = init(12080);
    public static final NodeId AxisInformation_Encoding_DefaultXml = init(12081);
    public static final NodeId XVType_Encoding_DefaultXml = init(12082);
    public static final NodeId OpcUa_XmlSchema_AxisInformation = init(12083);
    public static final NodeId OpcUa_XmlSchema_AxisInformation_DataTypeVersion = init(12084);
    public static final NodeId OpcUa_XmlSchema_AxisInformation_DictionaryFragment = init(12085);
    public static final NodeId OpcUa_XmlSchema_XVType = init(12086);
    public static final NodeId OpcUa_XmlSchema_XVType_DataTypeVersion = init(12087);
    public static final NodeId OpcUa_XmlSchema_XVType_DictionaryFragment = init(12088);
    public static final NodeId AxisInformation_Encoding_DefaultBinary = init(12089);
    public static final NodeId XVType_Encoding_DefaultBinary = init(12090);
    public static final NodeId OpcUa_BinarySchema_AxisInformation = init(12091);
    public static final NodeId OpcUa_BinarySchema_AxisInformation_DataTypeVersion = init(12092);
    public static final NodeId OpcUa_BinarySchema_AxisInformation_DictionaryFragment = init(12093);
    public static final NodeId OpcUa_BinarySchema_XVType = init(12094);
    public static final NodeId OpcUa_BinarySchema_XVType_DataTypeVersion = init(12095);
    public static final NodeId OpcUa_BinarySchema_XVType_DictionaryFragment = init(12096);
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder = init(12097);
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics = init(12098);
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_SessionId = init(
        12099
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_SessionName = init(
        12100
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_ClientDescription = init(
        12101
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_ServerUri = init(
        12102
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_EndpointUrl = init(
        12103
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_LocaleIds = init(
        12104
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_ActualSessionTimeout = init(
        12105
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_MaxResponseMessageSize = init(
        12106
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_ClientConnectionTime = init(
        12107
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_ClientLastContactTime = init(
        12108
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_CurrentSubscriptionsCount = init(
        12109
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_CurrentMonitoredItemsCount = init(
        12110
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_CurrentPublishRequestsInQueue = init(
        12111
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_TotalRequestCount = init(
        12112
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_UnauthorizedRequestCount = init(
        12113
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_ReadCount = init(
        12114
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_HistoryReadCount = init(
        12115
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_WriteCount = init(
        12116
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_HistoryUpdateCount = init(
        12117
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_CallCount = init(
        12118
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_CreateMonitoredItemsCount = init(
        12119
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_ModifyMonitoredItemsCount = init(
        12120
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_SetMonitoringModeCount = init(
        12121
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_SetTriggeringCount = init(
        12122
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_DeleteMonitoredItemsCount = init(
        12123
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_CreateSubscriptionCount = init(
        12124
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_ModifySubscriptionCount = init(
        12125
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_SetPublishingModeCount = init(
        12126
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_PublishCount = init(
        12127
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_RepublishCount = init(
        12128
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_TransferSubscriptionsCount = init(
        12129
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_DeleteSubscriptionsCount = init(
        12130
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_AddNodesCount = init(
        12131
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_AddReferencesCount = init(
        12132
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_DeleteNodesCount = init(
        12133
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_DeleteReferencesCount = init(
        12134
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_BrowseCount = init(
        12135
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_BrowseNextCount = init(
        12136
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_TranslateBrowsePathsToNodeIdsCount = init(
        12137
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_QueryFirstCount = init(
        12138
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_QueryNextCount = init(
        12139
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_RegisterNodesCount = init(
        12140
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionDiagnostics_UnregisterNodesCount = init(
        12141
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics = init(
        12142
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics_SessionId = init(
        12143
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics_ClientUserIdOfSession = init(
        12144
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics_ClientUserIdHistory = init(
        12145
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics_AuthenticationMechanism = init(
        12146
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics_Encoding = init(
        12147
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics_TransportProtocol = init(
        12148
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics_SecurityMode = init(
        12149
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics_SecurityPolicyUri = init(
        12150
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SessionSecurityDiagnostics_ClientCertificate = init(
        12151
    );
    public static final NodeId SessionsDiagnosticsSummaryType_SessionPlaceholder_SubscriptionDiagnosticsArray = init(
        12152
    );
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerHistoryReadData = init(12153);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerHistoryReadEvents = init(12154);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerHistoryUpdateData = init(12155);
    public static final NodeId ServerType_ServerCapabilities_OperationLimits_MaxNodesPerHistoryUpdateEvents = init(
        12156
    );
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerHistoryReadData = init(12157);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerHistoryReadEvents = init(12158);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerHistoryUpdateData = init(12159);
    public static final NodeId ServerCapabilitiesType_OperationLimits_MaxNodesPerHistoryUpdateEvents = init(12160);
    public static final NodeId OperationLimitsType_MaxNodesPerHistoryReadData = init(12161);
    public static final NodeId OperationLimitsType_MaxNodesPerHistoryReadEvents = init(12162);
    public static final NodeId OperationLimitsType_MaxNodesPerHistoryUpdateData = init(12163);
    public static final NodeId OperationLimitsType_MaxNodesPerHistoryUpdateEvents = init(12164);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerHistoryReadData = init(12165);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerHistoryReadEvents = init(12166);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerHistoryUpdateData = init(12167);
    public static final NodeId Server_ServerCapabilities_OperationLimits_MaxNodesPerHistoryUpdateEvents = init(12168);
    public static final NodeId NamingRuleType_EnumValues = init(12169);
    public static final NodeId ViewVersion = init(12170);
    public static final NodeId ComplexNumberType = init(12171);
    public static final NodeId DoubleComplexNumberType = init(12172);
    public static final NodeId ComplexNumberType_Encoding_DefaultXml = init(12173);
    public static final NodeId DoubleComplexNumberType_Encoding_DefaultXml = init(12174);
    public static final NodeId OpcUa_XmlSchema_ComplexNumberType = init(12175);
    public static final NodeId OpcUa_XmlSchema_ComplexNumberType_DataTypeVersion = init(12176);
    public static final NodeId OpcUa_XmlSchema_ComplexNumberType_DictionaryFragment = init(12177);
    public static final NodeId OpcUa_XmlSchema_DoubleComplexNumberType = init(12178);
    public static final NodeId OpcUa_XmlSchema_DoubleComplexNumberType_DataTypeVersion = init(12179);
    public static final NodeId OpcUa_XmlSchema_DoubleComplexNumberType_DictionaryFragment = init(12180);
    public static final NodeId ComplexNumberType_Encoding_DefaultBinary = init(12181);
    public static final NodeId DoubleComplexNumberType_Encoding_DefaultBinary = init(12182);
    public static final NodeId OpcUa_BinarySchema_ComplexNumberType = init(12183);
    public static final NodeId OpcUa_BinarySchema_ComplexNumberType_DataTypeVersion = init(12184);
    public static final NodeId OpcUa_BinarySchema_ComplexNumberType_DictionaryFragment = init(12185);
    public static final NodeId OpcUa_BinarySchema_DoubleComplexNumberType = init(12186);
    public static final NodeId OpcUa_BinarySchema_DoubleComplexNumberType_DataTypeVersion = init(12187);
    public static final NodeId OpcUa_BinarySchema_DoubleComplexNumberType_DictionaryFragment = init(12188);
    public static final NodeId ServerOnNetwork = init(12189);
    public static final NodeId FindServersOnNetworkRequest = init(12190);
    public static final NodeId FindServersOnNetworkResponse = init(12191);
    public static final NodeId RegisterServer2Request = init(12193);
    public static final NodeId RegisterServer2Response = init(12194);
    public static final NodeId ServerOnNetwork_Encoding_DefaultXml = init(12195);
    public static final NodeId FindServersOnNetworkRequest_Encoding_DefaultXml = init(12196);
    public static final NodeId FindServersOnNetworkResponse_Encoding_DefaultXml = init(12197);
    public static final NodeId RegisterServer2Request_Encoding_DefaultXml = init(12199);
    public static final NodeId RegisterServer2Response_Encoding_DefaultXml = init(12200);
    public static final NodeId OpcUa_XmlSchema_ServerOnNetwork = init(12201);
    public static final NodeId OpcUa_XmlSchema_ServerOnNetwork_DataTypeVersion = init(12202);
    public static final NodeId OpcUa_XmlSchema_ServerOnNetwork_DictionaryFragment = init(12203);
    public static final NodeId ServerOnNetwork_Encoding_DefaultBinary = init(12207);
    public static final NodeId FindServersOnNetworkRequest_Encoding_DefaultBinary = init(12208);
    public static final NodeId FindServersOnNetworkResponse_Encoding_DefaultBinary = init(12209);
    public static final NodeId RegisterServer2Request_Encoding_DefaultBinary = init(12211);
    public static final NodeId RegisterServer2Response_Encoding_DefaultBinary = init(12212);
    public static final NodeId OpcUa_BinarySchema_ServerOnNetwork = init(12213);
    public static final NodeId OpcUa_BinarySchema_ServerOnNetwork_DataTypeVersion = init(12214);
    public static final NodeId OpcUa_BinarySchema_ServerOnNetwork_DictionaryFragment = init(12215);
    public static final NodeId ProgressEventType_Context = init(12502);
    public static final NodeId ProgressEventType_Progress = init(12503);
    public static final NodeId KerberosIdentityToken = init(12504);
    public static final NodeId KerberosIdentityToken_Encoding_DefaultXml = init(12505);
    public static final NodeId OpcUa_XmlSchema_KerberosIdentityToken = init(12506);
    public static final NodeId OpcUa_XmlSchema_KerberosIdentityToken_DataTypeVersion = init(12507);
    public static final NodeId OpcUa_XmlSchema_KerberosIdentityToken_DictionaryFragment = init(12508);
    public static final NodeId KerberosIdentityToken_Encoding_DefaultBinary = init(12509);
    public static final NodeId OpcUa_BinarySchema_KerberosIdentityToken = init(12510);
    public static final NodeId OpcUa_BinarySchema_KerberosIdentityToken_DataTypeVersion = init(12511);
    public static final NodeId OpcUa_BinarySchema_KerberosIdentityToken_DictionaryFragment = init(12512);
    public static final NodeId OpenWithMasksMethodType = init(12513);
    public static final NodeId OpenWithMasksMethodType_InputArguments = init(12514);
    public static final NodeId OpenWithMasksMethodType_OutputArguments = init(12515);
    public static final NodeId CloseAndUpdateMethodType = init(12516);
    public static final NodeId CloseAndUpdateMethodType_OutputArguments = init(12517);
    public static final NodeId AddCertificateMethodType = init(12518);
    public static final NodeId AddCertificateMethodType_InputArguments = init(12519);
    public static final NodeId RemoveCertificateMethodType = init(12520);
    public static final NodeId RemoveCertificateMethodType_InputArguments = init(12521);
    public static final NodeId TrustListType = init(12522);
    public static final NodeId TrustListType_Size = init(12523);
    public static final NodeId TrustListType_OpenCount = init(12526);
    public static final NodeId TrustListType_Open = init(12527);
    public static final NodeId TrustListType_Open_InputArguments = init(12528);
    public static final NodeId TrustListType_Open_OutputArguments = init(12529);
    public static final NodeId TrustListType_Close = init(12530);
    public static final NodeId TrustListType_Close_InputArguments = init(12531);
    public static final NodeId TrustListType_Read = init(12532);
    public static final NodeId TrustListType_Read_InputArguments = init(12533);
    public static final NodeId TrustListType_Read_OutputArguments = init(12534);
    public static final NodeId TrustListType_Write = init(12535);
    public static final NodeId TrustListType_Write_InputArguments = init(12536);
    public static final NodeId TrustListType_GetPosition = init(12537);
    public static final NodeId TrustListType_GetPosition_InputArguments = init(12538);
    public static final NodeId TrustListType_GetPosition_OutputArguments = init(12539);
    public static final NodeId TrustListType_SetPosition = init(12540);
    public static final NodeId TrustListType_SetPosition_InputArguments = init(12541);
    public static final NodeId TrustListType_LastUpdateTime = init(12542);
    public static final NodeId TrustListType_OpenWithMasks = init(12543);
    public static final NodeId TrustListType_OpenWithMasks_InputArguments = init(12544);
    public static final NodeId TrustListType_OpenWithMasks_OutputArguments = init(12545);
    public static final NodeId TrustListType_CloseAndUpdate = init(12546);
    public static final NodeId TrustListType_CloseAndUpdate_OutputArguments = init(12547);
    public static final NodeId TrustListType_AddCertificate = init(12548);
    public static final NodeId TrustListType_AddCertificate_InputArguments = init(12549);
    public static final NodeId TrustListType_RemoveCertificate = init(12550);
    public static final NodeId TrustListType_RemoveCertificate_InputArguments = init(12551);
    public static final NodeId TrustListMasks = init(12552);
    public static final NodeId TrustListMasks_EnumValues = init(12553);
    public static final NodeId TrustListDataType = init(12554);
    public static final NodeId CertificateGroupType = init(12555);
    public static final NodeId CertificateType = init(12556);
    public static final NodeId ApplicationCertificateType = init(12557);
    public static final NodeId HttpsCertificateType = init(12558);
    public static final NodeId RsaMinApplicationCertificateType = init(12559);
    public static final NodeId RsaSha256ApplicationCertificateType = init(12560);
    public static final NodeId TrustListUpdatedAuditEventType = init(12561);
    public static final NodeId TrustListUpdatedAuditEventType_EventId = init(12562);
    public static final NodeId TrustListUpdatedAuditEventType_EventType = init(12563);
    public static final NodeId TrustListUpdatedAuditEventType_SourceNode = init(12564);
    public static final NodeId TrustListUpdatedAuditEventType_SourceName = init(12565);
    public static final NodeId TrustListUpdatedAuditEventType_Time = init(12566);
    public static final NodeId TrustListUpdatedAuditEventType_ReceiveTime = init(12567);
    public static final NodeId TrustListUpdatedAuditEventType_LocalTime = init(12568);
    public static final NodeId TrustListUpdatedAuditEventType_Message = init(12569);
    public static final NodeId TrustListUpdatedAuditEventType_Severity = init(12570);
    public static final NodeId TrustListUpdatedAuditEventType_ActionTimeStamp = init(12571);
    public static final NodeId TrustListUpdatedAuditEventType_Status = init(12572);
    public static final NodeId TrustListUpdatedAuditEventType_ServerId = init(12573);
    public static final NodeId TrustListUpdatedAuditEventType_ClientAuditEntryId = init(12574);
    public static final NodeId TrustListUpdatedAuditEventType_ClientUserId = init(12575);
    public static final NodeId TrustListUpdatedAuditEventType_MethodId = init(12576);
    public static final NodeId TrustListUpdatedAuditEventType_InputArguments = init(12577);
    public static final NodeId UpdateCertificateMethodType = init(12578);
    public static final NodeId UpdateCertificateMethodType_InputArguments = init(12579);
    public static final NodeId UpdateCertificateMethodType_OutputArguments = init(12580);
    public static final NodeId ServerConfigurationType = init(12581);
    public static final NodeId ServerConfigurationType_SupportedPrivateKeyFormats = init(12583);
    public static final NodeId ServerConfigurationType_MaxTrustListSize = init(12584);
    public static final NodeId ServerConfigurationType_MulticastDnsEnabled = init(12585);
    public static final NodeId ServerConfigurationType_UpdateCertificate = init(12616);
    public static final NodeId ServerConfigurationType_UpdateCertificate_InputArguments = init(12617);
    public static final NodeId ServerConfigurationType_UpdateCertificate_OutputArguments = init(12618);
    public static final NodeId CertificateUpdatedAuditEventType = init(12620);
    public static final NodeId CertificateUpdatedAuditEventType_EventId = init(12621);
    public static final NodeId CertificateUpdatedAuditEventType_EventType = init(12622);
    public static final NodeId CertificateUpdatedAuditEventType_SourceNode = init(12623);
    public static final NodeId CertificateUpdatedAuditEventType_SourceName = init(12624);
    public static final NodeId CertificateUpdatedAuditEventType_Time = init(12625);
    public static final NodeId CertificateUpdatedAuditEventType_ReceiveTime = init(12626);
    public static final NodeId CertificateUpdatedAuditEventType_LocalTime = init(12627);
    public static final NodeId CertificateUpdatedAuditEventType_Message = init(12628);
    public static final NodeId CertificateUpdatedAuditEventType_Severity = init(12629);
    public static final NodeId CertificateUpdatedAuditEventType_ActionTimeStamp = init(12630);
    public static final NodeId CertificateUpdatedAuditEventType_Status = init(12631);
    public static final NodeId CertificateUpdatedAuditEventType_ServerId = init(12632);
    public static final NodeId CertificateUpdatedAuditEventType_ClientAuditEntryId = init(12633);
    public static final NodeId CertificateUpdatedAuditEventType_ClientUserId = init(12634);
    public static final NodeId CertificateUpdatedAuditEventType_MethodId = init(12635);
    public static final NodeId CertificateUpdatedAuditEventType_InputArguments = init(12636);
    public static final NodeId ServerConfiguration = init(12637);
    public static final NodeId ServerConfiguration_SupportedPrivateKeyFormats = init(12639);
    public static final NodeId ServerConfiguration_MaxTrustListSize = init(12640);
    public static final NodeId ServerConfiguration_MulticastDnsEnabled = init(12641);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList = init(12642);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Size = init(
        12643
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_OpenCount = init(
        12646
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Open = init(
        12647
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Open_InputArguments = init(
        12648
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Open_OutputArguments = init(
        12649
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Close = init(
        12650
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Close_InputArguments = init(
        12651
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Read = init(
        12652
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Read_InputArguments = init(
        12653
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Read_OutputArguments = init(
        12654
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Write = init(
        12655
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Write_InputArguments = init(
        12656
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition = init(
        12657
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition_InputArguments = init(
        12658
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition_OutputArguments = init(
        12659
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_SetPosition = init(
        12660
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_SetPosition_InputArguments = init(
        12661
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_LastUpdateTime = init(
        12662
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks = init(
        12663
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks_InputArguments = init(
        12664
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks_OutputArguments = init(
        12665
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate = init(
        12666
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate_OutputArguments = init(
        12667
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_AddCertificate = init(
        12668
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_AddCertificate_InputArguments = init(
        12669
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_RemoveCertificate = init(
        12670
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_RemoveCertificate_InputArguments = init(
        12671
    );
    public static final NodeId TrustListDataType_Encoding_DefaultXml = init(12676);
    public static final NodeId OpcUa_XmlSchema_TrustListDataType = init(12677);
    public static final NodeId OpcUa_XmlSchema_TrustListDataType_DataTypeVersion = init(12678);
    public static final NodeId OpcUa_XmlSchema_TrustListDataType_DictionaryFragment = init(12679);
    public static final NodeId TrustListDataType_Encoding_DefaultBinary = init(12680);
    public static final NodeId OpcUa_BinarySchema_TrustListDataType = init(12681);
    public static final NodeId OpcUa_BinarySchema_TrustListDataType_DataTypeVersion = init(12682);
    public static final NodeId OpcUa_BinarySchema_TrustListDataType_DictionaryFragment = init(12683);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_Writable = init(12684);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_UserWritable = init(12685);
    public static final NodeId FileType_Writable = init(12686);
    public static final NodeId FileType_UserWritable = init(12687);
    public static final NodeId AddressSpaceFileType_Writable = init(12688);
    public static final NodeId AddressSpaceFileType_UserWritable = init(12689);
    public static final NodeId NamespaceMetadataType_NamespaceFile_Writable = init(12690);
    public static final NodeId NamespaceMetadataType_NamespaceFile_UserWritable = init(12691);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_Writable = init(12692);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_UserWritable = init(12693);
    public static final NodeId NamespacesType_AddressSpaceFile_Writable = init(12694);
    public static final NodeId NamespacesType_AddressSpaceFile_UserWritable = init(12695);
    public static final NodeId Server_Namespaces_AddressSpaceFile_Writable = init(12696);
    public static final NodeId Server_Namespaces_AddressSpaceFile_UserWritable = init(12697);
    public static final NodeId TrustListType_Writable = init(12698);
    public static final NodeId TrustListType_UserWritable = init(12699);
    public static final NodeId CloseAndUpdateMethodType_InputArguments = init(12704);
    public static final NodeId TrustListType_CloseAndUpdate_InputArguments = init(12705);
    public static final NodeId ServerConfigurationType_ServerCapabilities = init(12708);
    public static final NodeId ServerConfiguration_ServerCapabilities = init(12710);
    public static final NodeId OpcUa_XmlSchema_RelativePathElement = init(12712);
    public static final NodeId OpcUa_XmlSchema_RelativePathElement_DataTypeVersion = init(12713);
    public static final NodeId OpcUa_XmlSchema_RelativePathElement_DictionaryFragment = init(12714);
    public static final NodeId OpcUa_XmlSchema_RelativePath = init(12715);
    public static final NodeId OpcUa_XmlSchema_RelativePath_DataTypeVersion = init(12716);
    public static final NodeId OpcUa_XmlSchema_RelativePath_DictionaryFragment = init(12717);
    public static final NodeId OpcUa_BinarySchema_RelativePathElement = init(12718);
    public static final NodeId OpcUa_BinarySchema_RelativePathElement_DataTypeVersion = init(12719);
    public static final NodeId OpcUa_BinarySchema_RelativePathElement_DictionaryFragment = init(12720);
    public static final NodeId OpcUa_BinarySchema_RelativePath = init(12721);
    public static final NodeId OpcUa_BinarySchema_RelativePath_DataTypeVersion = init(12722);
    public static final NodeId OpcUa_BinarySchema_RelativePath_DictionaryFragment = init(12723);
    public static final NodeId ServerConfigurationType_CreateSigningRequest = init(12731);
    public static final NodeId ServerConfigurationType_CreateSigningRequest_InputArguments = init(12732);
    public static final NodeId ServerConfigurationType_CreateSigningRequest_OutputArguments = init(12733);
    public static final NodeId ServerConfigurationType_ApplyChanges = init(12734);
    public static final NodeId ServerConfiguration_CreateSigningRequest = init(12737);
    public static final NodeId ServerConfiguration_CreateSigningRequest_InputArguments = init(12738);
    public static final NodeId ServerConfiguration_CreateSigningRequest_OutputArguments = init(12739);
    public static final NodeId ServerConfiguration_ApplyChanges = init(12740);
    public static final NodeId CreateSigningRequestMethodType = init(12741);
    public static final NodeId CreateSigningRequestMethodType_InputArguments = init(12742);
    public static final NodeId CreateSigningRequestMethodType_OutputArguments = init(12743);
    public static final NodeId OptionSetValues = init(12745);
    public static final NodeId ServerType_SetSubscriptionDurable = init(12746);
    public static final NodeId ServerType_SetSubscriptionDurable_InputArguments = init(12747);
    public static final NodeId ServerType_SetSubscriptionDurable_OutputArguments = init(12748);
    public static final NodeId Server_SetSubscriptionDurable = init(12749);
    public static final NodeId Server_SetSubscriptionDurable_InputArguments = init(12750);
    public static final NodeId Server_SetSubscriptionDurable_OutputArguments = init(12751);
    public static final NodeId SetSubscriptionDurableMethodType = init(12752);
    public static final NodeId SetSubscriptionDurableMethodType_InputArguments = init(12753);
    public static final NodeId SetSubscriptionDurableMethodType_OutputArguments = init(12754);
    public static final NodeId OptionSet = init(12755);
    public static final NodeId Union = init(12756);
    public static final NodeId OptionSet_Encoding_DefaultXml = init(12757);
    public static final NodeId Union_Encoding_DefaultXml = init(12758);
    public static final NodeId OpcUa_XmlSchema_OptionSet = init(12759);
    public static final NodeId OpcUa_XmlSchema_OptionSet_DataTypeVersion = init(12760);
    public static final NodeId OpcUa_XmlSchema_OptionSet_DictionaryFragment = init(12761);
    public static final NodeId OpcUa_XmlSchema_Union = init(12762);
    public static final NodeId OpcUa_XmlSchema_Union_DataTypeVersion = init(12763);
    public static final NodeId OpcUa_XmlSchema_Union_DictionaryFragment = init(12764);
    public static final NodeId OptionSet_Encoding_DefaultBinary = init(12765);
    public static final NodeId Union_Encoding_DefaultBinary = init(12766);
    public static final NodeId OpcUa_BinarySchema_OptionSet = init(12767);
    public static final NodeId OpcUa_BinarySchema_OptionSet_DataTypeVersion = init(12768);
    public static final NodeId OpcUa_BinarySchema_OptionSet_DictionaryFragment = init(12769);
    public static final NodeId OpcUa_BinarySchema_Union = init(12770);
    public static final NodeId OpcUa_BinarySchema_Union_DataTypeVersion = init(12771);
    public static final NodeId OpcUa_BinarySchema_Union_DictionaryFragment = init(12772);
    public static final NodeId GetRejectedListMethodType = init(12773);
    public static final NodeId GetRejectedListMethodType_OutputArguments = init(12774);
    public static final NodeId ServerConfigurationType_GetRejectedList = init(12775);
    public static final NodeId ServerConfigurationType_GetRejectedList_OutputArguments = init(12776);
    public static final NodeId ServerConfiguration_GetRejectedList = init(12777);
    public static final NodeId ServerConfiguration_GetRejectedList_OutputArguments = init(12778);
    public static final NodeId SamplingIntervalDiagnosticsArrayType_SamplingIntervalDiagnostics = init(12779);
    public static final NodeId SamplingIntervalDiagnosticsArrayType_SamplingIntervalDiagnostics_SamplingInterval = init(
        12780
    );
    public static final NodeId SamplingIntervalDiagnosticsArrayType_SamplingIntervalDiagnostics_SampledMonitoredItemsCount = init(
        12781
    );
    public static final NodeId SamplingIntervalDiagnosticsArrayType_SamplingIntervalDiagnostics_MaxSampledMonitoredItemsCount = init(
        12782
    );
    public static final NodeId SamplingIntervalDiagnosticsArrayType_SamplingIntervalDiagnostics_DisabledMonitoredItemsSamplingCount = init(
        12783
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics = init(12784);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_SessionId = init(12785);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_SubscriptionId = init(12786);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_Priority = init(12787);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_PublishingInterval = init(
        12788
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_MaxKeepAliveCount = init(12789);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_MaxLifetimeCount = init(12790);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_MaxNotificationsPerPublish = init(
        12791
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_PublishingEnabled = init(12792);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_ModifyCount = init(12793);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_EnableCount = init(12794);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_DisableCount = init(12795);
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_RepublishRequestCount = init(
        12796
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_RepublishMessageRequestCount = init(
        12797
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_RepublishMessageCount = init(
        12798
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_TransferRequestCount = init(
        12799
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_TransferredToAltClientCount = init(
        12800
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_TransferredToSameClientCount = init(
        12801
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_PublishRequestCount = init(
        12802
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_DataChangeNotificationsCount = init(
        12803
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_EventNotificationsCount = init(
        12804
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_NotificationsCount = init(
        12805
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_LatePublishRequestCount = init(
        12806
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_CurrentKeepAliveCount = init(
        12807
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_CurrentLifetimeCount = init(
        12808
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_UnacknowledgedMessageCount = init(
        12809
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_DiscardedMessageCount = init(
        12810
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_MonitoredItemCount = init(
        12811
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_DisabledMonitoredItemCount = init(
        12812
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_MonitoringQueueOverflowCount = init(
        12813
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_NextSequenceNumber = init(
        12814
    );
    public static final NodeId SubscriptionDiagnosticsArrayType_SubscriptionDiagnostics_EventQueueOverFlowCount = init(
        12815
    );
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics = init(12816);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_SessionId = init(12817);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_SessionName = init(12818);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_ClientDescription = init(12819);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_ServerUri = init(12820);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_EndpointUrl = init(12821);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_LocaleIds = init(12822);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_ActualSessionTimeout = init(12823);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_MaxResponseMessageSize = init(12824);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_ClientConnectionTime = init(12825);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_ClientLastContactTime = init(12826);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_CurrentSubscriptionsCount = init(12827);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_CurrentMonitoredItemsCount = init(12828);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_CurrentPublishRequestsInQueue = init(
        12829
    );
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_TotalRequestCount = init(12830);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_UnauthorizedRequestCount = init(12831);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_ReadCount = init(12832);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_HistoryReadCount = init(12833);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_WriteCount = init(12834);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_HistoryUpdateCount = init(12835);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_CallCount = init(12836);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_CreateMonitoredItemsCount = init(12837);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_ModifyMonitoredItemsCount = init(12838);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_SetMonitoringModeCount = init(12839);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_SetTriggeringCount = init(12840);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_DeleteMonitoredItemsCount = init(12841);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_CreateSubscriptionCount = init(12842);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_ModifySubscriptionCount = init(12843);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_SetPublishingModeCount = init(12844);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_PublishCount = init(12845);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_RepublishCount = init(12846);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_TransferSubscriptionsCount = init(12847);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_DeleteSubscriptionsCount = init(12848);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_AddNodesCount = init(12849);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_AddReferencesCount = init(12850);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_DeleteNodesCount = init(12851);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_DeleteReferencesCount = init(12852);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_BrowseCount = init(12853);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_BrowseNextCount = init(12854);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_TranslateBrowsePathsToNodeIdsCount = init(
        12855
    );
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_QueryFirstCount = init(12856);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_QueryNextCount = init(12857);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_RegisterNodesCount = init(12858);
    public static final NodeId SessionDiagnosticsArrayType_SessionDiagnostics_UnregisterNodesCount = init(12859);
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics = init(12860);
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics_SessionId = init(12861);
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics_ClientUserIdOfSession = init(
        12862
    );
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics_ClientUserIdHistory = init(
        12863
    );
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics_AuthenticationMechanism = init(
        12864
    );
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics_Encoding = init(12865);
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics_TransportProtocol = init(
        12866
    );
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics_SecurityMode = init(
        12867
    );
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics_SecurityPolicyUri = init(
        12868
    );
    public static final NodeId SessionSecurityDiagnosticsArrayType_SessionSecurityDiagnostics_ClientCertificate = init(
        12869
    );
    public static final NodeId ServerType_ResendData = init(12871);
    public static final NodeId ServerType_ResendData_InputArguments = init(12872);
    public static final NodeId Server_ResendData = init(12873);
    public static final NodeId Server_ResendData_InputArguments = init(12874);
    public static final NodeId ResendDataMethodType = init(12875);
    public static final NodeId ResendDataMethodType_InputArguments = init(12876);
    public static final NodeId NormalizedString = init(12877);
    public static final NodeId DecimalString = init(12878);
    public static final NodeId DurationString = init(12879);
    public static final NodeId TimeString = init(12880);
    public static final NodeId DateString = init(12881);
    public static final NodeId ServerType_EstimatedReturnTime = init(12882);
    public static final NodeId ServerType_RequestServerStateChange = init(12883);
    public static final NodeId ServerType_RequestServerStateChange_InputArguments = init(12884);
    public static final NodeId Server_EstimatedReturnTime = init(12885);
    public static final NodeId Server_RequestServerStateChange = init(12886);
    public static final NodeId Server_RequestServerStateChange_InputArguments = init(12887);
    public static final NodeId RequestServerStateChangeMethodType = init(12888);
    public static final NodeId RequestServerStateChangeMethodType_InputArguments = init(12889);
    public static final NodeId DiscoveryConfiguration = init(12890);
    public static final NodeId MdnsDiscoveryConfiguration = init(12891);
    public static final NodeId DiscoveryConfiguration_Encoding_DefaultXml = init(12892);
    public static final NodeId MdnsDiscoveryConfiguration_Encoding_DefaultXml = init(12893);
    public static final NodeId OpcUa_XmlSchema_DiscoveryConfiguration = init(12894);
    public static final NodeId OpcUa_XmlSchema_DiscoveryConfiguration_DataTypeVersion = init(12895);
    public static final NodeId OpcUa_XmlSchema_DiscoveryConfiguration_DictionaryFragment = init(12896);
    public static final NodeId OpcUa_XmlSchema_MdnsDiscoveryConfiguration = init(12897);
    public static final NodeId OpcUa_XmlSchema_MdnsDiscoveryConfiguration_DataTypeVersion = init(12898);
    public static final NodeId OpcUa_XmlSchema_MdnsDiscoveryConfiguration_DictionaryFragment = init(12899);
    public static final NodeId DiscoveryConfiguration_Encoding_DefaultBinary = init(12900);
    public static final NodeId MdnsDiscoveryConfiguration_Encoding_DefaultBinary = init(12901);
    public static final NodeId OpcUa_BinarySchema_DiscoveryConfiguration = init(12902);
    public static final NodeId OpcUa_BinarySchema_DiscoveryConfiguration_DataTypeVersion = init(12903);
    public static final NodeId OpcUa_BinarySchema_DiscoveryConfiguration_DictionaryFragment = init(12904);
    public static final NodeId OpcUa_BinarySchema_MdnsDiscoveryConfiguration = init(12905);
    public static final NodeId OpcUa_BinarySchema_MdnsDiscoveryConfiguration_DataTypeVersion = init(12906);
    public static final NodeId OpcUa_BinarySchema_MdnsDiscoveryConfiguration_DictionaryFragment = init(12907);
    public static final NodeId MaxByteStringLength = init(12908);
    public static final NodeId ServerType_ServerCapabilities_MaxByteStringLength = init(12909);
    public static final NodeId ServerCapabilitiesType_MaxByteStringLength = init(12910);
    public static final NodeId Server_ServerCapabilities_MaxByteStringLength = init(12911);
    public static final NodeId ConditionType_ConditionRefresh2 = init(12912);
    public static final NodeId ConditionType_ConditionRefresh2_InputArguments = init(12913);
    public static final NodeId ConditionRefresh2MethodType = init(12914);
    public static final NodeId ConditionRefresh2MethodType_InputArguments = init(12915);
    public static final NodeId DialogConditionType_ConditionRefresh2 = init(12916);
    public static final NodeId DialogConditionType_ConditionRefresh2_InputArguments = init(12917);
    public static final NodeId AcknowledgeableConditionType_ConditionRefresh2 = init(12918);
    public static final NodeId AcknowledgeableConditionType_ConditionRefresh2_InputArguments = init(12919);
    public static final NodeId AlarmConditionType_ConditionRefresh2 = init(12984);
    public static final NodeId AlarmConditionType_ConditionRefresh2_InputArguments = init(12985);
    public static final NodeId LimitAlarmType_ConditionRefresh2 = init(12986);
    public static final NodeId LimitAlarmType_ConditionRefresh2_InputArguments = init(12987);
    public static final NodeId ExclusiveLimitAlarmType_ConditionRefresh2 = init(12988);
    public static final NodeId ExclusiveLimitAlarmType_ConditionRefresh2_InputArguments = init(12989);
    public static final NodeId NonExclusiveLimitAlarmType_ConditionRefresh2 = init(12990);
    public static final NodeId NonExclusiveLimitAlarmType_ConditionRefresh2_InputArguments = init(12991);
    public static final NodeId NonExclusiveLevelAlarmType_ConditionRefresh2 = init(12992);
    public static final NodeId NonExclusiveLevelAlarmType_ConditionRefresh2_InputArguments = init(12993);
    public static final NodeId ExclusiveLevelAlarmType_ConditionRefresh2 = init(12994);
    public static final NodeId ExclusiveLevelAlarmType_ConditionRefresh2_InputArguments = init(12995);
    public static final NodeId NonExclusiveDeviationAlarmType_ConditionRefresh2 = init(12996);
    public static final NodeId NonExclusiveDeviationAlarmType_ConditionRefresh2_InputArguments = init(12997);
    public static final NodeId ExclusiveDeviationAlarmType_ConditionRefresh2 = init(12998);
    public static final NodeId ExclusiveDeviationAlarmType_ConditionRefresh2_InputArguments = init(12999);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConditionRefresh2 = init(13000);
    public static final NodeId NonExclusiveRateOfChangeAlarmType_ConditionRefresh2_InputArguments = init(13001);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConditionRefresh2 = init(13002);
    public static final NodeId ExclusiveRateOfChangeAlarmType_ConditionRefresh2_InputArguments = init(13003);
    public static final NodeId DiscreteAlarmType_ConditionRefresh2 = init(13004);
    public static final NodeId DiscreteAlarmType_ConditionRefresh2_InputArguments = init(13005);
    public static final NodeId OffNormalAlarmType_ConditionRefresh2 = init(13006);
    public static final NodeId OffNormalAlarmType_ConditionRefresh2_InputArguments = init(13007);
    public static final NodeId SystemOffNormalAlarmType_ConditionRefresh2 = init(13008);
    public static final NodeId SystemOffNormalAlarmType_ConditionRefresh2_InputArguments = init(13009);
    public static final NodeId TripAlarmType_ConditionRefresh2 = init(13010);
    public static final NodeId TripAlarmType_ConditionRefresh2_InputArguments = init(13011);
    public static final NodeId CertificateExpirationAlarmType = init(13225);
    public static final NodeId CertificateExpirationAlarmType_EventId = init(13226);
    public static final NodeId CertificateExpirationAlarmType_EventType = init(13227);
    public static final NodeId CertificateExpirationAlarmType_SourceNode = init(13228);
    public static final NodeId CertificateExpirationAlarmType_SourceName = init(13229);
    public static final NodeId CertificateExpirationAlarmType_Time = init(13230);
    public static final NodeId CertificateExpirationAlarmType_ReceiveTime = init(13231);
    public static final NodeId CertificateExpirationAlarmType_LocalTime = init(13232);
    public static final NodeId CertificateExpirationAlarmType_Message = init(13233);
    public static final NodeId CertificateExpirationAlarmType_Severity = init(13234);
    public static final NodeId CertificateExpirationAlarmType_ConditionClassId = init(13235);
    public static final NodeId CertificateExpirationAlarmType_ConditionClassName = init(13236);
    public static final NodeId CertificateExpirationAlarmType_ConditionName = init(13237);
    public static final NodeId CertificateExpirationAlarmType_BranchId = init(13238);
    public static final NodeId CertificateExpirationAlarmType_Retain = init(13239);
    public static final NodeId CertificateExpirationAlarmType_EnabledState = init(13240);
    public static final NodeId CertificateExpirationAlarmType_EnabledState_Id = init(13241);
    public static final NodeId CertificateExpirationAlarmType_EnabledState_Name = init(13242);
    public static final NodeId CertificateExpirationAlarmType_EnabledState_Number = init(13243);
    public static final NodeId CertificateExpirationAlarmType_EnabledState_EffectiveDisplayName = init(13244);
    public static final NodeId CertificateExpirationAlarmType_EnabledState_TransitionTime = init(13245);
    public static final NodeId CertificateExpirationAlarmType_EnabledState_EffectiveTransitionTime = init(13246);
    public static final NodeId CertificateExpirationAlarmType_EnabledState_TrueState = init(13247);
    public static final NodeId CertificateExpirationAlarmType_EnabledState_FalseState = init(13248);
    public static final NodeId CertificateExpirationAlarmType_Quality = init(13249);
    public static final NodeId CertificateExpirationAlarmType_Quality_SourceTimestamp = init(13250);
    public static final NodeId CertificateExpirationAlarmType_LastSeverity = init(13251);
    public static final NodeId CertificateExpirationAlarmType_LastSeverity_SourceTimestamp = init(13252);
    public static final NodeId CertificateExpirationAlarmType_Comment = init(13253);
    public static final NodeId CertificateExpirationAlarmType_Comment_SourceTimestamp = init(13254);
    public static final NodeId CertificateExpirationAlarmType_ClientUserId = init(13255);
    public static final NodeId CertificateExpirationAlarmType_Disable = init(13256);
    public static final NodeId CertificateExpirationAlarmType_Enable = init(13257);
    public static final NodeId CertificateExpirationAlarmType_AddComment = init(13258);
    public static final NodeId CertificateExpirationAlarmType_AddComment_InputArguments = init(13259);
    public static final NodeId CertificateExpirationAlarmType_ConditionRefresh = init(13260);
    public static final NodeId CertificateExpirationAlarmType_ConditionRefresh_InputArguments = init(13261);
    public static final NodeId CertificateExpirationAlarmType_ConditionRefresh2 = init(13262);
    public static final NodeId CertificateExpirationAlarmType_ConditionRefresh2_InputArguments = init(13263);
    public static final NodeId CertificateExpirationAlarmType_AckedState = init(13264);
    public static final NodeId CertificateExpirationAlarmType_AckedState_Id = init(13265);
    public static final NodeId CertificateExpirationAlarmType_AckedState_Name = init(13266);
    public static final NodeId CertificateExpirationAlarmType_AckedState_Number = init(13267);
    public static final NodeId CertificateExpirationAlarmType_AckedState_EffectiveDisplayName = init(13268);
    public static final NodeId CertificateExpirationAlarmType_AckedState_TransitionTime = init(13269);
    public static final NodeId CertificateExpirationAlarmType_AckedState_EffectiveTransitionTime = init(13270);
    public static final NodeId CertificateExpirationAlarmType_AckedState_TrueState = init(13271);
    public static final NodeId CertificateExpirationAlarmType_AckedState_FalseState = init(13272);
    public static final NodeId CertificateExpirationAlarmType_ConfirmedState = init(13273);
    public static final NodeId CertificateExpirationAlarmType_ConfirmedState_Id = init(13274);
    public static final NodeId CertificateExpirationAlarmType_ConfirmedState_Name = init(13275);
    public static final NodeId CertificateExpirationAlarmType_ConfirmedState_Number = init(13276);
    public static final NodeId CertificateExpirationAlarmType_ConfirmedState_EffectiveDisplayName = init(13277);
    public static final NodeId CertificateExpirationAlarmType_ConfirmedState_TransitionTime = init(13278);
    public static final NodeId CertificateExpirationAlarmType_ConfirmedState_EffectiveTransitionTime = init(13279);
    public static final NodeId CertificateExpirationAlarmType_ConfirmedState_TrueState = init(13280);
    public static final NodeId CertificateExpirationAlarmType_ConfirmedState_FalseState = init(13281);
    public static final NodeId CertificateExpirationAlarmType_Acknowledge = init(13282);
    public static final NodeId CertificateExpirationAlarmType_Acknowledge_InputArguments = init(13283);
    public static final NodeId CertificateExpirationAlarmType_Confirm = init(13284);
    public static final NodeId CertificateExpirationAlarmType_Confirm_InputArguments = init(13285);
    public static final NodeId CertificateExpirationAlarmType_ActiveState = init(13286);
    public static final NodeId CertificateExpirationAlarmType_ActiveState_Id = init(13287);
    public static final NodeId CertificateExpirationAlarmType_ActiveState_Name = init(13288);
    public static final NodeId CertificateExpirationAlarmType_ActiveState_Number = init(13289);
    public static final NodeId CertificateExpirationAlarmType_ActiveState_EffectiveDisplayName = init(13290);
    public static final NodeId CertificateExpirationAlarmType_ActiveState_TransitionTime = init(13291);
    public static final NodeId CertificateExpirationAlarmType_ActiveState_EffectiveTransitionTime = init(13292);
    public static final NodeId CertificateExpirationAlarmType_ActiveState_TrueState = init(13293);
    public static final NodeId CertificateExpirationAlarmType_ActiveState_FalseState = init(13294);
    public static final NodeId CertificateExpirationAlarmType_InputNode = init(13295);
    public static final NodeId CertificateExpirationAlarmType_SuppressedState = init(13296);
    public static final NodeId CertificateExpirationAlarmType_SuppressedState_Id = init(13297);
    public static final NodeId CertificateExpirationAlarmType_SuppressedState_Name = init(13298);
    public static final NodeId CertificateExpirationAlarmType_SuppressedState_Number = init(13299);
    public static final NodeId CertificateExpirationAlarmType_SuppressedState_EffectiveDisplayName = init(13300);
    public static final NodeId CertificateExpirationAlarmType_SuppressedState_TransitionTime = init(13301);
    public static final NodeId CertificateExpirationAlarmType_SuppressedState_EffectiveTransitionTime = init(13302);
    public static final NodeId CertificateExpirationAlarmType_SuppressedState_TrueState = init(13303);
    public static final NodeId CertificateExpirationAlarmType_SuppressedState_FalseState = init(13304);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState = init(13305);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_CurrentState = init(13306);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_CurrentState_Id = init(13307);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_CurrentState_Name = init(13308);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_CurrentState_Number = init(13309);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_CurrentState_EffectiveDisplayName = init(
        13310
    );
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_LastTransition = init(13311);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_LastTransition_Id = init(13312);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_LastTransition_Name = init(13313);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_LastTransition_Number = init(13314);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_LastTransition_TransitionTime = init(13315);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_LastTransition_EffectiveTransitionTime = init(
        13316
    );
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_UnshelveTime = init(13317);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_Unshelve = init(13318);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_OneShotShelve = init(13319);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_TimedShelve = init(13320);
    public static final NodeId CertificateExpirationAlarmType_ShelvingState_TimedShelve_InputArguments = init(13321);
    public static final NodeId CertificateExpirationAlarmType_SuppressedOrShelved = init(13322);
    public static final NodeId CertificateExpirationAlarmType_MaxTimeShelved = init(13323);
    public static final NodeId CertificateExpirationAlarmType_NormalState = init(13324);
    public static final NodeId CertificateExpirationAlarmType_ExpirationDate = init(13325);
    public static final NodeId CertificateExpirationAlarmType_CertificateType = init(13326);
    public static final NodeId CertificateExpirationAlarmType_Certificate = init(13327);
    public static final NodeId ServerType_Namespaces_AddressSpaceFile_MimeType = init(13340);
    public static final NodeId FileType_MimeType = init(13341);
    public static final NodeId CreateDirectoryMethodType = init(13342);
    public static final NodeId CreateDirectoryMethodType_InputArguments = init(13343);
    public static final NodeId CreateDirectoryMethodType_OutputArguments = init(13344);
    public static final NodeId CreateFileMethodType = init(13345);
    public static final NodeId CreateFileMethodType_InputArguments = init(13346);
    public static final NodeId CreateFileMethodType_OutputArguments = init(13347);
    public static final NodeId DeleteFileMethodType = init(13348);
    public static final NodeId DeleteFileMethodType_InputArguments = init(13349);
    public static final NodeId MoveOrCopyMethodType = init(13350);
    public static final NodeId MoveOrCopyMethodType_InputArguments = init(13351);
    public static final NodeId MoveOrCopyMethodType_OutputArguments = init(13352);
    public static final NodeId FileDirectoryType = init(13353);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex = init(13354);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_CreateDirectory = init(13355);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_CreateDirectory_InputArguments = init(13356);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_CreateDirectory_OutputArguments = init(13357);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_CreateFile = init(13358);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_CreateFile_InputArguments = init(13359);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_CreateFile_OutputArguments = init(13360);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_Delete = init(13361);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_Delete_InputArguments = init(13362);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_MoveOrCopy = init(13363);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_MoveOrCopy_InputArguments = init(13364);
    public static final NodeId FileDirectoryType_xFileDirectoryNamex_MoveOrCopy_OutputArguments = init(13365);
    public static final NodeId FileDirectoryType_xFileNamex = init(13366);
    public static final NodeId FileDirectoryType_xFileNamex_Size = init(13367);
    public static final NodeId FileDirectoryType_xFileNamex_Writable = init(13368);
    public static final NodeId FileDirectoryType_xFileNamex_UserWritable = init(13369);
    public static final NodeId FileDirectoryType_xFileNamex_OpenCount = init(13370);
    public static final NodeId FileDirectoryType_xFileNamex_MimeType = init(13371);
    public static final NodeId FileDirectoryType_xFileNamex_Open = init(13372);
    public static final NodeId FileDirectoryType_xFileNamex_Open_InputArguments = init(13373);
    public static final NodeId FileDirectoryType_xFileNamex_Open_OutputArguments = init(13374);
    public static final NodeId FileDirectoryType_xFileNamex_Close = init(13375);
    public static final NodeId FileDirectoryType_xFileNamex_Close_InputArguments = init(13376);
    public static final NodeId FileDirectoryType_xFileNamex_Read = init(13377);
    public static final NodeId FileDirectoryType_xFileNamex_Read_InputArguments = init(13378);
    public static final NodeId FileDirectoryType_xFileNamex_Read_OutputArguments = init(13379);
    public static final NodeId FileDirectoryType_xFileNamex_Write = init(13380);
    public static final NodeId FileDirectoryType_xFileNamex_Write_InputArguments = init(13381);
    public static final NodeId FileDirectoryType_xFileNamex_GetPosition = init(13382);
    public static final NodeId FileDirectoryType_xFileNamex_GetPosition_InputArguments = init(13383);
    public static final NodeId FileDirectoryType_xFileNamex_GetPosition_OutputArguments = init(13384);
    public static final NodeId FileDirectoryType_xFileNamex_SetPosition = init(13385);
    public static final NodeId FileDirectoryType_xFileNamex_SetPosition_InputArguments = init(13386);
    public static final NodeId FileDirectoryType_CreateDirectory = init(13387);
    public static final NodeId FileDirectoryType_CreateDirectory_InputArguments = init(13388);
    public static final NodeId FileDirectoryType_CreateDirectory_OutputArguments = init(13389);
    public static final NodeId FileDirectoryType_CreateFile = init(13390);
    public static final NodeId FileDirectoryType_CreateFile_InputArguments = init(13391);
    public static final NodeId FileDirectoryType_CreateFile_OutputArguments = init(13392);
    public static final NodeId FileDirectoryType_Delete = init(13393);
    public static final NodeId FileDirectoryType_Delete_InputArguments = init(13394);
    public static final NodeId FileDirectoryType_MoveOrCopy = init(13395);
    public static final NodeId FileDirectoryType_MoveOrCopy_InputArguments = init(13396);
    public static final NodeId FileDirectoryType_MoveOrCopy_OutputArguments = init(13397);
    public static final NodeId AddressSpaceFileType_MimeType = init(13398);
    public static final NodeId NamespaceMetadataType_NamespaceFile_MimeType = init(13399);
    public static final NodeId NamespacesType_NamespaceIdentifier_NamespaceFile_MimeType = init(13400);
    public static final NodeId NamespacesType_AddressSpaceFile_MimeType = init(13401);
    public static final NodeId Server_Namespaces_AddressSpaceFile_MimeType = init(13402);
    public static final NodeId TrustListType_MimeType = init(13403);
    public static final NodeId CertificateGroupType_TrustList = init(13599);
    public static final NodeId CertificateGroupType_TrustList_Size = init(13600);
    public static final NodeId CertificateGroupType_TrustList_Writable = init(13601);
    public static final NodeId CertificateGroupType_TrustList_UserWritable = init(13602);
    public static final NodeId CertificateGroupType_TrustList_OpenCount = init(13603);
    public static final NodeId CertificateGroupType_TrustList_MimeType = init(13604);
    public static final NodeId CertificateGroupType_TrustList_Open = init(13605);
    public static final NodeId CertificateGroupType_TrustList_Open_InputArguments = init(13606);
    public static final NodeId CertificateGroupType_TrustList_Open_OutputArguments = init(13607);
    public static final NodeId CertificateGroupType_TrustList_Close = init(13608);
    public static final NodeId CertificateGroupType_TrustList_Close_InputArguments = init(13609);
    public static final NodeId CertificateGroupType_TrustList_Read = init(13610);
    public static final NodeId CertificateGroupType_TrustList_Read_InputArguments = init(13611);
    public static final NodeId CertificateGroupType_TrustList_Read_OutputArguments = init(13612);
    public static final NodeId CertificateGroupType_TrustList_Write = init(13613);
    public static final NodeId CertificateGroupType_TrustList_Write_InputArguments = init(13614);
    public static final NodeId CertificateGroupType_TrustList_GetPosition = init(13615);
    public static final NodeId CertificateGroupType_TrustList_GetPosition_InputArguments = init(13616);
    public static final NodeId CertificateGroupType_TrustList_GetPosition_OutputArguments = init(13617);
    public static final NodeId CertificateGroupType_TrustList_SetPosition = init(13618);
    public static final NodeId CertificateGroupType_TrustList_SetPosition_InputArguments = init(13619);
    public static final NodeId CertificateGroupType_TrustList_LastUpdateTime = init(13620);
    public static final NodeId CertificateGroupType_TrustList_OpenWithMasks = init(13621);
    public static final NodeId CertificateGroupType_TrustList_OpenWithMasks_InputArguments = init(13622);
    public static final NodeId CertificateGroupType_TrustList_OpenWithMasks_OutputArguments = init(13623);
    public static final NodeId CertificateGroupType_TrustList_CloseAndUpdate = init(13624);
    public static final NodeId CertificateGroupType_TrustList_CloseAndUpdate_InputArguments = init(13625);
    public static final NodeId CertificateGroupType_TrustList_CloseAndUpdate_OutputArguments = init(13626);
    public static final NodeId CertificateGroupType_TrustList_AddCertificate = init(13627);
    public static final NodeId CertificateGroupType_TrustList_AddCertificate_InputArguments = init(13628);
    public static final NodeId CertificateGroupType_TrustList_RemoveCertificate = init(13629);
    public static final NodeId CertificateGroupType_TrustList_RemoveCertificate_InputArguments = init(13630);
    public static final NodeId CertificateGroupType_CertificateTypes = init(13631);
    public static final NodeId CertificateUpdatedAuditEventType_CertificateGroup = init(13735);
    public static final NodeId CertificateUpdatedAuditEventType_CertificateType = init(13736);
    public static final NodeId ServerConfiguration_UpdateCertificate = init(13737);
    public static final NodeId ServerConfiguration_UpdateCertificate_InputArguments = init(13738);
    public static final NodeId ServerConfiguration_UpdateCertificate_OutputArguments = init(13739);
    public static final NodeId CertificateGroupFolderType = init(13813);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup = init(13814);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList = init(13815);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Size = init(13816);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Writable = init(13817);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_UserWritable = init(13818);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_OpenCount = init(13819);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_MimeType = init(13820);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Open = init(13821);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Open_InputArguments = init(
        13822
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Open_OutputArguments = init(
        13823
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Close = init(13824);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Close_InputArguments = init(
        13825
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Read = init(13826);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Read_InputArguments = init(
        13827
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Read_OutputArguments = init(
        13828
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Write = init(13829);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_Write_InputArguments = init(
        13830
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_GetPosition = init(13831);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_GetPosition_InputArguments = init(
        13832
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_GetPosition_OutputArguments = init(
        13833
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_SetPosition = init(13834);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_SetPosition_InputArguments = init(
        13835
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_LastUpdateTime = init(
        13836
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_OpenWithMasks = init(13837);
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_OpenWithMasks_InputArguments = init(
        13838
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_OpenWithMasks_OutputArguments = init(
        13839
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_CloseAndUpdate = init(
        13840
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_CloseAndUpdate_InputArguments = init(
        13841
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_CloseAndUpdate_OutputArguments = init(
        13842
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_AddCertificate = init(
        13843
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_AddCertificate_InputArguments = init(
        13844
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_RemoveCertificate = init(
        13845
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_TrustList_RemoveCertificate_InputArguments = init(
        13846
    );
    public static final NodeId CertificateGroupFolderType_DefaultApplicationGroup_CertificateTypes = init(13847);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup = init(13848);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList = init(13849);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Size = init(13850);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Writable = init(13851);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_UserWritable = init(13852);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_OpenCount = init(13853);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_MimeType = init(13854);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Open = init(13855);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Open_InputArguments = init(13856);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Open_OutputArguments = init(
        13857
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Close = init(13858);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Close_InputArguments = init(
        13859
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Read = init(13860);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Read_InputArguments = init(13861);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Read_OutputArguments = init(
        13862
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Write = init(13863);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_Write_InputArguments = init(
        13864
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_GetPosition = init(13865);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_GetPosition_InputArguments = init(
        13866
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_GetPosition_OutputArguments = init(
        13867
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_SetPosition = init(13868);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_SetPosition_InputArguments = init(
        13869
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_LastUpdateTime = init(13870);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_OpenWithMasks = init(13871);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_OpenWithMasks_InputArguments = init(
        13872
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_OpenWithMasks_OutputArguments = init(
        13873
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_CloseAndUpdate = init(13874);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_CloseAndUpdate_InputArguments = init(
        13875
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_CloseAndUpdate_OutputArguments = init(
        13876
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_AddCertificate = init(13877);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_AddCertificate_InputArguments = init(
        13878
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_RemoveCertificate = init(13879);
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_TrustList_RemoveCertificate_InputArguments = init(
        13880
    );
    public static final NodeId CertificateGroupFolderType_DefaultHttpsGroup_CertificateTypes = init(13881);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup = init(13882);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList = init(13883);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Size = init(13884);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Writable = init(13885);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_UserWritable = init(13886);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_OpenCount = init(13887);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_MimeType = init(13888);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Open = init(13889);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Open_InputArguments = init(
        13890
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Open_OutputArguments = init(
        13891
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Close = init(13892);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Close_InputArguments = init(
        13893
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Read = init(13894);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Read_InputArguments = init(
        13895
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Read_OutputArguments = init(
        13896
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Write = init(13897);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_Write_InputArguments = init(
        13898
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_GetPosition = init(13899);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_GetPosition_InputArguments = init(
        13900
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_GetPosition_OutputArguments = init(
        13901
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_SetPosition = init(13902);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_SetPosition_InputArguments = init(
        13903
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_LastUpdateTime = init(13904);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_OpenWithMasks = init(13905);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_OpenWithMasks_InputArguments = init(
        13906
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_OpenWithMasks_OutputArguments = init(
        13907
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_CloseAndUpdate = init(13908);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_CloseAndUpdate_InputArguments = init(
        13909
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_CloseAndUpdate_OutputArguments = init(
        13910
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_AddCertificate = init(13911);
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_AddCertificate_InputArguments = init(
        13912
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_RemoveCertificate = init(
        13913
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_TrustList_RemoveCertificate_InputArguments = init(
        13914
    );
    public static final NodeId CertificateGroupFolderType_DefaultUserTokenGroup_CertificateTypes = init(13915);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx = init(13916);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList = init(13917);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Size = init(13918);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Writable = init(13919);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_UserWritable = init(13920);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_OpenCount = init(13921);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_MimeType = init(13922);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Open = init(13923);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Open_InputArguments = init(
        13924
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Open_OutputArguments = init(
        13925
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Close = init(13926);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Close_InputArguments = init(
        13927
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Read = init(13928);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Read_InputArguments = init(
        13929
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Read_OutputArguments = init(
        13930
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Write = init(13931);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_Write_InputArguments = init(
        13932
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_GetPosition = init(13933);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_GetPosition_InputArguments = init(
        13934
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_GetPosition_OutputArguments = init(
        13935
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_SetPosition = init(13936);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_SetPosition_InputArguments = init(
        13937
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_LastUpdateTime = init(13938);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_OpenWithMasks = init(13939);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_OpenWithMasks_InputArguments = init(
        13940
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_OpenWithMasks_OutputArguments = init(
        13941
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_CloseAndUpdate = init(13942);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_CloseAndUpdate_InputArguments = init(
        13943
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_CloseAndUpdate_OutputArguments = init(
        13944
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_AddCertificate = init(13945);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_AddCertificate_InputArguments = init(
        13946
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_RemoveCertificate = init(13947);
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_TrustList_RemoveCertificate_InputArguments = init(
        13948
    );
    public static final NodeId CertificateGroupFolderType_xCertificateGroupx_CertificateTypes = init(13949);
    public static final NodeId ServerConfigurationType_CertificateGroups = init(13950);
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup = init(13951);
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList = init(
        13952
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Size = init(
        13953
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Writable = init(
        13954
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_UserWritable = init(
        13955
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_OpenCount = init(
        13956
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_MimeType = init(
        13957
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Open = init(
        13958
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Open_InputArguments = init(
        13959
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Open_OutputArguments = init(
        13960
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Close = init(
        13961
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Close_InputArguments = init(
        13962
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Read = init(
        13963
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Read_InputArguments = init(
        13964
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Read_OutputArguments = init(
        13965
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Write = init(
        13966
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_Write_InputArguments = init(
        13967
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition = init(
        13968
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition_InputArguments = init(
        13969
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_GetPosition_OutputArguments = init(
        13970
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_SetPosition = init(
        13971
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_SetPosition_InputArguments = init(
        13972
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_LastUpdateTime = init(
        13973
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks = init(
        13974
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks_InputArguments = init(
        13975
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_OpenWithMasks_OutputArguments = init(
        13976
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate = init(
        13977
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate_InputArguments = init(
        13978
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate_OutputArguments = init(
        13979
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_AddCertificate = init(
        13980
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_AddCertificate_InputArguments = init(
        13981
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_RemoveCertificate = init(
        13982
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_TrustList_RemoveCertificate_InputArguments = init(
        13983
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultApplicationGroup_CertificateTypes = init(
        13984
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup = init(13985);
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList = init(13986);
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Size = init(13987);
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Writable = init(
        13988
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_UserWritable = init(
        13989
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_OpenCount = init(
        13990
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_MimeType = init(
        13991
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Open = init(13992);
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Open_InputArguments = init(
        13993
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Open_OutputArguments = init(
        13994
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Close = init(
        13995
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Close_InputArguments = init(
        13996
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Read = init(13997);
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Read_InputArguments = init(
        13998
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Read_OutputArguments = init(
        13999
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Write = init(
        14000
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_Write_InputArguments = init(
        14001
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_GetPosition = init(
        14002
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_GetPosition_InputArguments = init(
        14003
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_GetPosition_OutputArguments = init(
        14004
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_SetPosition = init(
        14005
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_SetPosition_InputArguments = init(
        14006
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_LastUpdateTime = init(
        14007
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_OpenWithMasks = init(
        14008
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_OpenWithMasks_InputArguments = init(
        14009
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_OpenWithMasks_OutputArguments = init(
        14010
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_CloseAndUpdate = init(
        14011
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_CloseAndUpdate_InputArguments = init(
        14012
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_CloseAndUpdate_OutputArguments = init(
        14013
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_AddCertificate = init(
        14014
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_AddCertificate_InputArguments = init(
        14015
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_RemoveCertificate = init(
        14016
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_TrustList_RemoveCertificate_InputArguments = init(
        14017
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultHttpsGroup_CertificateTypes = init(
        14018
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup = init(14019);
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList = init(14020);
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Size = init(
        14021
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Writable = init(
        14022
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_UserWritable = init(
        14023
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenCount = init(
        14024
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_MimeType = init(
        14025
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Open = init(
        14026
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Open_InputArguments = init(
        14027
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Open_OutputArguments = init(
        14028
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Close = init(
        14029
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Close_InputArguments = init(
        14030
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Read = init(
        14031
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Read_InputArguments = init(
        14032
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Read_OutputArguments = init(
        14033
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Write = init(
        14034
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_Write_InputArguments = init(
        14035
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_GetPosition = init(
        14036
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_GetPosition_InputArguments = init(
        14037
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_GetPosition_OutputArguments = init(
        14038
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_SetPosition = init(
        14039
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_SetPosition_InputArguments = init(
        14040
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_LastUpdateTime = init(
        14041
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenWithMasks = init(
        14042
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenWithMasks_InputArguments = init(
        14043
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenWithMasks_OutputArguments = init(
        14044
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_CloseAndUpdate = init(
        14045
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_CloseAndUpdate_InputArguments = init(
        14046
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_CloseAndUpdate_OutputArguments = init(
        14047
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_AddCertificate = init(
        14048
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_AddCertificate_InputArguments = init(
        14049
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_RemoveCertificate = init(
        14050
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_TrustList_RemoveCertificate_InputArguments = init(
        14051
    );
    public static final NodeId ServerConfigurationType_CertificateGroups_DefaultUserTokenGroup_CertificateTypes = init(
        14052
    );
    public static final NodeId ServerConfiguration_CertificateGroups = init(14053);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup = init(14088);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList = init(14089);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Size = init(14090);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Writable = init(14091);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_UserWritable = init(
        14092
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_OpenCount = init(
        14093
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_MimeType = init(14094);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Open = init(14095);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Open_InputArguments = init(
        14096
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Open_OutputArguments = init(
        14097
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Close = init(14098);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Close_InputArguments = init(
        14099
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Read = init(14100);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Read_InputArguments = init(
        14101
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Read_OutputArguments = init(
        14102
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Write = init(14103);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_Write_InputArguments = init(
        14104
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_GetPosition = init(
        14105
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_GetPosition_InputArguments = init(
        14106
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_GetPosition_OutputArguments = init(
        14107
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_SetPosition = init(
        14108
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_SetPosition_InputArguments = init(
        14109
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_LastUpdateTime = init(
        14110
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_OpenWithMasks = init(
        14111
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_OpenWithMasks_InputArguments = init(
        14112
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_OpenWithMasks_OutputArguments = init(
        14113
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_CloseAndUpdate = init(
        14114
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_CloseAndUpdate_InputArguments = init(
        14115
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_CloseAndUpdate_OutputArguments = init(
        14116
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_AddCertificate = init(
        14117
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_AddCertificate_InputArguments = init(
        14118
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_RemoveCertificate = init(
        14119
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_TrustList_RemoveCertificate_InputArguments = init(
        14120
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultHttpsGroup_CertificateTypes = init(14121);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup = init(14122);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList = init(14123);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Size = init(14124);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Writable = init(
        14125
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_UserWritable = init(
        14126
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenCount = init(
        14127
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_MimeType = init(
        14128
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Open = init(14129);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Open_InputArguments = init(
        14130
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Open_OutputArguments = init(
        14131
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Close = init(
        14132
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Close_InputArguments = init(
        14133
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Read = init(14134);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Read_InputArguments = init(
        14135
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Read_OutputArguments = init(
        14136
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Write = init(
        14137
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_Write_InputArguments = init(
        14138
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_GetPosition = init(
        14139
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_GetPosition_InputArguments = init(
        14140
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_GetPosition_OutputArguments = init(
        14141
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_SetPosition = init(
        14142
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_SetPosition_InputArguments = init(
        14143
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_LastUpdateTime = init(
        14144
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenWithMasks = init(
        14145
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenWithMasks_InputArguments = init(
        14146
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_OpenWithMasks_OutputArguments = init(
        14147
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_CloseAndUpdate = init(
        14148
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_CloseAndUpdate_InputArguments = init(
        14149
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_CloseAndUpdate_OutputArguments = init(
        14150
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_AddCertificate = init(
        14151
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_AddCertificate_InputArguments = init(
        14152
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_RemoveCertificate = init(
        14153
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_TrustList_RemoveCertificate_InputArguments = init(
        14154
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultUserTokenGroup_CertificateTypes = init(
        14155
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup = init(14156);
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_Writable = init(
        14157
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_UserWritable = init(
        14158
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_MimeType = init(
        14159
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_TrustList_CloseAndUpdate_InputArguments = init(
        14160
    );
    public static final NodeId ServerConfiguration_CertificateGroups_DefaultApplicationGroup_CertificateTypes = init(
        14161
    );
    public static final NodeId AuditCreateSessionEventType_SessionId = init(14413);
    public static final NodeId AuditUrlMismatchEventType_SessionId = init(14414);
    public static final NodeId Server_ServerRedundancy_ServerNetworkGroups = init(14415);

    // Refugees from prior to OPC-UA 1.03...

    public static final NodeId ArrayTestType = init(402);
    public static final NodeId ArrayTestType_Encoding_DefaultBinary = init(404);
    public static final NodeId ArrayTestType_Encoding_DefaultXml = init(403);
    public static final NodeId CompositeTestType = init(405);
    public static final NodeId CompositeTestType_Encoding_DefaultBinary = init(407);
    public static final NodeId CompositeTestType_Encoding_DefaultXml = init(406);
    public static final NodeId ScalarTestType = init(399);
    public static final NodeId ScalarTestType_Encoding_DefaultBinary = init(401);
    public static final NodeId ScalarTestType_Encoding_DefaultXml = init(400);
    public static final NodeId TestStackRequest = init(408);
    public static final NodeId TestStackRequest_Encoding_DefaultBinary = init(410);
    public static final NodeId TestStackRequest_Encoding_DefaultXml = init(409);
    public static final NodeId TestStackResponse = init(411);
    public static final NodeId TestStackResponse_Encoding_DefaultBinary = init(413);
    public static final NodeId TestStackResponse_Encoding_DefaultXml = init(412);
    public static final NodeId TestStackExRequest = init(414);
    public static final NodeId TestStackExRequest_Encoding_DefaultBinary = init(416);
    public static final NodeId TestStackExRequest_Encoding_DefaultXml = init(415);
    public static final NodeId TestStackExResponse = init(417);
    public static final NodeId TestStackExResponse_Encoding_DefaultBinary = init(419);
    public static final NodeId TestStackExResponse_Encoding_DefaultXml = init(418);

    public static final NodeId OpcUa_BinarySchema_ArrayTestType = init(7752);
    public static final NodeId OpcUa_BinarySchema_ArrayTestType_DataTypeVersion = init(7753);
    public static final NodeId OpcUa_BinarySchema_ArrayTestType_DictionaryFragment = init(7754);
    public static final NodeId OpcUa_BinarySchema_CompositeTestType = init(7755);
    public static final NodeId OpcUa_BinarySchema_CompositeTestType_DataTypeVersion = init(7756);
    public static final NodeId OpcUa_BinarySchema_CompositeTestType_DictionaryFragment = init(7757);
    public static final NodeId OpcUa_BinarySchema_ScalarTestType = init(7749);
    public static final NodeId OpcUa_BinarySchema_ScalarTestType_DataTypeVersion = init(7750);
    public static final NodeId OpcUa_BinarySchema_ScalarTestType_DictionaryFragment = init(7751);

    public static final NodeId OpcUa_XmlSchema_ArrayTestType = init(8387);
    public static final NodeId OpcUa_XmlSchema_ArrayTestType_DataTypeVersion = init(8388);
    public static final NodeId OpcUa_XmlSchema_ArrayTestType_DictionaryFragment = init(8389);
    public static final NodeId OpcUa_XmlSchema_CompositeTestType = init(8390);
    public static final NodeId OpcUa_XmlSchema_CompositeTestType_DataTypeVersion = init(8391);
    public static final NodeId OpcUa_XmlSchema_CompositeTestType_DictionaryFragment = init(8392);
    public static final NodeId OpcUa_XmlSchema_ScalarTestType = init(8384);
    public static final NodeId OpcUa_XmlSchema_ScalarTestType_DataTypeVersion = init(8385);
    public static final NodeId OpcUa_XmlSchema_ScalarTestType_DictionaryFragment = init(8386);

    private static NodeId init(int value) {
        return new NodeId(Unsigned.ushort(0), Unsigned.uint(value));
    }

}
