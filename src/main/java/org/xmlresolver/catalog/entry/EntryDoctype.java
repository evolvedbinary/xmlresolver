package org.xmlresolver.catalog.entry;

import org.xmlresolver.ResolverConfiguration;
import org.xmlresolver.utils.URIUtils;

import java.net.URI;

public class EntryDoctype extends Entry {
    public final String name;
    public final URI uri;

    public EntryDoctype(ResolverConfiguration config, URI baseURI, String id, String name, String uri) {
        super(config, baseURI, id);
        this.name = name;
        this.uri = URIUtils.resolve(baseURI, uri);
    }

    @Override
    public Type getType() {
        return Type.DOCTYPE;
    }

    @Override
    public String toString() {
        return "doctype " + name + Entry.rarr + uri;
    }
}
