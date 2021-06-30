package io.pkts.packet.impl;

import io.pkts.buffer.Buffer;
import io.pkts.packet.IPPacket;
import io.pkts.packet.SctpPacket;
import io.pkts.packet.TransportPacket;
import io.pkts.protocol.Protocol;

import java.io.IOException;
import java.io.OutputStream;

public class SctpPacketImpl extends TransportPacketImpl implements SctpPacket {

    protected SctpPacketImpl(IPPacket parent, Protocol protocol, Buffer headers, Buffer payload) {
        super(parent, protocol, headers, payload);
    }

    @Override
    public int getHeaderLength() {
        return 0;
    }

    @Override
    public void write(OutputStream out, Buffer payload) throws IOException {

    }

    @Override
    public TransportPacket clone() {
        return null;
    }
}
