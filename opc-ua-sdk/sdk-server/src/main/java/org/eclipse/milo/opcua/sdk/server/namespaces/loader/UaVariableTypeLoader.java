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

package org.eclipse.milo.opcua.sdk.server.namespaces.loader;

import java.util.Optional;

import org.eclipse.milo.opcua.sdk.core.Reference;
import org.eclipse.milo.opcua.sdk.server.api.UaNodeManager;
import org.eclipse.milo.opcua.sdk.server.model.UaVariableTypeNode;
import org.eclipse.milo.opcua.stack.core.types.builtin.ExpandedNodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.LocalizedText;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.builtin.unsigned.UInteger;
import org.eclipse.milo.opcua.stack.core.types.enumerated.NodeClass;

public class UaVariableTypeLoader {

    private final UaNodeManager nodeManager;

    public UaVariableTypeLoader(UaNodeManager nodeManager) {
        this.nodeManager = nodeManager;
    }

    private void buildNode0() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=62"),
            new QualifiedName(0, "BaseVariableType"),
            new LocalizedText("en", "BaseVariableType"),
            Optional.of(new LocalizedText("en", "The abstract base type for all variable nodes.")),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            -2,
            Optional.of(new UInteger[]{}),
            true
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=62"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=62"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=68"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=62"),
                NodeId.parse("ns=0;i=35"),
                ExpandedNodeId.parse("svr=0;i=89"),
                NodeClass.Object,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode1() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=63"),
            new QualifiedName(0, "BaseDataVariableType"),
            new LocalizedText("en", "BaseDataVariableType"),
            Optional.of(new LocalizedText("en", "The type for variable that represents a process value.")),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            -2,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=62"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=69"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=72"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3074"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3075"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3076"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3078"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3079"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3080"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3081"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3082"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3083"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3084"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3085"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3096"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3097"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3098"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3099"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3100"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3101"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3102"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3104"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3105"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3106"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3107"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3108"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3116"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3117"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3118"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3119"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3120"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3121"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3122"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3124"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3125"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3126"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3127"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3128"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12099"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12100"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12101"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12102"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12103"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12104"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12105"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12106"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12107"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12108"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12109"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12110"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12111"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12112"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12113"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12114"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12115"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12116"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12117"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12118"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12119"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12120"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12121"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12122"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12123"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12124"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12125"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12126"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12127"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12128"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12129"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12130"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12131"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12132"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12133"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12134"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12135"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12136"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12137"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12138"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12139"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12140"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12141"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12143"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12144"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12145"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12146"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12147"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12148"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12149"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12150"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12151"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3131"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3132"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3133"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3134"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3135"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3136"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3137"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3138"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3139"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3140"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3141"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3142"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3143"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8898"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11891"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3151"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3152"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3153"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3154"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3155"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3156"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3157"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3158"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3159"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3160"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3161"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3162"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3163"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3164"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3165"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3166"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3167"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3168"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3169"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3170"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3171"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3172"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3173"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3174"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3175"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3176"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3177"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3178"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3179"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3180"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3181"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3182"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3183"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3184"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3185"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3186"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3187"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2137"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2138"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2139"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2140"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2141"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3698"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3699"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3700"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3701"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3702"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3703"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2752"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2753"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=3051"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3052"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3053"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3054"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3055"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3056"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3057"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2150"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2151"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2152"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2153"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2154"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2155"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2156"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2157"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2159"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2160"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2161"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2162"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2163"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2164"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12780"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12781"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12782"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12783"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2165"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2166"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11697"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11698"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11699"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2171"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12785"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12786"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12787"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12788"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12789"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12790"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12791"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12792"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12793"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12794"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12795"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12796"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12797"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12798"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12799"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12800"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12801"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12802"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12803"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12804"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12805"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12806"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12807"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12808"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12809"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12810"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12811"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12812"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12813"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12814"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12815"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2172"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2173"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2174"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2175"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2176"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2177"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8888"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2179"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2180"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2181"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2182"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2183"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2184"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2185"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2186"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2187"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2188"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2189"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2190"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2191"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2998"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2193"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8889"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8890"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8891"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8892"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8893"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8894"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8895"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8896"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8897"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8902"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2196"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12817"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12818"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12819"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12820"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12821"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12822"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12823"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12824"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12825"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12826"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12827"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12828"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12829"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12830"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12831"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12832"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12833"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12834"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12835"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12836"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12837"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12838"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12839"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12840"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12841"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12842"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12843"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12844"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12845"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12846"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12847"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12848"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12849"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12850"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12851"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12852"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12853"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12854"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12855"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12856"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12857"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12858"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12859"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2197"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2198"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2199"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2200"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2201"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2202"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2203"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2204"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3050"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2205"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2206"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2207"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2208"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2209"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8900"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11892"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2217"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2218"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2219"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2220"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2221"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2222"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2223"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2224"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2225"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2226"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2227"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2228"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2229"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2230"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2231"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2232"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2233"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2234"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2235"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2236"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2237"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2238"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2239"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2240"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2241"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2242"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2730"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2731"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2243"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12861"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12862"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12863"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12864"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12865"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12866"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12867"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12868"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12869"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2244"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2245"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2246"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2247"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2248"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2249"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2250"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2251"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2252"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3058"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=11487"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2257"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2258"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2259"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2262"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2263"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2261"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2264"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2265"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2266"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2992"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2993"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2276"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2277"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2278"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2279"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3705"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2281"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2282"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2284"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2285"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2286"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2287"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2288"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2755"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2762"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2365"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=9002"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=63"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2380"),
                NodeClass.VariableType,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode2() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=68"),
            new QualifiedName(0, "PropertyType"),
            new LocalizedText("en", "PropertyType"),
            Optional.of(new LocalizedText("en", "The type for variable that represents a property of another node.")),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            -2,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=62"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=104"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=105"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=106"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=107"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12169"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=111"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=112"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=113"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=114"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=116"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11509"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11511"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3068"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12170"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3067"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3069"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3070"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11433"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11498"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12908"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11512"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11513"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11432"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3071"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12745"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3072"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3073"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2005"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2006"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2008"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2742"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12882"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3086"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3087"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3088"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3089"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3090"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3091"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3092"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3114"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3115"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11490"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11491"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12872"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12747"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12748"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12884"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2014"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2016"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2017"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2732"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2733"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2734"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3049"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11549"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11550"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12910"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2025"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2035"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2037"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2038"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2040"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11948"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11565"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12161"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12162"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11567"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12163"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12164"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11569"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11570"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11571"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11572"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11573"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11574"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11576"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12686"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12687"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11579"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13341"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11581"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11582"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11584"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11586"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11587"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11589"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11591"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11592"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11594"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13356"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13357"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13359"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13360"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13362"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13364"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13365"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13367"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13368"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13369"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13370"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13373"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13374"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13376"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13378"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13379"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13381"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13383"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13384"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13386"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13388"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13389"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13391"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13392"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13394"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13396"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13397"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11617"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11618"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11619"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11620"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11621"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11622"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11623"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11625"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12690"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12691"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11628"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11630"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11631"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11633"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11635"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11636"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11638"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11640"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11641"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11643"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11647"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11648"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11649"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11650"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11651"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11652"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11653"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11676"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12694"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12695"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11679"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11681"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11682"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11684"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11686"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11687"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11689"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11691"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11692"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11694"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2042"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2043"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2044"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2045"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2046"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2047"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3190"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2050"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2051"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2053"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2054"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2055"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2056"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2057"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2745"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2061"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2746"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2062"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2063"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2065"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2066"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2070"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2072"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2073"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2747"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2074"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2749"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2076"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2077"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11485"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2079"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2081"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2083"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2084"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2092"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2094"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2096"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2098"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2750"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2101"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2102"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2103"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2751"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2128"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2129"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11696"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2134"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2739"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12502"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12503"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11488"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11701"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2254"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2255"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2267"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2994"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12885"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2269"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2271"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2272"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2735"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2736"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2737"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3704"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11702"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11703"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12911"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11705"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12165"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12166"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11707"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12167"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12168"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11709"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11710"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11711"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11712"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11713"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11714"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2294"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3709"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11312"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11313"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11314"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14415"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11493"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11494"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12874"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12750"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12751"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12887"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11193"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11242"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11273"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11274"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11196"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11197"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11198"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11199"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11200"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11281"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11282"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11283"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11502"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11275"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3720"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3724"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2756"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2757"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2758"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2759"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2763"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2764"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2765"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2766"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11456"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3728"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3732"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2761"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2768"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2308"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2312"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3754"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3746"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3750"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2777"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2778"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11940"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2366"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2367"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2370"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2369"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2371"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2374"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2375"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2377"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11241"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11461"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12024"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12025"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12026"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12027"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12028"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12037"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12046"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12055"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12056"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12065"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12066"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12067"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12076"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8996"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9000"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9001"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11110"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11111"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9003"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11112"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11113"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9009"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9010"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3874"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9012"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9015"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9016"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9017"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9021"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9023"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9025"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9026"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9030"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3876"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12913"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9036"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9056"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9060"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2831"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9064"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9065"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9066"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9067"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9068"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9070"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9074"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9094"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9098"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9103"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9107"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9112"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9114"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9119"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9161"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9164"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9165"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9166"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11120"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9170"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9174"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9180"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9185"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9188"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9189"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9214"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9215"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9216"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9115"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=6098"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=6100"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=6101"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11322"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11323"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11324"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11325"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11326"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11327"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2991"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11124"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11125"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11126"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11127"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9330"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9332"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9334"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9336"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11340"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11341"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11342"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11343"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9399"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9457"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9462"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9465"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9964"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10021"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10025"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10030"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10034"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10039"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10043"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10048"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10052"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10522"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9905"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11158"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13325"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13326"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13327"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=4170"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11851"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11852"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8945"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11853"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8962"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11854"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11855"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3831"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3833"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3836"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3838"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3839"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2392"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2393"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2394"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2395"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2396"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2397"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2398"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3840"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3841"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3842"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3843"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3844"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3845"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3846"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3847"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3848"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3849"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2401"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2403"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2405"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2407"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2409"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2411"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2413"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2415"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2417"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2419"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2421"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2423"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2425"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2379"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11875"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3826"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2381"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2382"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2383"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2384"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2385"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2386"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2387"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2388"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2389"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2390"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11214"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11168"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11169"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11170"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11171"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2323"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2324"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2325"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2326"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2327"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2328"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11499"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11500"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11204"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11205"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11206"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11207"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11208"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11215"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2331"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2332"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11268"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11269"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2334"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2335"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2336"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2337"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2338"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11278"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11279"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11280"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11501"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11270"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3025"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3028"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3003"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3029"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3030"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3026"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3031"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3032"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3033"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3027"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3015"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3016"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3017"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3034"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3020"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3021"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3023"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3024"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12542"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12544"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12545"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12705"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12547"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12549"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12551"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12553"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13600"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13601"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13602"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13603"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13606"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13607"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13609"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13611"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13612"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13614"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13616"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13617"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13619"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13620"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13622"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13623"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13631"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13816"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13817"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13818"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13819"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13822"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13823"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13825"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13827"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13828"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13830"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13832"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13833"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13835"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13836"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13838"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13839"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13847"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13850"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13851"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13852"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13853"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13856"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13857"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13859"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13861"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13862"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13864"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13866"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13867"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13869"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13870"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13872"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13873"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13881"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13884"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13885"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13886"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13887"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13890"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13891"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13893"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13895"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13896"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13898"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13900"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13901"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13903"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13904"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13906"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13907"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13915"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13918"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13919"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13920"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13921"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13924"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13925"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13927"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13929"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13930"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13932"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13934"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13935"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13937"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13938"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13940"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13941"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13949"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13953"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13954"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13955"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13956"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13959"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13960"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13962"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13964"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13965"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13967"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13969"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13970"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13972"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13973"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13975"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13976"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13984"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12708"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12583"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12584"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12585"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12617"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12618"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12732"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12733"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12776"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13735"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13736"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12643"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14157"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14158"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12646"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12648"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12649"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12651"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12653"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12654"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12656"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12658"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12659"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12661"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12662"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12664"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12665"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14160"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12667"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12669"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12671"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14161"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14090"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14091"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14092"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14093"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14096"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14097"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14099"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14101"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14102"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14104"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14106"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14107"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14109"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14110"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14112"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14113"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14115"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14116"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14118"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14120"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14121"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14124"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14125"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14126"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14127"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14130"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14131"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14133"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14135"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14136"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14138"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14140"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14141"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14143"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14144"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14146"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14147"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14149"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14150"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14152"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14154"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=14155"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12710"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12639"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12640"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12641"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13738"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=13739"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12738"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12739"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12778"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11188"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11189"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11190"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11191"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7591"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11878"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7597"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7595"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7596"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7598"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11881"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11882"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7599"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7605"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11884"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11885"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11886"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7611"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7612"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12078"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7614"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8254"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=68"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7619"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode3() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=69"),
            new QualifiedName(0, "DataTypeDescriptionType"),
            new LocalizedText("en", "DataTypeDescriptionType"),
            Optional.of(
                new LocalizedText(
                    "en",
                    "The type for variable that represents the description of a data type encoding."
                )
            ),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=12"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=104"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=105"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=104"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=105"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12677"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8285"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8291"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12759"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12762"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8918"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8300"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12201"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8297"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8303"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8417"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12894"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12897"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8333"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8306"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8309"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8312"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8315"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12506"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8318"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8363"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8366"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8369"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8372"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12712"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12715"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8321"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8324"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8330"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8564"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8567"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8570"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8573"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8576"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8579"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8582"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8639"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8702"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8708"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8711"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8807"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8327"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8843"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11951"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11954"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8846"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8849"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8852"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8855"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8858"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8861"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8294"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8864"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8867"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8870"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8873"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8876"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12175"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12178"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12083"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12086"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8882"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8879"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12681"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7650"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7656"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12767"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12770"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8914"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7665"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12213"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7662"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7668"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7782"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12902"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12905"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7698"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7671"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7674"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7677"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7680"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12510"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7683"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7728"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7731"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7734"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7737"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12718"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12721"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7686"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7689"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7695"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7929"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7932"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7935"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7938"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7941"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7944"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7947"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8004"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8067"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8073"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8076"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8172"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7692"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8208"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11959"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11962"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8211"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8214"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8217"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8220"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8223"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8226"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7659"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8229"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8232"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8235"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8238"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8241"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12183"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12186"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12091"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12094"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8247"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=69"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8244"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode4() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=72"),
            new QualifiedName(0, "DataTypeDictionaryType"),
            new LocalizedText("en", "DataTypeDictionaryType"),
            Optional.of(
                new LocalizedText(
                    "en",
                    "The type for variable that represents the collection of data type decriptions."
                )
            ),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=15"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=72"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=106"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=72"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=107"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=72"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=72"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=106"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=72"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=107"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=72"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=8252"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=72"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=7617"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode5() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=8995"),
            new QualifiedName(0, "TwoStateVariableType"),
            new LocalizedText("en", "TwoStateVariableType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=21"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=8996"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=9000"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=9001"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11110"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11111"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2755"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=8996"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=9000"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=9001"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11110"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11111"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9011"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9035"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9055"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9073"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9093"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9102"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9118"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9160"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9169"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9398"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9963"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10020"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10029"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10038"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=8995"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=10047"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode6() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=9002"),
            new QualifiedName(0, "ConditionVariableType"),
            new LocalizedText("en", "ConditionVariableType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            -2,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=9002"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=9003"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=9002"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=9002"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=9003"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=9002"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9020"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=9002"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9022"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=9002"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9024"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode7() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2137"),
            new QualifiedName(0, "ServerVendorCapabilityType"),
            new LocalizedText("en", "ServerVendorCapabilityType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            -1,
            Optional.of(new UInteger[]{}),
            true
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2137"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=11562"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2137"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode8() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2138"),
            new QualifiedName(0, "ServerStatusType"),
            new LocalizedText("en", "ServerStatusType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=862"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2007"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2139"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2140"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2141"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2142"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2752"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2753"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2139"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2140"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2141"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2142"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2752"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2753"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2138"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2256"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode9() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2150"),
            new QualifiedName(0, "ServerDiagnosticsSummaryType"),
            new LocalizedText("en", "ServerDiagnosticsSummaryType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=859"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3095"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2021"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2151"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2152"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2153"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2154"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2155"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2156"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2157"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2159"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2160"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2161"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2162"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2163"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2151"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2152"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2153"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2154"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2155"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2156"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2157"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2159"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2160"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2161"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2162"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2163"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2150"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2275"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode10() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2164"),
            new QualifiedName(0, "SamplingIntervalDiagnosticsArrayType"),
            new LocalizedText("en", "SamplingIntervalDiagnosticsArrayType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=856"),
            1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2164"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2022"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2164"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=12779"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2164"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2164"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=12779"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2164"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2289"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode11() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2165"),
            new QualifiedName(0, "SamplingIntervalDiagnosticsType"),
            new LocalizedText("en", "SamplingIntervalDiagnosticsType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=856"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12779"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2166"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=11697"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=11698"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=11699"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2166"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=11697"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=11698"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2165"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=11699"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode12() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2171"),
            new QualifiedName(0, "SubscriptionDiagnosticsArrayType"),
            new LocalizedText("en", "SubscriptionDiagnosticsArrayType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=874"),
            1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2171"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3110"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2171"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2023"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2171"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12152"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2171"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2032"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2171"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=12784"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2171"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2171"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=12784"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2171"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2290"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode13() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2172"),
            new QualifiedName(0, "SubscriptionDiagnosticsType"),
            new LocalizedText("en", "SubscriptionDiagnosticsType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=874"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12784"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2173"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2174"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2175"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2176"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2177"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8888"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2179"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2180"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2181"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2182"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2183"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2184"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2185"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2186"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2187"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2188"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2189"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2190"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2191"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2998"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2193"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8889"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8890"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8891"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8892"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8893"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8894"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8895"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8896"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8897"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8902"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2173"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2174"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2175"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2176"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2177"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8888"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2179"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2180"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2181"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2182"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2183"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2184"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2185"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2186"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2187"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2188"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2189"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2190"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2191"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2998"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2193"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8889"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8890"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8891"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8892"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8893"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8894"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8895"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8896"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8897"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2172"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8902"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode14() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2196"),
            new QualifiedName(0, "SessionDiagnosticsArrayType"),
            new LocalizedText("en", "SessionDiagnosticsArrayType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=865"),
            1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2196"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3112"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2196"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3129"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2196"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2027"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2196"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=12816"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2196"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2196"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=12816"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2196"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3707"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode15() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2197"),
            new QualifiedName(0, "SessionDiagnosticsVariableType"),
            new LocalizedText("en", "SessionDiagnosticsVariableType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=865"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12098"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2030"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12816"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2198"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2199"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2200"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2201"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2202"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2203"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2204"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3050"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2205"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2206"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2207"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2208"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2209"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8900"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=11892"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2217"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2218"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2219"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2220"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2221"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2222"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2223"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2224"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2225"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2226"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2227"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2228"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2229"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2230"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2231"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2232"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2233"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2234"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2235"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2236"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2237"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2238"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2239"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2240"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2241"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2242"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2730"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2731"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2198"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2199"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2200"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2201"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2202"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2203"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2204"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3050"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2205"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2206"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2207"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2208"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2209"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=8900"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=11892"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2217"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2218"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2219"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2220"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2221"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2222"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2223"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2224"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2225"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2226"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2227"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2228"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2229"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2230"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2231"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2232"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2233"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2234"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2235"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2236"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2237"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2238"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2239"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2240"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2241"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2242"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2730"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2197"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2731"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode16() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2243"),
            new QualifiedName(0, "SessionSecurityDiagnosticsArrayType"),
            new LocalizedText("en", "SessionSecurityDiagnosticsArrayType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=868"),
            1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2243"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3113"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2243"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3130"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2243"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2028"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2243"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=12860"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2243"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2243"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=12860"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2243"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3708"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode17() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2244"),
            new QualifiedName(0, "SessionSecurityDiagnosticsType"),
            new LocalizedText("en", "SessionSecurityDiagnosticsType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=868"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12142"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2031"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=12860"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2245"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2246"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2247"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2248"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2249"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2250"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2251"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2252"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3058"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2245"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2246"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2247"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2248"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2249"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2250"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2251"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=2252"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2244"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3058"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode18() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2365"),
            new QualifiedName(0, "DataItemType"),
            new LocalizedText("en", "DataItemType"),
            Optional.of(new LocalizedText("en", "A variable that contains live automation data.")),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            -2,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2365"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2366"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2365"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2367"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2365"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2365"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2366"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2365"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2367"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2365"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2368"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2365"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2372"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2365"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12021"),
                NodeClass.VariableType,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode19() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2368"),
            new QualifiedName(0, "AnalogItemType"),
            new LocalizedText("en", "AnalogItemType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=26"),
            -2,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2368"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2370"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2368"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2369"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2368"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2371"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2368"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2365"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2368"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2370"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2368"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2369"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2368"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2371"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode20() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2372"),
            new QualifiedName(0, "DiscreteItemType"),
            new LocalizedText("en", "DiscreteItemType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            -2,
            Optional.of(new UInteger[]{}),
            true
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2372"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2365"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2372"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2373"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2372"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2376"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2372"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=11238"),
                NodeClass.VariableType,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode21() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2373"),
            new QualifiedName(0, "TwoStateDiscreteType"),
            new LocalizedText("en", "TwoStateDiscreteType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=1"),
            -2,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2373"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2374"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2373"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2375"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2373"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2372"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2373"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2374"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2373"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2375"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode22() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2376"),
            new QualifiedName(0, "MultiStateDiscreteType"),
            new LocalizedText("en", "MultiStateDiscreteType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=28"),
            -2,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2376"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2377"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2376"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2372"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2376"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2377"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode23() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2380"),
            new QualifiedName(0, "ProgramDiagnosticType"),
            new LocalizedText("en", "ProgramDiagnosticType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=894"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2399"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2381"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2382"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2383"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2384"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2385"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2386"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2387"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2388"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2389"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2390"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2381"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2382"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2383"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2384"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2385"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2386"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2387"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2388"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2389"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2380"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2390"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode24() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2755"),
            new QualifiedName(0, "StateVariableType"),
            new LocalizedText("en", "StateVariableType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=21"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2769"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2756"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2757"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2758"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2759"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2756"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2757"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2758"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2759"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2760"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2775"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2776"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2755"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=8995"),
                NodeClass.VariableType,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode25() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2760"),
            new QualifiedName(0, "FiniteStateVariableType"),
            new LocalizedText("en", "FiniteStateVariableType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=21"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2760"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2772"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2760"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2761"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2760"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2755"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2760"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2761"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2760"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9179"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2760"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9456"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2760"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3830"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode26() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2762"),
            new QualifiedName(0, "TransitionVariableType"),
            new LocalizedText("en", "TransitionVariableType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=21"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2770"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2763"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2764"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2765"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2766"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11456"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2763"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2764"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2765"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2766"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11456"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2767"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2762"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2774"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode27() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=2767"),
            new QualifiedName(0, "FiniteTransitionVariableType"),
            new LocalizedText("en", "FiniteTransitionVariableType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=21"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2767"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2773"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2767"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2768"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2767"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2762"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2767"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=2768"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2767"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9184"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2767"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=9461"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2767"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3835"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=2767"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3825"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode28() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=11238"),
            new QualifiedName(0, "MultiStateValueDiscreteType"),
            new LocalizedText("en", "MultiStateValueDiscreteType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=26"),
            -2,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11238"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11241"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11238"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11461"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11238"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2372"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11238"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11241"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11238"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11461"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode29() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=3051"),
            new QualifiedName(0, "BuildInfoType"),
            new LocalizedText("en", "BuildInfoType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=338"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=3077"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2142"),
                NodeClass.Variable,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3052"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3053"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3054"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3055"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3056"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3057"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3052"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3053"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3054"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3055"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3056"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=47"),
                ExpandedNodeId.parse("svr=0;i=3057"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=3051"),
                NodeId.parse("ns=0;i=40"),
                ExpandedNodeId.parse("svr=0;i=2260"),
                NodeClass.Variable,
                false
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode30() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=11487"),
            new QualifiedName(0, "OptionSetType"),
            new LocalizedText("en", "OptionSetType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            -1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11487"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11488"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11487"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11701"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11487"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=63"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11487"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11488"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=11487"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=11701"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode31() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=12021"),
            new QualifiedName(0, "ArrayItemType"),
            new LocalizedText("en", "ArrayItemType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            0,
            Optional.of(new UInteger[]{}),
            true
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12024"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12025"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12026"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12027"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12028"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=2365"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12024"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12025"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12026"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12027"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12028"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12029"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12038"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12047"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12057"),
                NodeClass.VariableType,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12021"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12068"),
                NodeClass.VariableType,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode32() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=12029"),
            new QualifiedName(0, "YArrayItemType"),
            new LocalizedText("en", "YArrayItemType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12029"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12037"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12029"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12021"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12029"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12037"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode33() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=12038"),
            new QualifiedName(0, "XYArrayItemType"),
            new LocalizedText("en", "XYArrayItemType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=12080"),
            1,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12038"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12046"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12038"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12021"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12038"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12046"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode34() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=12047"),
            new QualifiedName(0, "ImageItemType"),
            new LocalizedText("en", "ImageItemType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            2,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12047"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12055"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12047"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12056"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12047"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12021"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12047"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12055"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12047"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12056"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode35() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=12057"),
            new QualifiedName(0, "CubeItemType"),
            new LocalizedText("en", "CubeItemType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            3,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12057"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12065"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12057"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12066"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12057"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12067"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12057"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12021"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12057"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12065"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12057"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12066"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12057"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12067"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    private void buildNode36() {
        UaVariableTypeNode node = new UaVariableTypeNode(
            this.nodeManager,
            NodeId.parse("ns=0;i=12068"),
            new QualifiedName(0, "NDimensionArrayItemType"),
            new LocalizedText("en", "NDimensionArrayItemType"),
            Optional.empty(),
            Optional.of(UInteger.valueOf(0L)),
            Optional.of(UInteger.valueOf(0L)),
            Optional.empty(),
            NodeId.parse("ns=0;i=24"),
            0,
            Optional.of(new UInteger[]{}),
            false
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12068"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12076"),
                NodeClass.Variable,
                true
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12068"),
                NodeId.parse("ns=0;i=45"),
                ExpandedNodeId.parse("svr=0;i=12021"),
                NodeClass.VariableType,
                false
            )
        );
        node.addReference(
            new Reference(
                NodeId.parse("ns=0;i=12068"),
                NodeId.parse("ns=0;i=46"),
                ExpandedNodeId.parse("svr=0;i=12076"),
                NodeClass.Variable,
                true
            )
        );
        this.nodeManager.addNode(node);
    }

    public void buildNodes() {
        buildNode0();
        buildNode1();
        buildNode2();
        buildNode3();
        buildNode4();
        buildNode5();
        buildNode6();
        buildNode7();
        buildNode8();
        buildNode9();
        buildNode10();
        buildNode11();
        buildNode12();
        buildNode13();
        buildNode14();
        buildNode15();
        buildNode16();
        buildNode17();
        buildNode18();
        buildNode19();
        buildNode20();
        buildNode21();
        buildNode22();
        buildNode23();
        buildNode24();
        buildNode25();
        buildNode26();
        buildNode27();
        buildNode28();
        buildNode29();
        buildNode30();
        buildNode31();
        buildNode32();
        buildNode33();
        buildNode34();
        buildNode35();
        buildNode36();
    }

}
